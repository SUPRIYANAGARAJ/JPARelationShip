package com.skillsoft.demo.jpa;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="Orders")
public class Order {
	
private static final int serialversionUID = 1;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	//@OneToMany(fetch=FetchType.EAGER)
	@OneToMany(fetch=FetchType.LAZY)
	private List<Product> products;
	
	@Temporal(TemporalType.DATE)
	private Date orderDate;

	public Order() {
		super();
	}

	public Order(List<Product> products, Date orderDate) {
		super();
		this.products = products;
		this.orderDate = orderDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", products=" + products + ", orderDate=" + orderDate + "]";
	}
	

}
