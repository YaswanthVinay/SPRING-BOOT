package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/Sqr")
public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		HttpSession r= req.getSession();
		int s= (int)r.getAttribute("s");
		s=s*s;
		
		
		
		PrintWriter out =res.getWriter();
		out.println("Result is "+s);
	
	}
	
}
