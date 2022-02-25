package com.SpringAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Myconfiguration.class);
		College college = context.getBean("collegebean", College.class);
		Check ch = context.getBean("checks", Check.class);
		college.testing();
		//Teacher t = context.getBean("mathteacherbean", Teacher.class);
		

	}

}