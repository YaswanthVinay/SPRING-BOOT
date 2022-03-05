package com.yashwanth.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.yashwanth.hibernate.ownPractise.Mobile;

/**
 * Hello world!
 *
 */
public class Read {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();

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

		

	}
}
