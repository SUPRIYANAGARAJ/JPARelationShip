package com.skillsoft.demo.jpa;

import java.util.List;

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
					/*Query query = entityManager.createQuery("Select c from Categories c");
					System.out.println("Position of first result: " + query.getFirstResult());
					System.out.println("Max results retrieved: " + query.getMaxResults());*/
					
					//2nd
					/*Query categoryQuery = entityManager.createQuery("select c from Categories c");
					
					categoryQuery.setFirstResult(1);
					categoryQuery.setMaxResults(2);
					
					System.out.println("Position of first result: " + categoryQuery.getFirstResult());
					System.out.println("Max results retrieved: " + categoryQuery.getMaxResults());
					
					@SuppressWarnings("unchecked")
					List<Category> categoryList = (List<Category>) categoryQuery.getResultList();
					
					System.out.println(categoryList);*/
					
					//3rd
					TypedQuery<Product> productQuery = entityManager.createQuery("select p from Products p", Product.class);
					List<Product> productList = productQuery.getResultList();
					System.out.println(productList);
					
					
					
				} catch (Exception ex) {
					
					System.out.println("An exception occured: " +ex);
					
				} finally {
					
					
					entityManager.close();
					factory.close();
				}
		}


}
