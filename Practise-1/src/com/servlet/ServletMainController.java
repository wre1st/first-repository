package com.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MainController")
public class ServletMainController extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse resonse) {
		System.out.println("Main Controller");
	}
	
	public void doPost(HttpServletRequest reques, HttpServletResponse response) throws IOException{
		response.sendRedirect("/login");
	}

}
