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


<h4  style="color:green;">Details</h4>

<table>

<tr><td>Emp.ID</td><td>${employee.id}</td></tr><br/>
<tr><td>Name</td><td>${employee.name}</td></tr><br/>
<tr><td>Department</td><td>${employee.dept}</td></tr><br/>
<tr><td>E-mail ID</td><td>${employee.mail}</td></tr><br/>
<tr><td>Salary</td><td>${employee.salary}</td></tr><br/>

</table>

<form action="users" method="get">

<input type="submit" value="click here to see all employeis">

</form>
<br/>
<br/>

<a href="changepassword.jsp">change Password</a>
<a href="welcome.jsp">logout!!!</a>

</body>
</html>