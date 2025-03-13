<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Cal.jsp" method="get">
N01:<input type="text" name="no1"><br>
N02:<input type="text" name="no2"><br>

<input type="radio" name="op" value="+">
Addition<br>

<input type="radio" name="op" value="-">
Substraction<br>

<input type="radio" name="op" value="*">
Multiplication<br>

<input type="radio" name="op" value="/">
Division

<input type="submit" name="Add">
</form>
</body>
</html>