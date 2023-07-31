package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

@SuppressWarnings("serial")
public class SecondServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Second servlet ");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("<h1>Second servlet is working</h1>");
	}

}
