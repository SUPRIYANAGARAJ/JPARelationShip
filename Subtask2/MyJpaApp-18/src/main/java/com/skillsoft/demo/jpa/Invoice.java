package com.skillsoft.demo.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Invoices")
public class Invoice {
	
private static final int serialVersionUID = 1;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Float amount;

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

	

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", amount=" + amount + "]";
	}
	

}
