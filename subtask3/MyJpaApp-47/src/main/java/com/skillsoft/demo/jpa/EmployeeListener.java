package com.skillsoft.demo.jpa;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

public class EmployeeListener {
	
	@PrePersist
	public void onPrePersist(Employee employee) {
		System.out.println("\n********* Before persisting employee object: " + employee.getName());
	}
	
	@PostPersist
	public void onPostPersist(Employee employee) {
		System.out.println("\n********* After persisting employee object: " + employee.getName());
	}
	
	@PostLoad
	public void onPostLoad(Employee employee) {
		System.out.println("\n********* After loading the employee object: " +  employee.getName());
	}
	
	@PreUpdate
	public void onPreUpdate(Employee employee) {
		System.out.println("\n********* Before updating the employee object: " + employee.getName());
	}

	@PostUpdate
	public void onPostUpdate(Employee employee) {
		System.out.println("\n********* After updating the employee object: " + employee.getName());
	}
	
	@PreRemove
	public void onPreRemove(Employee employee) {
		System.out.println("\n********** Before removing the employee object: "+ employee.getName());
	}
	
	@PostRemove
	public void onPostRemove(Employee employee) {
		System.out.println("\n********** After removing the employee object: "+ employee.getName());
	}


}
