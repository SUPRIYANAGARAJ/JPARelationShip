package com.skillsoft.demo.jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Author {
	
	private Integer id;
	private String name;
	private Date birthDate;
	
	public Author() {
		
	}

	public Author(String name, Date birthDate) {
		super();
		this.name = name;
		this.birthDate = birthDate;
	}

	@Id
	@TableGenerator(name="bookstore_generator",
	table="bookstore_table",
	pkColumnName="gen_name",
	pkColumnValue="author_id",
	valueColumnName="gen_val",
	allocationSize=100)
	@GeneratedValue(strategy = GenerationType.TABLE, generator="bookstore_generator")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	

}
