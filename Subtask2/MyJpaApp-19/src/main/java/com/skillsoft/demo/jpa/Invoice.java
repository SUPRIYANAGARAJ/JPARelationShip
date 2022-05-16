package com.skillsoft.demo.jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="Invoices")
public class Invoice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Float amount;
	
	private Integer invoiceId;

	public Invoice() {
		super();
	}

	public Invoice(Float amount) {
		super();
		this.amount = amount;
		this.invoiceId = ((Double)(Math.random() * 1000000)). intValue();
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
		return "Invoice [id=" + id + ", amount=" + amount + ", invoiceId=" + invoiceId + "]";
	}
	
	
	
	
}
