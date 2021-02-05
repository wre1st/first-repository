package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.util.DbConnection;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	Connection connection = DbConnection.getConnection();
	PreparedStatement preStatement;

	public void doGet(HttpServletRequest request, HttpServletResponse response) {

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		System.out.println("Main Controller");
		String username = (String) request.getParameter("username");
		String password = (String) request.getParameter("password");
		/*
		 * try {
		 * 
		 * preStatement=connection.prepareStatement("select * from user "); ResultSet
		 * rs=preStatement.executeQuery(); String db_username=null; String
		 * user_pass=null;
		 * 
		 * while(rs.next()) {
		 * 
		 * db_username=rs.getString("name"); user_pass=rs.getString("password");
		 * 
		 * System.out.println(db_username+" \n ");
		 * System.out.println(db_username+" \n ");
		 * 
		 * if(db_username.equals(username) && password.equals(db_username)) {
		 * response.sendRedirect("profile.jsp"); }
		 * 
		 * }
		 * 
		 * }catch(Exception e) { System.out.println(e); }
		 */

		try {

			preStatement = connection.prepareStatement("select * from user where name=? and password=? ");
			preStatement.setString(1, username);
			preStatement.setString(2, password);
			boolean cond=preStatement.execute();
			System.out.println(username+"Condition-->"+cond);
			
			if (cond) {
				HttpSession httpSession=request.getSession();
				httpSession.setAttribute("username", username);
				response.sendRedirect("home.jsp");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}