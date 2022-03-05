package com.yashwanth.hibernateTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CRUD {
	public static void main(String[] args)

	{
		/*====Creating Data using Hibernate===============
		 * Configuration configuration=new Configuration();
		 * configuration.configure("hibernate.cfg.xml");
		 * configuration.addAnnotatedClass(TestingMyProcess.class);
		 * 
		 * SessionFactory sessionFactory=configuration.buildSessionFactory();
		 * 
		 * Session session=sessionFactory.openSession();
		 * 
		 * TestingMyProcess testingmyprocess=new TestingMyProcess();
		 * session.beginTransaction(); 
		 * testingmyprocess.setId(1212);
		 * testingmyprocess.setAge("hyderabad"); 
		 * testingmyprocess.setName("hari");
		 * session.save(testingmyprocess); 
		 * session.getTransaction().commit();
		 * System.out.println("created succesfully");
		 */

		/*======Reading Data by LOAD using Hibernate==========
		 * 		  
		 * Configuration configuration = new Configuration();

	

		configuration.configure("hibernate.cfg.xml");

		configuration.addAnnotatedClass(TestingMyProcess.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		TestingMyProcess testingMyProcess=session.load(TestingMyProcess.class,407);
		
		System.out.println(testingMyProcess);
		*/
		
		
		
		/*	======Reading Data by "GET" using Hibernate==========
		 * Configuration configuration = new Configuration();

		configuration.configure("hibernate.cfg.xml");

		configuration.addAnnotatedClass(TestingMyProcess.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();
		TestingMyProcess testingMyProcess = session.get(TestingMyProcess.class, 407);
		session.beginTransaction();
		session.save(testingMyProcess);
		session.getTransaction().commit();
		System.out.println("yes fetched the data!!");
		System.out.println(testingMyProcess);*/
		
		
		
		/*==========Updating Data  using Hibernate===============
		 * Configuration configuration= new Configuration();
		configuration.addAnnotatedClass(TestingMyProcess.class);
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		TestingMyProcess myProcess=session.get(TestingMyProcess.class, 1212);
		myProcess.setNAME("HARI BABU DOMMETI");
		session.beginTransaction()
		;
		session.update(myProcess);
		session.getTransaction().commit();
		System.out.println("updated!!");
		*/
		
		/*===========Updating done by second time================
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(TestingMyProcess.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		TestingMyProcess myProcess = session.get(TestingMyProcess.class, 1212);
		myProcess.setLOCATION("HYDERABAD");
		session.beginTransaction();

		session.update(myProcess);
		session.getTransaction().commit();
		System.out.println("updated!1");
		*/
		
		//===========Deleting the Data================
		/*
		Configuration configuration=new Configuration();
		
		configuration.addAnnotatedClass(TestingMyProcess.class);
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		TestingMyProcess testingMyProcess = session.get(TestingMyProcess.class, 1212);
		session.beginTransaction();
		session.delete(testingMyProcess);
		session.getTransaction().commit();
		System.out.println("deleted!!");
		*/
		
		
	}
}
