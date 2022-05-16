package com.skillsoft.demo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class App {
	
public static void main(String args[]) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("onlineshoppingDB1_Unit");
		
		EntityManager entityManager = factory.createEntityManager();
		
		try {
			
			//1st
			/*TypedQuery<Category> categoryQuery = entityManager.createQuery(
					"select c from Categories c " +
			        "inner join c.products",
			 Category.class);
			
			List<Category> categories =  categoryQuery.getResultList();
			System.out.println(categories);*/
			
			//2nd
			/*TypedQuery<Category> categoryQuery = entityManager.createQuery(
					"select c from Categories c " +
			        "inner join c.products p " +
			        "where p.price > ?1"  ,
			 Category.class);
			
			categoryQuery.setParameter(1, 80f);
			
			List<Category> categories =  categoryQuery.getResultList();
			System.out.println(categories);*/
			
			//3rd
			/*TypedQuery<Category> categoryQuery = entityManager.createQuery(
					"select c from Categories c " +
			        "inner join c.products p " +
					"where c.name = ?1 " +
			        "and p.price > ?2" ,
			       Category.class);
			
			categoryQuery.setParameter(1, "Fashion");
			categoryQuery.setParameter(2, 60f);
			
			
			List<Category> categories =  categoryQuery.getResultList();
			System.out.println(categories);*/
			
			//4th
			/*TypedQuery<Category> categoryQuery = entityManager.createQuery(
					"select c from Categories c " +
			        "inner join fetch c.products p " +
					"where c.name = ?1 " +
			        "and p.price > ?2" ,
			       Category.class);
			
			categoryQuery.setParameter(1, "Fashion");
			categoryQuery.setParameter(2, 60f);
			
			
			List<Category> categories =  categoryQuery.getResultList();
			System.out.println(categories);*/
			
			//5th
			TypedQuery<Category> categoryQuery = entityManager.createQuery(
					"select c from Categories c " +
			        "inner join c.products p " +
					"where p.name in (?1, ?2, ?3)" ,
			       Category.class);
			
			categoryQuery.setParameter(1, "Samsung Galaxy");
			categoryQuery.setParameter(2, "Jeans");
			categoryQuery.setParameter(3, "Notebook");
			
			
			List<Category> categories =  categoryQuery.getResultList();
			System.out.println(categories);
			
			
       } catch (Exception ex) {
			
			System.out.println("An exception occured: " +ex);
			
		} finally {
			
			
			entityManager.close();
			factory.close();
		}
}

}
