package com.skillsoft.demo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class App {

@SuppressWarnings("unchecked")
public static void main(String args[]) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("onlineshoppingDB1_Unit");
		
		EntityManager entityManager = factory.createEntityManager();
		
		try {
            
			Query query = entityManager.createNativeQuery("Select * from Categories", Category.class);
			List<Category> categories = (List<Category>) query.getResultList();
			categories.forEach(System.out::println); 
			
			Query query1 = entityManager.createNativeQuery("Select * from Products", Product.class);
			List<Product> products= (List<Product>) query1.getResultList();
			products.forEach(System.out::println);
			
		} catch (Exception ex) {
			
			System.out.println("An exception occured: " +ex);
			
		} finally {
			
			
			entityManager.close();
			factory.close();
		}
			
			

}
}
