package com.DI.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class body {

	public static void main(String[] args) {
		
		
ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");

Human h=context.getBean("ab",Human.class);
h.startpumping(); 
Heart h1=context.getBean("abcd",Heart.class);
h1.newmethod();
		
	}

}
