<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="stock" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<spring:url value="/resources/css/webConsole.css" var="webConsoleCSS" />
<link href="${webConsoleCSS}" rel="stylesheet" />
<meta charset="ISO-8859-1">
<title>Web Console Output</title>
</head>
<body>
	<h3>Web Console Output</h3>
	<br>
	<br>
	Stock:
	<br>
	Symbol: <b>${stock.symbol}</b> 
</body>
</html>