package com.DI.Annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

	public Human(Heart heart, Eyes eyes) {
		super();
		this.heart = heart;
		this.eyes = eyes;
	}

	private Heart heart;
	
	private Eyes eyes;

	@Autowired
	public void setEyes(Eyes eyes) {
		this.eyes = eyes;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void startpumping() {
		System.out.println("in method");
		heart.pump();
		eyes.watch();

	}

}
