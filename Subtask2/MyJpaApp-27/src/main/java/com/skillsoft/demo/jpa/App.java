package com.skillsoft.demo.jpa;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	
public static void main(String args[]) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("onlineshoppingDB1_Unit");
		
		EntityManager entityManager = factory.createEntityManager();
		
		try {
			
			Order orderOne = entityManager.find(Order.class, 1);
			System.out.println(orderOne);
			Order orderTwo = entityManager.find(Order.class, 2);
			System.out.println(orderTwo);
			
           } catch (Exception ex) {
			
			System.out.println("An exception occured: " +ex);
			
		} finally {
			
			entityManager.close();
			factory.close();
		}

}


}
