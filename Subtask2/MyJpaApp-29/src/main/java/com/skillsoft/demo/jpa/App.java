package com.skillsoft.demo.jpa;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	
public static void main(String args[]) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("onlineshoppingDB1_Unit");
		
		EntityManager entityManager = factory.createEntityManager();
		
		try {
			
			entityManager.getTransaction().begin();
			
			Order orderOne = new Order( new GregorianCalendar(2020, 1, 3).getTime());
			
			Product productIPhone= new Product(orderOne, "iPhone 6S", 1);
			Product productNike = new Product(orderOne, "Nike Sneakers", 2);
			
			
			Order orderTwo = new Order(new GregorianCalendar(2020, 2, 5).getTime());
			
			Product productSamsung = new Product(orderTwo,"Samsung Galaxy", 1);
			Product productCrocs = new Product(orderTwo, "Crocs", 1);
			Product productBenq = new Product(orderTwo, "BenQ Monitors", 4);
			
			
			entityManager.persist(orderOne);
            entityManager.persist(orderTwo);
            

			entityManager.persist(productIPhone);
            entityManager.persist(productNike);
            entityManager.persist(productSamsung);
            entityManager.persist(productCrocs);
            entityManager.persist(productBenq);
			
			
           } catch (Exception ex) {
			
			System.out.println("An exception occured: " +ex);
			
		} finally {
			
			entityManager.getTransaction().commit();
			
			entityManager.close();
			factory.close();
		}

}

}
