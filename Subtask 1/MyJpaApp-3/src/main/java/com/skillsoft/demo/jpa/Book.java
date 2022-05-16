package com.skillsoft.demo.jpa;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	
	//@Id
	@EmbeddedId
	private BookKey bookKey;
	
	private String author;
	private String title;
	
	public Book() {
		super();
	}

	public Book( String title, String author, Float price) {
		super();
		this.bookKey = new BookKey(title, price);
		this.author = author;
		this.title = title;
	}

	public BookKey getBookKey() {
		return bookKey;
	}

	public void setBookKey(BookKey bookKey) {
		this.bookKey = bookKey;
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
