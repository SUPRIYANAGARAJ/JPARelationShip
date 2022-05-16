package com.skillsoft.demo.jpa;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(value = BookKey.class)
public class Book {
	
	@Id
	private Integer titleHash;
	@Id
	private Float price;
	
	private String author;
	private String title;
	
	public Book() {
		super();
	}

	
	public Book(String title, String author, Float price) {
		super();
		this.price = price;
		this.author = author;
		this.title = title;
		this.titleHash = Objects.hash(title);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	

}
