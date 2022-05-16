package com.skillsoft.demo.jpa;

import java.util.Arrays;
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
			/*TypedQuery<Long> categoryQuery = entityManager.createQuery(
					"select count(c) from Categories c ",
			 Long.class);
			
			System.out.println(categoryQuery.getSingleResult());*/
			
			//2nd
			/*TypedQuery<Double> categoryQuery = entityManager.createQuery(
					"select avg(p.price) from Products p ",
			 Double.class);
			
			
			System.out.println(categoryQuery.getSingleResult());*/
			
			//3rd
			/*Query aggQuery = entityManager.createQuery(
					"select c.name, avg(p.price) from Categories c " +
			"inner join c.products p group by c.name");
			
			@SuppressWarnings("unchecked")
			List<Object[]> resultList = aggQuery.getResultList();
			
			System.out.println();
			resultList.forEach(r -> System.out.println(Arrays.toString(r)));*/
			
			//4th
			Query aggQuery = entityManager.createQuery(
					"select c.name, max(p.price) from Categories c " +
			        "inner join c.products p group by c.name"  +
			         " having max(p.price) > ?1");
			
			aggQuery.setParameter(1, 50f);
			
			@SuppressWarnings("unchecked")
			List<Object[]> resultList = aggQuery.getResultList();
			
			System.out.println();
			resultList.forEach(r -> System.out.println(Arrays.toString(r)));
			
			//5th
			/*Query query = entityManager.createQuery(
					"select c.name, c.id from Categories c " +
			        "where exists " +
					 "(select p from Products p where p.price > ?1 and p.category.id = c.id)");
			
			query.setParameter(1, 50f);
			
			@SuppressWarnings("unchecked")
			List<Object[]> resultList = query.getResultList();
			
			System.out.println();
			resultList.forEach(r -> System.out.println(Arrays.toString(r)));*/
			
			//6th
			/*Query query = entityManager.createQuery(
					"select p.name, p.price, " +
			            "case p.category.id " +
						"when 221 then 'Mobiles and Accessories' " +
			            "when 241 then 'Home and Kitchen' " +
						"else p.category.name end " + 
			            "from Products p ");
			
			@SuppressWarnings("unchecked")
			List<Object[]> resultList = query.getResultList();
			
			System.out.println();
			resultList.forEach(r -> System.out.println(Arrays.toString(r)));*/
			
			
		} catch (Exception ex) {
			
			System.out.println("An exception occured: " +ex);
			
		} finally {
			
			
			entityManager.close();
			factory.close();
		}
}

}
