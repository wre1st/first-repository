<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.model.Person" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String username=(String)session.getAttribute("username");
	out.println("username==>"+username);
	System.out.println(username);
	if(username==null){
		response.sendRedirect("login.jsp");
	}

%>
	<table>
		<thead>		
			<th>ID</th>
			<th>NAME</th>
			<th>Salary</th>
		</thead>
		<tbody>
		<tr> 
  			
		</tr>

	</tbody>
	
	</table>
</body>
</html>