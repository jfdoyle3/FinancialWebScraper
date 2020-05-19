<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="user"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="Stock"%>
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
	<form:form action="processForm">
	<table class="striped">
		<tr>
			<th>Data</th>
			<th>Description</th>
		</tr>

		<tr>
			<td>IBM</td>
			<td>Static sample data</td>

		</tr>
		<tr>
			<td>${Stock}</td>
			<td>data from object / database</td>
		</tr>
		<tr>
			<td>${user.email}</td>
			<td>User email</td>
		</tr>
		<tr>
			<td>${user.password}</td>
			<td>User password</td>
		</tr>
	</table>
	</form:form>
</body>
</html>