package com.mphasis.waleed.training;

import java.sql.*;


public class App{
	
	
	
    public static void main( String[] args ) throws Exception
    {
    	
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
		Statement st = con.createStatement();
		
		String S="Select * from employee ";
		
 
		ResultSet rs=  st.executeQuery(S);
		

		while(rs.next()) {
			int eid=rs.getInt("Id");
			String sname=rs.getString("NAME");
		String sloca=rs.getString("LOCATION");
			System.out.println(eid+"     "+sname+"    "+sloca);
			
		}
		
		con.close();
		System.out.println("executed");
			
			
}
}
