package com.skillsoft.demo.jpa;

import javax.persistence.Entity;

public class CategoryPrice {
	
	private String name;
	private Double avgPrice;
	
	public CategoryPrice() {
		super();
	}

	public CategoryPrice(String name, Double avgPrice) {
		super();
		this.name = name;
		this.avgPrice = avgPrice;
	}

	@Override
	public String toString() {
		return "CategoryPrice [name=" + name + ", avgPrice=" + avgPrice + "]";
	}
	
	
	

}
