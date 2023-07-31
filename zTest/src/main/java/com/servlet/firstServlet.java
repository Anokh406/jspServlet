//package com.servlet;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.time.LocalDate;
//
//import org.apache.coyote.Response;
//
//import jakarta.servlet.*;
//
//@SuppressWarnings("unused")
//public class firstServlet implements Servlet{
//	//Life cycle methods 
//	ServletConfig conf;
//	public void init(ServletConfig conf) {
//		this.conf=conf;
//		System.out.println("Creating object ...");
//	}
//	
//	public void service(ServletRequest req,ServletResponse resp) throws ServletException,IOException
//	{
//		System.out.println("Servicing ...");
//		resp.setContentType("text/html");
//		PrintWriter out=resp.getWriter();
//		out.print("<h1>This is output from servlet</h1>");
//		out.print("<h1> Todays time is "+ LocalDate.now()+" </h1>");
//	}
//	public void destroy() {
//		System.out.println("Destroying the object ...");
//	}
//	
//	//Non -life cycle methods
//	public ServletConfig getServletConfig() {
//		return this.conf;
//	}
//	public String getServletInfo() {
//		return "This servlet is created by Anokh";
//	}
//
//}
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class firstServlet extends GenericServlet
{

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Second servlet ");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("<h1>Second servlet is working</h1>");
		out.print("testing is sucessfull...");
		out.println("<h2>This is page is work for a second servlet</h2>");
	}

}
