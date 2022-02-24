package com.SpringAnnotations;

import org.springframework.context.annotation.Bean;

//import org.springframework.stereotype.Component;
//
//@Component("l")
public class College {
	
	private NehaShetty actor;

	@Bean
	public void teacher() {
		

			actor.Heroine();
			System.out.println("Teacher is looking gorgioius");

		
	}

	public void setActor(NehaShetty actor) {
		this.actor = actor;
	}

	
}
