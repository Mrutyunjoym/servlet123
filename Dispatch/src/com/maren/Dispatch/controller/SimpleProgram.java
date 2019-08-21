package com.maren.Dispatch.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleProgram
 */
@WebServlet("/SimpleProgram")
public class SimpleProgram extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if(username.contentEquals("Nitish") && password.contentEquals("1234"))
		{
			response.sendRedirect("welcome.html");
		}
		else
		{
			response.sendRedirect("wrong username and password");
		}
	}

}
