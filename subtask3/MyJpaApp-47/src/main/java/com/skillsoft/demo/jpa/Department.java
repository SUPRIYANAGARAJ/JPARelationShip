package com.skillsoft.demo.jpa;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
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
@EntityListeners(DepartmentListener.class)
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
