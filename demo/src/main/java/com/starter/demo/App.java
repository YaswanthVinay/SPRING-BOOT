package com.starter.demo;


public class App 
{
   public static void main(String[] args) {}
	

	private String name;
	private int Age;
	private int id;
	
	/*
	 * public void setAge(int age) { Age = age; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 */
	
	  public App(String name, int age) 
	  {
	  
	  this.name = name;
	  this.Age = age;
	  }
	  public App(int id)
	  {
		  this.id=id;
		  
	  }
	  
	 
	public void display()
	{
		System.out.println("student name is "+name+" and the  age is "+ Age+" with "+id);
	}
	
	

	/*
	 * public void Displayinfo() { System.out.println(); }
	 */
	
	
	
	
   
}
