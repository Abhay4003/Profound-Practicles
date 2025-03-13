<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%="Session Id="+session.getId() %> <br>
<%="Creation Time="+new Date(session.getCreationTime()) %>
<br>
<form action="Welcome.jsp">
Enter name:<input type="text" name="uname"><br>
<input type="Submit" value="Click">
</form>
<%application.setAttribute("msg","Hello from application Data"); %>
</body>
</html>