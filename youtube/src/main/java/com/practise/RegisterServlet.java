package com.practise;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet(urlPatterns="/RegisterServlet",name="register")
public class RegisterServlet extends HttpServlet {

@SuppressWarnings("null")
public void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
{
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	out.println("<h1>welcome to Servlet</h1>");
	String name=req.getParameter("user_name");
	String email=req.getParameter("email");
	String password=req.getParameter("password");
	String gender=req.getParameter("gender");
	String course=req.getParameter("course");
	String cond=req.getParameter("condition");
		
	if(cond!=null) {
		if(cond.equals("checked") ) {
		out.println("<h2>Name :"+" "+name+"</h2>");
		out.println("<h2>Password  :"+" " +email+"</h2>");
		out.println("<h2>Email  :"+" "+password+"</h2>");
		out.println("<h2>Gender :"+" "+gender+"</h2>");
		out.println("<h2>Course :"+" "+course+"</h2>");
		
		
//		JDBC
		
//		....
//		SAVED TO DB
		RequestDispatcher rd = req.getRequestDispatcher("success");
        rd.forward(req, resp);
		}else {
			out.println("<h2>You are not accepted the terms and conditions  </h2>");
			}
		}
	else  {
        out.println("<h2>You have not accepted the terms and conditions</h2>");

        RequestDispatcher rd = req.getRequestDispatcher("index.html");
        rd.include(req, resp);
    }
}

}
