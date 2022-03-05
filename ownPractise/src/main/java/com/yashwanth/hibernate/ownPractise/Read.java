package com.yashwanth.hibernate.ownPractise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Read {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();

		configuration.configure("ownhibernate.cfg.xml");

		configuration.addAnnotatedClass(Mobile.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();
		Mobile mobile=session.get(Mobile.class,408);
		session.beginTransaction();
		session.save(mobile);
		session.getTransaction().commit();
		System.out.println(mobile);
		/*
		 * Mobile mobile= session.get(Mobile.class,111);
		session.beginTransaction();
		session.save(mobile);
		session.getTransaction().commit();
		System.out.println("yes fetched the data!!");
		System.out.println(mobile);

		*/
	/*	Configuration configuration = new Configuration();

		configuration.configure("ownhibernate.cfg.xml");

		configuration.addAnnotatedClass(Mobile.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();
		Mobile mobile= session.get(Mobile.class,111);
		session.beginTransaction();
		session.save(mobile);
		session.getTransaction().commit();
		System.out.println("yes fetched the data!!");
		System.out.println(mobile);
		
*/
	}
}
