package com.skillsoft.demo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class App {
	
	//@SuppressWarnings("unchecked")
	public static void main(String args[]) {
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("onlineshoppingDB1_Unit");
			
			EntityManager entityManager = factory.createEntityManager();
			
			try {
	            
				Query query = entityManager.createQuery("Select c from Categories c");
				List<?> categories =  query.getResultList();
				categories.forEach(System.out::println); 
				
				Query query1 = entityManager.createQuery("Select p from Products p");
				List<?> products=  query1.getResultList();
				products.forEach(System.out::println);
				
			} catch (Exception ex) {
				
				System.out.println("An exception occured: " +ex);
				
			} finally {
				
				
				entityManager.close();
				factory.close();
			}
	}

}
