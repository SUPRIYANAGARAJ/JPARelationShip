package com.skillsoft.demo.jpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "Products")
public class Product implements Serializable{
	
private static final int serialversionUID = 1;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;//member variables
	
	private String name;
	
	private Integer quantity;
	
	@ManyToOne
	private Order order;

	public Product() {
		super();
	}

	public Product( Order order, String name, Integer quantity) {
		super();
		this.order = order;
		this.name = name;
		this.quantity = quantity;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}

	
	


}