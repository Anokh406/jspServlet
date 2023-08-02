package com.practise;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
public class succesServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
	{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h2> Data saved succesfully");
	}

}
