package com.skillsoft.demo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

@SuppressWarnings("unchecked")
public static void main(String [] args ) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("BookstoreDB_Unit");
		
		EntityManager entityManager = factory.createEntityManager();
		
		try {
			/*Book bookOne = entityManager.find(Book.class, 221);
			System.out.println(bookOne);
			
			Book bookTwo = entityManager.find(Book.class, 251);
			System.out.println(bookTwo);
			
			//Doesn't exists in load.sql file
			Book bookThree = entityManager.find(Book.class, 281);
			System.out.println(bookThree);*/
			
			List<Book> books = entityManager.createQuery("Select b from Book b", Book.class).getResultList();
			
			System.out.println(books);
			
		} catch (Exception ex) {
			
			System.out.println("An exception occured: " +ex);
			
		} finally {
			
			
			entityManager.close();
			factory.close();
		}

}



}
