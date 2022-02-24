package com.SpringAnnotations.StatusCheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class def
{
	public static void main(String[] args) {
		
		
		
		ApplicationContext c= new ClassPathXmlApplicationContext("abc.xml");
		App p=c.getBean("a",App.class);
		p.check();
	}

}
