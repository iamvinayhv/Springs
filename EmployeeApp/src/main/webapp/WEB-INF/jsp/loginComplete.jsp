<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Completed</title>
</head>
<body style="background-color:orange;">

<h4>WelCome ${employee.name}</h4>


<p>
<h4  style="color:green;">Details</h4>

Emp.ID:${employee.id}<br/>
Name:${employee.name}<br/>
Department:${employee.dept}<br/>
E-mail ID:${employee.mail}<br/>
Salary:${employee.salary}<br/>

</p>

<form action="users" method="get">

<input type="submit" value="click here to see all employeis">

</form>
<br/>
<br/>

<a href="settings.jsp">settings<a/><br/>
<a href="welcome.jsp">logout!!!</a>

</body>
</html>