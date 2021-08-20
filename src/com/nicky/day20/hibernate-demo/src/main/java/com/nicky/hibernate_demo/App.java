package com.nicky.hibernate_demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nicky.hibernate_demo.model.Address;
import com.nicky.hibernate_demo.model.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Project Started");
		// config obj
		Configuration cfg = new Configuration();
		// read configuration and load obj
		cfg.configure("com/nicky/hibernate_demo/config/hibernate.cfg.xml");

		// create factory
		SessionFactory factory = cfg.buildSessionFactory();

	

		//open session
		Session session = factory.openSession();
		//begin transaction
		Transaction transaction = session.beginTransaction();
		
//		// Create Employee Object
//		Employee employee = new Employee();
//		employee.setId(2);
//		employee.setName("Sally");
//		employee.setEmail("s@gmail.com");
//		
//		//create address obj
//		Address address = new Address();
//		address.setCity("philadelphia");
//		address.setStreet("1234 s Broad St");
//		address.setOpen(true);
//		address.setCreated(new Date());
//		address.setKeepOutOfTable(123.123);
//		
//		//save the employee and address
//		session.save(employee);
//		session.save(address);
		
		//fetching data
		Address address1 = session.get(Address.class, 1); //exists
		System.out.println(address1);
		
		//does not exist returns null
		//Address address2 = session.get(Address.class, 2); 
		
		//does not exist will throw exception
		Address address2 = session.load(Address.class, 2); 
		System.out.println(address2);
		
		//commit transaction
		transaction.commit();
		
		//close session
		session.close();
		
		
//		System.out.println(employee);
//		System.out.println(address);
		
//        System.out.println(factory);
//        System.out.println(factory.isClosed());
	}
}
