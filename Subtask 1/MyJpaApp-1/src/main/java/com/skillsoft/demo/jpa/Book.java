package com.skillsoft.demo.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Book {
	
	private Integer id;
	private String title;
	private String author;
	
	private Float price;

	public Book() {
		super();
	}

	public Book( String title, String author, Float price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	
	//@GeneratedValue
	@Id//primary key
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name="bookstore_seq", sequenceName="BOOK_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="bookstore_seq")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
	

}
