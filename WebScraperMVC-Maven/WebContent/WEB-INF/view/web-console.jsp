<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="user"%>
<!DOCTYPE html>
<html>
<head>
<spring:url value="/resources/css/webConsole.css" var="webConsoleCSS" />
<link href="${webConsoleCSS}" rel="stylesheet" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css" />
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans:wght@700&display=swap"
	rel="stylesheet" />
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans&display=swap"
	rel="stylesheet" />
<meta charset="ISO-8859-1">
<title>Web Console Output</title>
</head>
<body>
	<h3>Web Console Output</h3>
	<br>
	<br>
	<form:form action="processForm" modelAttribute="stock">
	<table class="striped">
		<tr>
			<th>Symbol</th>
			<th>Description</th>
		</tr>

		<tr>
			<td>IBM</td>
			<td>Static sample data</td>

		</tr>
		<tr>
			<td>${stock.symbol}</td>
			<td>data from object / database</td>
		</tr>
	</table>
	</form:form>
</body>
</html>