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
			
			Book firstBook = new Book( "The Java Language Specification", "Gilad Bracha", 99f);
			
			Book secondBook = new Book( "The Java Language Specification Second Edition", "Gilad Bracha, James Gosling", 119f);
			
			Book thirdBook = new Book("Core Java Volume I", "Cay S. Horstmann", 59f);
			
			
			entityManager.persist(firstBook);
			entityManager.persist(secondBook);
			entityManager.persist(thirdBook);
			
			Author firstAuthor = new Author("Gilad Bracha", new GregorianCalendar(1980, 1, 0).getTime());
			Author secondAuthor = new Author("James Gosling", new GregorianCalendar(1975, 2, 0).getTime());
			
			entityManager.persist(firstAuthor);
			entityManager.persist(secondAuthor);
			
		} catch (Exception ex) {
			
			System.out.println("An exception occured: " +ex);
			
		} finally {
			
			entityManager.getTransaction().commit();
			
			entityManager.close();
			factory.close();
		}

}
}