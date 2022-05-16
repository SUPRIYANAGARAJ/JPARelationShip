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
			/*TypedQuery<Product> productQuery = entityManager.createQuery("select p from Products p where p.id = :pid", Product.class);
			productQuery.setParameter("pid", 1003);
			Product product = productQuery.getSingleResult();
			System.out.println(product);*/
			
			//2nd
			/*TypedQuery<Product> productQuery = entityManager.createQuery("select p from Products p where p.id = ?1", Product.class);
			productQuery.setParameter(1, 1005);
			Product product = productQuery.getSingleResult();
			System.out.println(product);*/
			
			//3rd
			/*TypedQuery<Product> productQuery = entityManager.createQuery("select p from Products p where p.id > :pid order by price", Product.class);
			productQuery.setParameter("pid", 1005);
			List<Product> products =  productQuery.getResultList();
			System.out.println(products);*/
			
			//4th
			/*TypedQuery<Product> productQuery = entityManager.createQuery("select p from Products p where p.id < ?1 order by price desc", Product.class);
			productQuery.setParameter(1, 1008);
			List<Product> products =  productQuery.getResultList();
			System.out.println(products);*/
			
			//5th
			/*TypedQuery<Product> productQuery = entityManager.createQuery("select p from Products p where p.name like :nameStartsWith", Product.class);
			productQuery.setParameter("nameStartsWith", "iPh%");
			List<Product> products =  productQuery.getResultList();
			System.out.println(products);*/
			
			//6th
			TypedQuery<Product> productQuery = entityManager.createQuery(
					"select p from Products p " +
			        "where p.name not like :nameSubString and p.price > :priceParameter",
			 Product.class);
			
			productQuery.setParameter("nameSubString", "iPh%");
			productQuery.setParameter("priceParameter", 10f);
			
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
