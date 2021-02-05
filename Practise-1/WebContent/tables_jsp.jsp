
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import ="com.model.Person"%>
<%@ page import="java.util.*" %>
<%@ page import="com.dao.PersonDao" %>
<%@ page import="com.repository.PersonService" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%!
			private Integer id;
			private String username;
		%>
		
		<%!
			public List<Person> getPersonTable(){
				PersonDao personDao=new PersonService();
			return	personDao.getPersonList();
			}
		%>
		
<!--  
					<sql:setDataSource driver="com.mysql.jdbc.Driver" password="" 
						user="root" url="jdbc:localhost:3306/practise-db" var="rs">
						<sql:query var="v" >Select * from user</sql:query>
						
						</sql:setDataSource>
-->		
				<table>
					<tbody>
						
						
											
						<tr>
						<c:forEach items="getPersonTable()" var="item" >
						
						<td>${item}
						</td>
						</c:forEach>
						</tr>
					</tbody>
				</table>
		<%
			
				
		%>
</body>
</html>