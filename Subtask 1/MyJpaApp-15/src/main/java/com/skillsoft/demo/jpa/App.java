package com.skillsoft.demo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	
	
	public static void main(String [] args ) {
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("BookstoreDB_Unit");
			
			EntityManager entityManager = factory.createEntityManager();
			
			try {
				Book bookOne = entityManager.find(Book.class, 221);
				System.out.println(bookOne);
				
				Book bookTwo = entityManager.find(Book.class, 251);
				System.out.println(bookTwo);
				
				entityManager.getTransaction().begin();
				
				//to update
				/*bookOne.setPrice(25.22f);
				bookTwo.setTitle("Core Java Volume I - Fundamentals");
				
				entityManager.merge(bookOne);
				entityManager.merge(bookTwo);*/
				
				//to delete
				if (bookOne != null) {
					entityManager.remove(bookOne);
				}
				
				if (bookOne != null) {
					entityManager.remove(bookTwo);
				}
				
			} catch (Exception ex) {
				
				System.out.println("An exception occured: " +ex);
				
			} finally {
				
				entityManager.getTransaction().commit();
				
				entityManager.close();
				factory.close();
			}

	}

}
