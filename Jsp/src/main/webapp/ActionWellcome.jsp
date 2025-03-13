<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><%="Wellcome"+session.getAttribute("user") %>
</h1>
<a href="ServletLogout.jsp">Logout</a>
</body>
</html>