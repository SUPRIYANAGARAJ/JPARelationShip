package com.skillsoft.demo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class App {

	public static void main(String[] args) {
		
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("CompanyDB_Unit");
			
			EntityManager entityManager = factory.createEntityManager();
			
			try {
				
				//1st
				/*Department tech = entityManager.find(Department.class, 1);
				System.out.println(tech);
				
				Department operations = entityManager.find(Department.class, 2);
				System.out.println(operations);*/
				
				//2nd
				/*TypedQuery<Department> deptQuery = entityManager.createQuery(
						"select d from departments d", Department.class);
				
				List<Department> deptList = deptQuery.getResultList();
				
				System.out.println(deptList);*/
				
				//3rd
				/*TypedQuery<Employee> empQuery = entityManager.createQuery(
						"select e from employees e", Employee.class);
				
				List<Employee> empList = empQuery.getResultList();
				
				System.out.println(empList);*/
				
				//4th(update)
				/*entityManager.getTransaction().begin();
				
				Department tech = entityManager.find(Department.class, 1);
				
				tech.setName("Engineering");
				
				entityManager.merge(tech);*/
				
				//5th(update)
                /*entityManager.getTransaction().begin();
				
				Department operations = entityManager.find(Department.class, 2);
				
				operations.setName("Ops");
				
				entityManager.merge(operations);*/
				
				//6th(update)
                /*entityManager.getTransaction().begin();
				
				Department operations = entityManager.find(Department.class, 2);
				
				operations.setName("Operations");
				
				Employee elise = new Employee("Elise");
				operations.addEmployee(elise);
				
				entityManager.merge(operations);*/
				
				//7th(update)
                /*entityManager.getTransaction().begin();
				
				Employee employee = entityManager.find(Employee.class, 2);
				
				employee.setName("Zoe");

				
				entityManager.merge(employee);*/
				
				//8th
                /*entityManager.getTransaction().begin();
				
				Employee employee = entityManager.find(Employee.class, 3);
				
				entityManager.remove(employee);*/
				
				//9th
				 entityManager.getTransaction().begin();
					
				Department department = entityManager.find(Department.class, 1);
					
					entityManager.remove(department);
					
				
			} catch (Exception ex) {
				
			      System.out.println("An exception occured: " +ex);
					
				} finally {
					
					entityManager.getTransaction().commit();
					
					
				  entityManager.close();
					factory.close();
				}

	}

}
