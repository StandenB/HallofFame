<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<title>Complete Table</title>
</head>
	<body>
		<main class="container">
				<%@include file="navbar.jsp"%>
				<h1>Famous Computer Scientists</h1>
		<br>
			<c:forEach var="nerd" items="${ complete }">
				<div>
					<h3>${ nerd.firstName } ${ nerd.lastName }</h3>
					<p>${ nerd.innovation }</p>
					<p>${ nerd.year }</p>
				</div>
			</c:forEach>
		</main>
	</body>
</html>