package com.nicky.hibernate_demo_app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nicky.hibernate_demo_app.model.Car;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Project Started!");

		// config obj
		Configuration cfg = new Configuration();
		// read config and load obj
		cfg.configure("com/nicky/hibernate_demo_app/config/hibernate.cfg.xml");
		// create factory
		SessionFactory factory = cfg.buildSessionFactory();
		// open session
		Session session = factory.openSession();
		// begin transaction
		Transaction transaction = session.beginTransaction();

		// create obj
		Car car = new Car();
		car.setVin(1);
		car.setModel("Honda");
		car.setName("Civic Type R");

		Car car2 = new Car(2, "BMW", "M3");
		// save objs
		session.save(car);
		session.save(car2);

		// commit transaction
		transaction.commit();

		// close session
		session.close();

	}
}
