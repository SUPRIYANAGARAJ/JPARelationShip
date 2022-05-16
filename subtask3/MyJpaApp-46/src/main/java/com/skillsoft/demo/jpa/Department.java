package com.skillsoft.demo.jpa;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

@Entity(name = "departments")
public class Department implements Serializable {
	
	private static final int serialVersionUID = 1;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "department_id")
	private Set<Employee> employees;

	public Department() {
		super();
	}

	public Department(String name) {
		super();
		this.name = name;
	}
	
	@PrePersist
	public void onPrePersist() {
		System.out.println("\n********* Before persisting department object: " + name);
	}
	
	@PostPersist
	public void onPostPersist() {
		System.out.println("\n******** After persisting department object: " + name);
	}
	
	@PostLoad
	public void onPostLoad() {
		System.out.println(("\n********* After loading department object: " + name));
	}
	
	@PreUpdate
	public void onPreUpdate() {
		System.out.println("\n********* Before updating the department object: " +name);
	}

	@PostUpdate
	public void onPostUpdate() {
		System.out.println("\n********* After updating the department object: " +name);
	}
	
	@PreRemove
	public void onPreRemove() {
		System.out.println("\n********** Before removing the department object: "+name);
	}
	
	@PostRemove
	public void onPostRemove() {
		System.out.println("\n********** After removing the department object: "+name);
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

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
    public void addEmployee(Employee employee) {
    	
    	if (employees == null) {
    		employees = new HashSet<>();
    	}
    	
    	employees.add(employee);
    }

	@Override
	public String toString() {
		return "Department [name=" + name + ", employees=" + employees + "]";
	}
    
    

}
