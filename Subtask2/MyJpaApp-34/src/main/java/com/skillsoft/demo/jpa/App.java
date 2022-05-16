package com.skillsoft.demo.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	
public static void main(String args[]) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("onlineshoppingDB1_Unit");
		
		EntityManager entityManager = factory.createEntityManager();
		
		try {
            
			/*entityManager.getTransaction().begin();
			
			Product productIPhone = new Product("iPhone 6S");
			Product productNike = new Product("Nike Sneakers");
			Product productCrocs = new Product("Crocs");
			Product productBenq = new Product("BenQ Monitors");
			Product productSamsung = new Product("Samsung Galaxy");
			
			
			
			List<Product> listJohn = new ArrayList<Product>();
			List<Product> listJulie = new ArrayList<Product>();
			List<Product> listBen = new ArrayList<Product>();
			
			listJohn.add(productIPhone);
			listJohn.add(productNike);
			listJohn.add(productCrocs);
			
			Customer customerJohn = new Customer("John", listJohn);
			
			listJulie.add(productIPhone);
			listJulie.add(productSamsung);
			
			Customer customerJulie = new Customer("Julie", listJulie);
			
			listBen.add(productIPhone);
			listBen.add(productBenq);
			listBen.add(productCrocs);
			
			Customer customerBen = new Customer("Ben", listBen);
			
			entityManager.persist(customerJohn);
            entityManager.persist(customerJulie);
            entityManager.persist(customerBen);
            

			entityManager.persist(productIPhone);
            entityManager.persist(productNike);
            entityManager.persist(productSamsung);
            entityManager.persist(productCrocs);
            entityManager.persist(productBenq);*/
			
			/*Customer customerOne = entityManager.find(Customer.class,1);
			
			System.out.println(customerOne);
			System.out.println(customerOne.getProducts()); 
			
            Customer customerThree= entityManager.find(Customer.class,3);
			
			System.out.println(customerThree);
			System.out.println(customerThree.getProducts()); */
			
			Product productOne = entityManager.find(Product.class, 1);
 			
			System.out.println(productOne);
			System.out.println(productOne.getCustomers());
			
			Product productFive = entityManager.find(Product.class, 5);
			
			System.out.println(productFive);
			System.out.println(productFive.getCustomers());
			
		} catch (Exception ex) {
    			
    			System.out.println("An exception occured: " +ex);
    			
    		} finally {
    			
    			//entityManager.getTransaction().commit();
    			
    			entityManager.close();
    			factory.close();
    		}

    }
}
