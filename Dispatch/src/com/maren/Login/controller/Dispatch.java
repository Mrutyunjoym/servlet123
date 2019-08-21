package com.maren.Login.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Dispatch extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException,IOException
		{
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String n=request.getParameter("username");
		String p=request.getParameter("Password");
		
		if(p.equals("servlet"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("servlet2");
			rd.forward(request, response);
		}
		else
		{
			out.print("Sorry Username or Password Error1!");
			RequestDispatcher rd=request.getRequestDispatcher("/DispatcherController");
			rd.include(request,response);
		}
	}
	}
}

