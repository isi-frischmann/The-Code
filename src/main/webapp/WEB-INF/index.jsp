<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
</head>
<body style="text-align:center;">

<h3>What is the code?</h3>

<form method="POST" action="/rightGuess">

	<textarea name="code"></textarea><br>
	<button type="submit">Try Code</button>
	
	<p><c:out value="${ error }"></c:out></p>
	
</form>


</body>
</html>