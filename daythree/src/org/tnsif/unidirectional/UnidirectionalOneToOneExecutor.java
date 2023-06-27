package org.tnsif.unidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class UnidirectionalOneToOneExecutor {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Customer c=new Customer();
		c.setName("Prabal");
		
		Address a=new Address();
		a.setPincode(455454);
		a.setCity("Boisar");
		a.setArea("Keshav nagar");
		
		c.setAddress(a);
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully");
		em.close();
		factory.close();
		
		
	}

}