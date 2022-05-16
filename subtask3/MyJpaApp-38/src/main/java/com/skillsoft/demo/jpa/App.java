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
			/*TypedQuery<Product> productQuery = entityManager.createQuery(
					"select p from Products p " +
			        "where p.category.id = :category_id",
			 Product.class);
			
			productQuery.setParameter("category_id", 231);
			
			
			List<Product> products =  productQuery.getResultList();
			System.out.println(products);*/
			
			//2nd
			/*TypedQuery<Product> productQuery = entityManager.createQuery(
					"select p from Products p " +
			        "where p.category.id = ?1",
			 Product.class);
			
			productQuery.setParameter(1, 231);
			
			
			List<Product> products =  productQuery.getResultList();
			System.out.println(products);*/
			
			//3rd
			TypedQuery<Product> productQuery = entityManager.createQuery(
					"select p from Products p " +
			        "where p.category.id = ?1 and " +
							"p.price > ?2" ,
			                 Product.class);
			
			productQuery.setParameter(1, 231);
			productQuery.setParameter(2, 10f);
			
			
			List<Product> products =  productQuery.getResultList();
			System.out.println(products);
			
			
			
			
			
		} catch (Exception ex) {
			
			System.out.println("An exception occured: " +ex);
			
		} finally {
			
			
			entityManager.close();
			factory.close();
		}
}
		}

