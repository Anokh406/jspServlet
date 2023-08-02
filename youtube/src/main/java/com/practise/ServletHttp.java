package com.practise;
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
//package com.practise;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import jakarta.servlet.*;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//@SuppressWarnings("serial")
//@WebServlet("/RegisterServlet")
//public class ServletHttp extends HttpServlet {
//
//public void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
//{
//	resp.setContentType("text/html");
//	PrintWriter out=resp.getWriter();
//	out.println("<h1>welcome to Servlet</h1>");
//	String name=req.getParameter("user_name");
//	String password=req.getParameter("password");
//	String gender=req.getParameter("gender");
//	String course=req.getParameter("course");
//	String cond=req.getParameter("checkbox");
//	if(cond!=null) {
//		
//	
//	if(cond.contentEquals("checkbox")) {
//		out.println("Name"+name);
//		out.println("Password"+password);
//		out.println("Gender"+gender);
//		out.println("Course"+course);
//	}else {
//		out.println("<h2>You are not accepted the terms and conditions  </h2>");
//	}}
//	else {
//		out.println("<h2>You are not accepted the terms and conditions  </h2>");
//	}
//}
//}
