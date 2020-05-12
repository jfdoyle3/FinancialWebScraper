<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>

<!-- let's add tag srping:url -->
<spring:url value="/resources/css/index.css" var="indexCSS" />
<link href="${indexCSS}" rel="stylesheet" />
<!-- Finish adding tags -->

<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<title>Scraper</title>
</head>
<body>
	<h2>Home Page</h2>

	<form>
		<p>
			Today's date:
			<%=(new java.util.Date()).toLocaleString()%></p>
		<%
			out.println("Your IP address is " + request.getRemoteAddr());
		%>
		<br>
		<br>
		CSS: ${pageContext.request.contextPath}
		<br> <br>
		<a href="login">Login</a>
		<br>
		 <a	href="scraper-table">Table</a>
	</form>
	<footer>
		<i>Typed by the fingers of Jim Doyle</i>
	</footer>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>
</html>
