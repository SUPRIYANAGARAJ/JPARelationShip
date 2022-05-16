package com.skillsoft.demo.jpa;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

public class DepartmentListener {
	
	@PrePersist
	public void onPrePersist(Department department) {
		System.out.println("\n********* Before persisting department object: " + department.getName());
	}
	
	@PostPersist
	public void onPostPersist(Department department) {
		System.out.println("\n******** After persisting department object: " +  department.getName());
	}
	
	@PostLoad
	public void onPostLoad(Department department) {
		System.out.println("\n********* After loading department object: " +  department.getName());
	}
	
	@PreUpdate
	public void onPreUpdate(Department department) {
		System.out.println("\n********* Before updating the department object: " + department.getName());
	}

	@PostUpdate
	public void onPostUpdate(Department department) {
		System.out.println("\n********* After updating the department object: " + department.getName());
	}
	
	@PreRemove
	public void onPreRemove(Department department) {
		System.out.println("\n********** Before removing the department object: " + department.getName());
	}
	
	@PostRemove
	public void onPostRemove(Department department) {
		System.out.println("\n********** After removing the department object: " + department.getName());
	}
	

}
