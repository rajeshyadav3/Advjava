package com.web;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DummyServlet")
public class DummyServlet extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Dummy:init called");
	}

	
	public void destroy() {
		System.out.println("Dummy:destroy called");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Dummy:DummyServlet called...");
	}

	    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
