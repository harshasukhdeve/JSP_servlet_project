<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PATIENT REPORTS</title>
<link rel="stylesheet" type="text/css" href="./css/report.css">
</head>
<body>

<nav>
	<ul>
	<li><a href="${pageContext.request.contextPath}/LoginController">Login out</a></li>
	<li><a href="${pageContext.request.contextPath}/ViewAllReportController">All Report</a></li>
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

<div>
	<table>
	<thead>
	<tr>
		<th>PATIENT_NAME</th>
		<th>AGE</th>
		<th>GENDER</th>
		<th>WEIGHT</th>
		<th>HEIGHT</th>
		<th>QUERY</th>
		<th>MOBILE</th>
		</tr>
		</thead>
		
		<tbody>
			<c:forEach var="report" items="${listreport}">
			<tr>
			<td><c:out value="${report.getName()}"/></td>
			<td><c:out value="${report.getAge()}"/></td>
			<td><c:out value="${report.getGender()}"/></td>
			<td><c:out value="${report.getWeight()}"/></td>
			<td><c:out value="${report.getHeight()}"/></td>
			<td><c:out value="${report.getQuery()}"/></td>
			<td><c:out value="${report.getMobile()}"/></td>
			
			<td><a href= "DeleteController?id=<c:out value='${report.getId()}'/>">
			<button class="button" id="addblog">Delete</button></a>
			</td>
			</tr>
			</c:forEach>
		</tbody>
	
	</table>
</div>

</body>
</html>