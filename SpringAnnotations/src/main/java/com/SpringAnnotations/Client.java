package com.SpringAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.stereotype.Component;

//@Component


public class Client {
	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(Configurationclass.class);

		System.out.println("hey i got stuck!!");

		College c = ctx.getBean( College.class);
		NehaShetty p = ctx.getBean(NehaShetty.class);
		p.Her();
		p.Heroine();
		c.teacher();

	}
}