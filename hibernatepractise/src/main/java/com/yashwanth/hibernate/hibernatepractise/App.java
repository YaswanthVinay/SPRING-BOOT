package com.yashwanth.hibernate.hibernatepractise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) 
	{

		// load the configuration

		Configuration configuration = new Configuration();

		configuration.configure("hibernatepractise.cfg.xml");

		// annotate the class

		configuration.addAnnotatedClass(Friends.class);

		// load the SessionFactory

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		// creating the object
		Friends friends = new Friends();

		friends.setId(100);
		friends.setLocation("Kakinada");
		friends.setName("Sastry");
		session.beginTransaction();
		session.save(friends);
		session.getTransaction().commit();
		System.out.println("added!");
	}
}
