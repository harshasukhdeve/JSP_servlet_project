<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body class="login-page">
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
	
	<div class="login-form" style="margin-left: 30em; margin-top: -17em;
		text-align: center;
		width: 20%;">
		<form action="${pageContext.request.contextPath}/LoginController" method="post">
			<label class="label" for="username">Username</label>
			<input type="text" name="username" id="username">
			<label class="label" for="password">Password</label>
			<input type="password" name="password" id="password">
			<button class="button" type="submit"  style="margin-left: 8em;">Login</button>
		</form>
	</div>
</body>
</html>