package com.skillsoft.demo.jpa;

import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

public static void main(String args[]) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("onlineshoppingDB1_Unit");
		
		EntityManager entityManager = factory.createEntityManager();
		
		try {
			
			/*entityManager.getTransaction().begin();
			
			Invoice invoiceOne = new Invoice(699f);
			Invoice invoiceTwo = new Invoice(67f);
			
			Order orderOne = new Order("iPhone 6S", 1, new GregorianCalendar(2020, 1, 3).getTime());
			Order orderTwo = new Order("Nike Sneakers", 2, new GregorianCalendar(2020, 2, 5).getTime());
			
			orderOne.setInvoice(invoiceOne);
			orderTwo.setInvoice(invoiceTwo);
			
			entityManager.persist(orderOne);
			entityManager.persist(orderTwo);
			
			entityManager.persist(invoiceOne);
			entityManager.persist(invoiceTwo);*/
			
			Invoice invoiceOne = entityManager.find(Invoice.class, 1);
			System.out.println(invoiceOne);
			
			Invoice invoiceTwo = entityManager.find(Invoice.class, 2);
			System.out.println(invoiceTwo);
			
			
			
			
		} catch (Exception ex) {
			
			System.out.println("An exception occured: " +ex);
			
		} finally {
			
			//entityManager.getTransaction().commit();
			
			entityManager.close();
			factory.close();
		}

	}

}
