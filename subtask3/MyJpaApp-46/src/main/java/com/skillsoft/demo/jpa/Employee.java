package com.skillsoft.demo.jpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

@Entity(name = "employees")
public class Employee implements Serializable {
	
	private static final int serialVersionUID = 1;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;

	public Employee() {
		super();
	}

	public Employee(String name) {
		super();
		this.name = name;
	}
	
	@PrePersist
	public void onPrePersist() {
		System.out.println("\n********* Before persisting employee object: " + name);
	}
	
	@PostPersist
	public void onPostPersist() {
		System.out.println("\n******** After persisting employee object: " + name);
	}
	
	@PostLoad
	public void onPostLoad() {
		System.out.println(("\n********* After loading the employee object: " + name));
	}
	
	@PreUpdate
	public void onPreUpdate() {
		System.out.println("\n********* Before updating the employee object: " +name);
	}

	@PostUpdate
	public void onPostUpdate() {
		System.out.println("\n********* After updating the employee object: " +name);
	}
	
	@PreRemove
	public void onPreRemove() {
		System.out.println("\n********** Before removing the employee object: "+name);
	}
	
	@PostRemove
	public void onPostRemove() {
		System.out.println("\n********** After removing the employee object: "+name);
	}

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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

}
