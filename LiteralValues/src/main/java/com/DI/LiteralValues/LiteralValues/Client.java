package com.DI.LiteralValues.LiteralValues;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

		Student st = ctx.getBean("student", Student.class);

		st.Displayinfo();
		
	}
}