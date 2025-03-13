<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String u=request.getParameter("uname");
String p=request.getParameter("pass");
	
	if(u.equals("Abhay")&&p.equals("Pass@123"))
	{
		session.setAttribute("user", u); %>
		<jsp:forward page="ActionWellcome.jsp"></jsp:forward>
	<% }
	else
	{
		out.print("Invalid Login Details....");
		%>
		<jsp:include page="ActionIndex.jsp"></jsp:include>
	<% }  %>



</body>
</html>