<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<spring:url value="/resources/css/index.css" var="indexCSS" />
<link href="${indexCSS}" rel="stylesheet" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css" />
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet" />
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans:wght@700&display=swap"
	rel="stylesheet" />
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans&display=swap"
	rel="stylesheet" />
<title>Web Scraper</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
</head>
<body>
	<div class="header">
		<h2>
			<b>Financial Web Scraper</b>
		</h2>
	</div>

	<div class="row">
		<div class="column"></div>
		<div class="column">
			<form:form action="user/login" class="col s12 offset-s1">
				<div class="row">
					<div class="col s7">
						<button class="btn waves-effect waves-light" type="submit"
							name="action">Enter</button>
					</div>
				</div>
			</form:form>
		</div>
		<div class="column"></div>
	</div>

	<div class="footer">
		<p>
			<i>Typed by the fingers of Jim Doyle</i>
		</p>
	</div>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>
</html>
