<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit Your Report</title>
<link rel="stylesheet" type="text/css" href="./css/report.css">
</head>
<body>
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
	<img alt="" src="./assets/home1.gif">
	</div>
    
   <div style= "border: 3px solid white;
		width: 20%;
		text-align: center;
		margin-left: 25em;
		
		padding: 2em;">
         <form action="${pageContext.request.contextPath}/ReportController" method="post">
    <label for="patientname" class="label">PATIENT NAME</label>
    <br>
    <input type="text" id="patientname" name="patientname" placeholder="patientname">
    <br>
    <label for="age" class="label">PATIENT AGE</label> <br>
    <input type="text" id="age" name="age" placeholder="age">
	<br>
    <label for="gender" class="label">GENDER</label> <br>
    <input type="text" id="gender" name="gender" placeholder="gender">
    <br>
    <label for="weight" class="label">WEIGHT</label> <br>
    <input type="text" id="weight" name="weight" placeholder="weight">
    <br>
    <label for="height" class="label">HEIGHT</label> <br>
    <input type="text" id="height" name="height" placeholder="height">
    <br>
    <label for="query" class="label">QUERY</label> <br>
    <input type="text" id="query" name="query" placeholder="query">
    <br>
    <label for="mobile" class="label">MOBILE</label> <br>
    <input type="text" id="mobile" name="mobile" placeholder="mobile">
 	<br>
     <button class="button"><i class="fas fa-plus-circle"></i>SUBMIT</button>
  </form>
  </div>
  

</body>
</html>