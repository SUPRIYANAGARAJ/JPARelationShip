package com.skillsoft.demo.jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.JoinColumn;

@Entity(name = "Orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String product;
	private Integer quantity;
	
	@Temporal(TemporalType.DATE)
	private Date orderDate;
	
	@OneToOne
	@JoinTable(name = "order_invoice",
	joinColumns = { @JoinColumn(name = "order_id",referencedColumnName ="id")},
	inverseJoinColumns = { @JoinColumn(name="invoice_id", referencedColumnName = "id")})
	private Invoice invoice;

	public Order() {
		super();
	}

	public Order(String product, Integer quantity, Date orderDate) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.orderDate = orderDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", product=" + product + ", quantity=" + quantity + "]";
	}

	

}


