package com.SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

	@Autowired
	private Check check;

	@Autowired

	private Teacher teacher;

	@Value("${college.Username}")
	private String Username;
	
	@Value("${college.Intrests}") 
	private String Intrests;

	/*
	 * -----------------------------------------------------------------------
	 * 
	 * -----------Setters & constructors are not req--------------------------
	 *---------------- for @autowired annotation-----------------------------
	 * 
	 * -----------------------------------------------------------------------
	 * 
	 * @Autowired
	 *  public void setTeacher(Teacher teacher) {
	 *   this.teacher = teacher;
	 * }
	 * 
	 * -----------------------By using Constructor ----------------------------
	 * 
	 * public College(Check check) {
	 * 
	 * }
	 * @Autowired 
	 * public void setCheck(Check check) 
	 * { 
	 * this.check = check;
	 * System.out.println("in setter methods");
	 *  }
	 *  */
public void testing() {
teacher.teach();
check.check();
System.out.println("i am just checking the @bean and @configuration methods");
System.out.println(" ----------------------------------------------------------");
System.out.println("my name is "+Username+'\n'+" and i am much more intrsted in "+Intrests+"  she is my crush!!");

	}

}