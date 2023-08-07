package com.attr;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class s1
 */
public class s1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public s1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		PrintWriter out=response.getWriter();
//		String n1=((ServletRequest) response).getParameter("n1");
//		String n2=((ServletRequest) response).getParameter("n2");
//		int nn1=Integer.parseInt(n1);
//		int nn2=Integer.parseInt(n2);
//		int s=(int)nn1+nn2;
//		request.setAttribute("sum", s);
//		out.println("<h1> WORKING S1</h1>");
//		RequestDispatcher rd = request.getRequestDispatcher("s2");
//        rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		String n1=((ServletRequest) response).getParameter("n1");
		String n2=((ServletRequest) response).getParameter("n2");
		int nn1=Integer.parseInt(n1);
		int nn2=Integer.parseInt(n2);
		int s=(int)nn1+nn2;
		request.setAttribute("sum", s);
		out.println("<h1> WORKING S1</h1>");
//		RequestDispatcher rd = request.getRequestDispatcher("s2");
//        rd.forward(request, response);
	}

}
