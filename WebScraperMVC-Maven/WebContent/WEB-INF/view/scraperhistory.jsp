<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="user"%>
<!DOCTYPE html>
<html>
<head>
<spring:url value="/resources/css/scraperhistory.css" var="scraperHistoryCSS" />
<link href="${scraperHistoryCSS}" rel="stylesheet" />
<meta charset="ISO-8859-1" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css" />
<link rel="stylesheet" type="text/css" href="css/scraper-table.css" />
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet" />
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans:wght@700&display=swap"
	rel="stylesheet" />
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans&display=swap"
	rel="stylesheet" />
<title>Scraper History</title>
</head>
<body>
	<h2>Scraper History</h2>
	<div class="container">
	<!--  	<a id="scrape" class="waves-effect waves-light btn">Scrape</a> 
		<a href="clear" id="reset" class="waves-effect waves-light btn">Reset</a> -->	
		<br />
		<table class="highlight">
			<thead>
				<tr>
					<th>ID</th>
					<th>TimeStamp</th>
					<th>Symbol</th>
					<th>LastPrice</th>
					<th>Change</th>
					<th>Change%</th>
					<th>MarketTime</th>
					<th>Volume</th>
					<th>AvgVol</th>
					<th>MarketCap</th>
				</tr>
			</thead>
			<c:forEach items="${stock}" var="stok">
				<tr>
					<td>${stok.id}</td>
					<td>${stok.datestamp}</td>
					<td>${stok.symbol}</td>
					<td>${stok.lastprice}</td>
					<td>${stok.pricechange}</td>
					<td>${stok.changepercentage}</td>
					<td>${stok.markettime}</td>
					<td>${stok.volume}</td>
					<td>${stok.avgvol}</td>
					<td>${stok.marketcap}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<footer>
		<i>Typed by the fingers of Jim Doyle</i>
	</footer>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>
</html>
