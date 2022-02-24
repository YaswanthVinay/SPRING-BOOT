package com.DI.ObjectiveInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
	public static void main(String[] args) {
		
	ApplicationContext context=new ClassPathXmlApplicationContext("comfig.xml");
	Student stua=context.getBean("stua",Student.class);
	stua.cheating();
	
	
	System.out.println("succesfully completed cheating");

		

	}

}
//
//ApplicationContext con= new ClassPathXmlApplicationContext("config.xml");
//
//
//App abcs=con.getBean("abc",App.class);