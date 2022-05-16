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
			firstAuthor.setBio("Some very long personal bio here");
			firstAuthor.setImage("Pretend this is an image".getBytes());
			
			Author secondAuthor = new Author("James Gosling", new GregorianCalendar(1975, 2, 0).getTime());
			secondAuthor.setImage("Pretend this is also an image".getBytes());
			
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