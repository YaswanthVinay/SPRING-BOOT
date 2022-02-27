package com.JdbcDemo.jdbc;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
	ApplicationContext ac=new ClassPathXmlApplicationContext("xml.xml");
	
	App a=ac.getBean("ram",App.class);
	a.method1();
	((ClassPathXmlApplicationContext)ac).close();

	
	
	}
}
