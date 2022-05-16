package com.skillsoft.demo.jpa;

import java.util.GregorianCalendar;

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
			
           /* Product productOne = entityManager.find(Product.class, 1);
			
			System.out.println(productOne);
			System.out.println(productOne.getOrder());
			
            Product productFive = entityManager.find(Product.class, 5);
			
			System.out.println(productFive);
			System.out.println(productFive.getOrder());*/
			

			/*Order orderOne = entityManager.find(Order.class, 1);
			
			System.out.println(orderOne);
			System.out.println(orderOne.getProducts());
			
            Order orderTwo = entityManager.find(Order.class, 2);
			
			System.out.println(orderTwo);
			System.out.println(orderTwo.getProducts());*/
			
			
			
			
           } catch (Exception ex) {
			
			System.out.println("An exception occured: " +ex);
			
		} finally {
			
			entityManager.getTransaction().commit();
			
			entityManager.close();
			factory.close();
		}

}

}
