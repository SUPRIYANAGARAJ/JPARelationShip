package com.skillsoft.demo.jpa;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	@Basic(fetch=FetchType.LAZY)
	@Lob
	private String bio;
	
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	@Basic(fetch=FetchType.LAZY)
	@Lob
	private byte[] image;

	public Author() {
		super();
	}

	public Author(String name, Date birthDate) {
		super();
		this.name = name;
		this.birthDate = birthDate;
	}


	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	
	

	
	
	

}
