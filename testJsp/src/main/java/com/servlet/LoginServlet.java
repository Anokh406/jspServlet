package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/Login",name="LoginServlet")
public class LoginServlet extends HttpServlet {

	@SuppressWarnings("unused")
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Login servlet works");
		PrintWriter Writer= resp.getWriter();
		Writer.println("<h1>From servlet Login page </h1>");
		String s="Testing";
		Writer.println(s);
	}

}
