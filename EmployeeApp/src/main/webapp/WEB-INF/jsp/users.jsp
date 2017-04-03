<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of Users</title>
</head>
<body style="background-color:yellow;">
<head>
<style>
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
}
th, td {
    padding: 5px;
    text-align: left;
}
</style>
</head>

<table style="width:100%">

	<th>USERS<th/>
	
	<c:forEach var="temp" items="${users}">
	<tr>
<td><a href=temp> ${temp}</a></td>
	</tr>
	
	</c:forEach>
	

</table>



</body>
</html>