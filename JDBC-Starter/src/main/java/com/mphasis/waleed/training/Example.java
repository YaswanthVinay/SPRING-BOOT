package com.mphasis.waleed.training;
import java.sql.*;
import java.util.Scanner;


public class Example {

	public static void main(String[] args) throws SQLException{
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
			System.out.println("issues "+e.getMessage());	
			}
			System.out.println("enter a number");
		
		int i;
		Scanner sc= new Scanner(System.in);
		i=sc.nextInt();
		
		
		Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
		Statement st = con.createStatement();
		
		 String s="select * from employee where id = '"+ i+"' ";
		 ResultSet re= st.executeQuery(s);
		 
		
		 
		 while(re.next())
		 {
		
			 System.out.println(re.getString("NAME")
					 + " from " 
					 +re.getString("LOCATION"));
		 }
		 
		 
		 
	}

}
