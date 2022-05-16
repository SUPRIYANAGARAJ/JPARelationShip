package com.skillsoft.demo.jpa;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class BookKey implements Serializable{
	
private static final int serialVersionUID = 1;
    
	private Integer titleHash;
   
	private Float price;
	
	public BookKey() {
		super();
	}

	public BookKey(String title, Float price) {
		super();
		this.titleHash = Objects.hash(title);
		this.price = price;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(titleHash, price);
	}
	
	@Override
	public boolean equals (Object other) {
		
		if (other == null) {
			return false;
		}
		
		if(!(other instanceof BookKey) ) {
			return false;
			
		}
		
		BookKey otherBookkey = (BookKey) other;
		
		return titleHash.equals(otherBookkey.titleHash) &&
				price.equals(otherBookkey.price);
	}
	

}
