package com.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Person;


@WebServlet("/home")
public class HomeController extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{

		Person person=new Person();
		person.setId(67);
		person.setName("Tahir Hussain");
		person.setSalary(70000);
		request.setAttribute("person", person);
		response.sendRedirect("home.jsp");

	}
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		
		
	}
	
}
