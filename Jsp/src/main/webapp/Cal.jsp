<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int x=Integer.parseInt(request.getParameter("no1"));
int y=Integer.parseInt(request.getParameter("no2"));

String op=request.getParameter("op");
		switch (op) {
		case "+":out.write("Addition is"+(x+y)); 
					break;
		
		case "-":out.write("Substraction is"+(x-y));
					break;
					
		case "*":out.write("Multiplication is"+(x*y));
					break;
				
		case "/":out.write("Division is"+((float)x/y));
		}
		%>
</body>
</html>