package com.DI.LiteralValues.LiteralValues;


import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	
	@Value("${student.name}")
	private String name;
	
	
	@Value("${student.intrestedcourse}")
	private String intrestedcourse;
	
	@Value("${student.hobby}")
	private String hobby;


//
//	public void setName(String name) {
//		this.name = name;
//	}

	
//	public void setIntrestedcourse(String intrestedcourse) {
//		this.intrestedcourse = intrestedcourse;
//	}

	
//	public void setHobby(String hobby) {
//		this.hobby = hobby;
//	}

	public void Displayinfo() {
		System.out.println(
				"Student Name is " + name + " he is intrested in " + intrestedcourse + " and his hobbies are " + hobby);
	}
}
