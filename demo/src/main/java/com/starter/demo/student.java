package com.starter.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class student 
{
	public static void main(String[] args) {
		
	
	ApplicationContext con= new ClassPathXmlApplicationContext("config.xml");
	

App abcs=con.getBean("abc",App.class);
	
	App abc=con.getBean("abcs",App.class);
	abc.display();
	
	
	
	abcs.display();
//	abcs.Displayinfo();
	
	
	}
	
}
