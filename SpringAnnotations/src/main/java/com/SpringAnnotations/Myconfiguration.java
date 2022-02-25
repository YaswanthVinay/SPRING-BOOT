package com.SpringAnnotations;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:property.properties")
public class Myconfiguration {

	@Bean
	public Teacher mathteacherbean() {

		return new MathTeacher();
	}

	@Bean
	public College collegebean() {

		College college = new College();
		/*college.setTeacher(mathteacherbean());
		college.setCheck(checks());*/
		return college;
	}

	@Bean
	public Check checks() {

		return new Check();
	}
}