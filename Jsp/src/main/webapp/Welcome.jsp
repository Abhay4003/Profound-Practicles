
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%="Session Id="+session.getId() %><br>
<%="Creation time="+new Date(session.getCreationTime()) %>
<%String u=request.getParameter("uname");
session.setAttribute("user", u); %>
<%="Wellcome"+u %> <br>
<%=application.getAttribute("msg") %><br>
<a href="Second.jsp">Click Click</a>
</body>
</html>