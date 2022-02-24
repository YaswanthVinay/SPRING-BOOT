package com.SpringAnnotations.StatusCheck;


public class App 
{
	private String Name;
	
	public void check()
	{
		System.out.println("i am checking "+Name);
	}

	public void setName(String name) {
		Name = name;
	}
}
