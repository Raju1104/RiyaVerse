<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Data Page</title>
<style type="text/css">
table {
	border-collapse: collapse;
}
</style>
</head>
<body>
	<h1 align="center">Employee Details</h1>
	<table border="1" align="center">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Address</th>
			<th>Pincode</th>
		</tr>
		<c:forEach var="employee" items="${empList}">
			<tr>
				<td>${employee.fname}</td>
				<td>${employee.lname}</td>
				<td>${employee.email}</td>
				<td>${employee.ap}</td>
				<td>${employee.pin}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
