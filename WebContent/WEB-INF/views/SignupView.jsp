<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SIGNUP</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body class="signup-page">
<nav>
	<ul>
	<li><a href="${pageContext.request.contextPath}/DoctorLoginController">Doctor</a></li>
	<li><a href="${pageContext.request.contextPath}/LoginController">Login</a></li>
	<li><a href="${pageContext.request.contextPath}/SignupController">SignUp</a></li>
	<li><a href="${pageContext.request.contextPath}/HomePageViewController">Home</a></li>
	</ul>
	</nav>
	<br>
	<div class="welcome-back">
	<img alt="" src="./assets/home1.jpg">
	</div>
	
	<div class="signup-form"
		style= "border: 3px solid white;
		width: 20%;
		text-align: center;
		margin-left: 30em;
		margin-top: -17em;
		padding: 1em;">
		<form action="${pageContext.request.contextPath}/SignupController" method="post">
			<label class="label" for="username">USERNAME</label>
			<input type="text" name="username" id="username">
			<label class="label" for="password">Password</label>
			<input type="password" name="password" id="password">
			<label class="label" for="password">Confirm Password</label>
			<input type="password" name="Confirm password" id="password">
			<button class="button" type="submit" style="margin-left: 8em;">Signup</button>
		</form>
	</div>
</body>
</html>