<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Scripting Tag</h1>
	<% 
	out.print("HEloo");
	String []arr={"ABC","PQR","XYZ"};
	out.print("<br>Array is");
	for(String s:arr)
		out.print(s+"<br>");
	%>
	<h1>Expression Tag</h1>
	<%="Hello Expression Tag" %>
	<%! int square (int n)
	{
		return n*n;
	}
	%>
	<%="Square of 5 is"+square(5) %>
	<% int []myarr={1,2,3,4,5};
	
	for (int n:myarr)
	{
	%>
	<%=n %><br>
	
	<%
	}
	%>
</body>
</html>