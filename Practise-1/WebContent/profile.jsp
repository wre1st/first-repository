<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
//	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise-db","root","");
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery("select * from user");
		
		
		while(rs.next()){
			System.out.println(" "+rs.getString("id")+" "+rs.getString("name")+" "+rs.getString("salary"));
		}
		
		connection.close();
/*	}catch(SQLException ioe){
		System.out.println(ioe);		
	}
	*/
	%>
</body>
</html>