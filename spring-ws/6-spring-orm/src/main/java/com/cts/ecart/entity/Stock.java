package com.cts.ecart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "stock_info")
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "stock_id")
	private int stockId;
	private double stock;

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public double getStock() {
		return stock;
	}

	public void setStock(double stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stock=" + stock + "]";
	}

}
