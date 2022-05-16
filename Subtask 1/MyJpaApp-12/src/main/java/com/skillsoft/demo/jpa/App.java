package com.skillsoft.demo.jpa;

import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	
public static void main(String [] args ) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("BookstoreDB_Unit");
		
		EntityManager entityManager = factory.createEntityManager();
		
		try {
			entityManager.getTransaction().begin();
			
			Author firstAuthor = new Author("Gilad Bracha", new GregorianCalendar(1980, 1, 0).getTime());
			Address firstAddress = new Address("New York", "USA");
			firstAuthor.setAddress(firstAddress);
			
			Author secondAuthor = new Author("James Gosling", new GregorianCalendar(1975, 2, 0).getTime());
			Address secondAddress = new Address("San Francisco", "USA");
			secondAuthor.setAddress(secondAddress);
			
			entityManager.persist(firstAuthor);
			entityManager.persist(secondAuthor);
			
			Publisher firstPublisher = new Publisher("Apress");
			//set firstPublisher to be in paris, france
			firstAddress = new Address("Paris", "France");
			
			firstPublisher.setAddress(firstAddress);
			
			//set no address for second publisher 
			Publisher secondPublisher = new Publisher("Manning");
			
			
			entityManager.persist(firstPublisher);
			entityManager.persist(secondPublisher);
			
			
		} catch (Exception ex) {
			
			System.out.println("An exception occured: " +ex);
			
		} finally {
			
			entityManager.getTransaction().commit();
			
			entityManager.close();
			factory.close();
		}


}

}
