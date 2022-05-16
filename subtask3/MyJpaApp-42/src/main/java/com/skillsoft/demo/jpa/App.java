package com.skillsoft.demo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class App {
	
public static void main(String args[]) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("onlineshoppingDB1_Unit");
		
		EntityManager entityManager = factory.createEntityManager();
		
		try {
			//1st
			/*Query categoryQuery = entityManager.createNamedQuery("selectSpecificCategory");
			
			categoryQuery.setParameter("categoryName", "Fashion");
			
			System.out.println(categoryQuery.getResultList());*/
			
			//2nd
			/*TypedQuery<Category> categoryQuery = entityManager.createNamedQuery(
					Category.SELECT_SPECIFIC_CATEGORY, Category.class);
			
			categoryQuery.setParameter("categoryName", "Fashion");
			
			System.out.println(categoryQuery.getSingleResult());*/
			
			//3rd
			TypedQuery<Product> productQuery1 = entityManager.createNamedQuery(
					Product.SELECT_PRODUCTS_IN_CATEGORY, Product.class);
			
			productQuery1.setParameter("categoryId", 231);
			
			System.out.println(productQuery1.getResultList());
			
			TypedQuery<Product> productQuery2 = entityManager.createNamedQuery(
					Product.SELECT_PRODUCTS_IN_PRICE_RANGE, Product.class);
			
			productQuery2.setParameter("low", 100f);
			productQuery2.setParameter("high", 1000f);
			
			System.out.println(productQuery2.getResultList());
			
			
      
		} catch (Exception ex) {
			
			System.out.println("An exception occured: " +ex);
			
		} finally {
			
			
			entityManager.close();
			factory.close();
		}
}

}
