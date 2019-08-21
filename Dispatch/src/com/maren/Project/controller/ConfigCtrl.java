package com.maren.Project.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigCtrl
 */
@WebServlet(urlPatterns="/ConfigCtrl")
        @WebInitParam(name="univ",value="cutm")
		@webInitParam(loc="loc",value="bbsr")
		
public class ConfigCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @param servletConfig 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response, ServletConfig servletConfig) throws ServletException, IOException {
		// TODO Auto-generated method stub
			servletConfig=getServletConfig();
			ServletConfig config = null;
			String univ=config.getInitParameter("univ");
			String loc=config.getInitParameter("loc");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
