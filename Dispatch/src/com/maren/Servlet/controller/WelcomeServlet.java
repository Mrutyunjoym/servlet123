package com.maren.Servlet.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WelcomeServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException,IOException
		{
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String n=request.getParameter("Username");
		out.print("Welcome"+n);
		}
}

		