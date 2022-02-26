package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/add")
public class AddServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		
		int i =Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
	
		int s=i*j;
		
		
		HttpSession r = req.getSession();
		r.setAttribute("s", s);
//	
		res.sendRedirect("Sqr?s="+s);
//		
//			
//		req.setAttribute("k", s);
//		
//		
//		RequestDispatcher rd= req.getRequestDispatcher("Sqr");
//		rd.forward(req, res);
//		
		
		
	}

}
