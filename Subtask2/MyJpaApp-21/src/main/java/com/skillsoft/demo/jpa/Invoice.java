package com.skillsoft.demo.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity(name = "Invoices")
public class Invoice {
	
	@Id
	private Integer id;
	
	private Float amount;
	
	@OneToOne
	@MapsId
	private Order order;

	public Invoice() {
		super();
	}
	
	public Invoice(Float amount) {
		super();
		this.amount = amount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", amount=" + amount + ", order=" + order + "]";
	}

	
	
	

}
