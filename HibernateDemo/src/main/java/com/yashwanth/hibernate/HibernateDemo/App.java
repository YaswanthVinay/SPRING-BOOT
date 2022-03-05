package com.yashwanth.hibernate.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {

		// create a configuration

		Configuration configuration = new Configuration();

		configuration.configure("hibernate.cfg.xml");

		configuration.addAnnotatedClass(employee.class);

		// Create Session factory with the help of configuration

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// create a session object

		Session session = sessionFactory.openSession();

		employee employee = new employee();

		employee.setID(999);

		employee.setNAME("Lakshmi");

		employee.setLOCATION("Amp");

		session.beginTransaction();

		session.save(employee);

		session.getTransaction().commit();

		System.out.println("saved!!");
	}
}
