package com.cts.ecart.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cts.ecart.model.Product;

@Controller
@SessionAttributes("message")
public class ProductController {
	
	
	@RequestMapping("/loadProductForm")
	public String loadProductForm() {
		return "product-form";
	}
	
	@RequestMapping("/saveProduct")
	public String saveProduct(@RequestParam String productName,@RequestParam double price,@RequestParam String description) {
		System.out.println(">>> name: "+productName);
		System.out.println(price);
		System.out.println(description);
		return "product-form";
	}
	
	@PostMapping("/saveProductV1")
	public String saveProductV1(@ModelAttribute Product prod,Model model) {
		System.out.println(prod);
		model.addAttribute("product", prod);
		return "product-form";
	}
	
	
	
	@RequestMapping(value = "/s1")
	public void f1() {
		System.out.println(">>>ProductController :: f1 method..");
	}
	
	@RequestMapping(value = "/s2")
	public String f2(Model model,HttpSession session) {
		
		model.addAttribute("user", "Admin"); // request object
		session.setAttribute("city", "London");
		
		return "one";
	}
	
	@RequestMapping(value = "/s3")
	public String f3(Model model) {
		model.addAttribute("message", "Message from Controller class"); // request object
		return "two";
	}

}
