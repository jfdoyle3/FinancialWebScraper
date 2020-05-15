<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
<style>
* {
	box-sizing: border-box;
}

body {
	font-family: "IBM Plex Sans", sans-serif;
}

/* Style the header */
.header {
	padding: 30px;
	text-align: center;
	font-size: 35px;
}

/* Create three equal columns that floats next to each other */
.column {
	float: left;
	width: 33.33%;
	padding: 10px;
	/*  height: 300px;  Should be removed. Only for demonstration */
}

/* Clear floats after the columns */
.row:after {
	content: "";
	display: table;
	clear: both;
}

button {
	height: 20px;
	width: 100px;
	margin: -20px -10px;
	position: relative;
	top: 50%;
	left: 50%;
}
/* Style the footer */
.footer {
	padding: 10px;
	text-align: center;
}

.error {
	color: red;
}
/* Responsive layout - makes the three columns stack on top of each other instead of next to each other */
@media ( max-width : 600px) {
	.column {
		width: 100%;
	}
}
</style>
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
			<form:form action="processForm" modelAttribute="user"
				class="col s12 offset-s1">
				<div class="row">
					<div class="input-field col s10">
						<i class="material-icons prefix">email</i>
						<form:input path="email" id="lbl_email" type="email" cssClass="error" />
						<label for="lbl_email">Email</label>
					</div>
				</div>
				<div class="row">
					<div class="input-field col s10">
						<i class="material-icons prefix">https</i>
						<form:input path="password" id="lbl_password" type="password"
							cssClass="error" />
						<label for="lbl_password">Password</label>
					</div>
				</div>
				<div class="row">
					<div class="col s7">
						<button class="btn waves-effect waves-light" type="submit"
							name="action">Login</button>
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
