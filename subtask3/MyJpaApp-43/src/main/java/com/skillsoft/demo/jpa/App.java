package com.skillsoft.demo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class App {
	
public static void main(String args[]) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("onlineshoppingDB1_Unit");
		
		EntityManager entityManager = factory.createEntityManager();
		
		try {
			//1st
			/*CriteriaBuilder cb = entityManager.getCriteriaBuilder();
			
			CriteriaQuery<Category> categoryCQ = cb.createQuery(Category.class);
			
			Root<Category> rootCategory = categoryCQ.from(Category.class);
			
			categoryCQ.select(rootCategory);
			
			TypedQuery<Category> categoryQuery = entityManager.createQuery(categoryCQ);
			
			System.out.println(categoryQuery.getResultList());*/
			
			//2nd
           /*CriteriaBuilder cb = entityManager.getCriteriaBuilder();
			
			CriteriaQuery<Product> productCQ = cb.createQuery(Product.class);
			
			Root<Product> rootProduct= productCQ.from(Product.class);
			
			productCQ.select(rootProduct);
			
			TypedQuery<Product> productQuery = entityManager.createQuery(productCQ);
			
			System.out.println(productQuery.getResultList());*/
			
			//3rd
           /*CriteriaBuilder cb = entityManager.getCriteriaBuilder();
			
			CriteriaQuery<Product> productCQ = cb.createQuery(Product.class);
			
			Root<Product> rootProduct= productCQ.from(Product.class);
			
			productCQ.select(rootProduct)
			.where(cb.equal(rootProduct.get("id"), 1011));
			
			TypedQuery<Product> productQuery = entityManager.createQuery(productCQ);
			
			System.out.println(productQuery.getResultList());*/
			
			//4th
			 /*CriteriaBuilder cb = entityManager.getCriteriaBuilder();
				
				CriteriaQuery<Product> productCQ = cb.createQuery(Product.class);
				
				Root<Product> rootProduct= productCQ.from(Product.class);
				
				productCQ.select(rootProduct)
				.where(cb.greaterThan(rootProduct.get("price"), 5));
				
				TypedQuery<Product> productQuery = entityManager.createQuery(productCQ);
				
				System.out.println(productQuery.getResultList());*/
				
			   //5th
               /*CriteriaBuilder cb = entityManager.getCriteriaBuilder();
				
				CriteriaQuery<Product> productCQ = cb.createQuery(Product.class);
				
				Root<Product> rootProduct= productCQ.from(Product.class);
				
				Predicate equalToPredicate = cb.equal(rootProduct.get("category"), 261);
				
				productCQ.select(rootProduct)
				.where(equalToPredicate);
				
				TypedQuery<Product> productQuery = entityManager.createQuery(productCQ);
				
				System.out.println(productQuery.getResultList());*/
				
				//6th
                /*CriteriaBuilder cb = entityManager.getCriteriaBuilder();
				
				CriteriaQuery<Product> productCQ = cb.createQuery(Product.class);
				
				Root<Product> rootProduct= productCQ.from(Product.class);
				
				Predicate equalToPredicate = cb.equal(rootProduct.get("category"), 261);
				
				productCQ.select(rootProduct)
				.where(equalToPredicate.not());
				
				TypedQuery<Product> productQuery = entityManager.createQuery(productCQ);
				
				System.out.println(productQuery.getResultList());*/
			
				//7th
			CriteriaBuilder cb = entityManager.getCriteriaBuilder();
			
			CriteriaQuery<Product> productCQ = cb.createQuery(Product.class);
			
			Root<Product> rootProduct= productCQ.from(Product.class);
			
			productCQ.select(rootProduct)
			.orderBy(cb.asc(rootProduct.get("price")));
			
			TypedQuery<Product> productQuery = entityManager.createQuery(productCQ);
			
			System.out.println(productQuery.getResultList());
		
		
		} catch (Exception ex) {
			
	      System.out.println("An exception occured: " +ex);
			
		} finally {
			
		  entityManager.close();
			factory.close();
		}
}

}
