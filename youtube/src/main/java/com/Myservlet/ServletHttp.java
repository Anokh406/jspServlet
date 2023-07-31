package com.Myservlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import jakarta.servlet.http.HttpServlet;
@SuppressWarnings("serial")
public class ServletHttp extends HttpServlet{
public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
{
	System.out.println("The doGet method is working using servlet");
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	out.println("<h1>Do Get method is working..</h1>");
	
	
}
}
	