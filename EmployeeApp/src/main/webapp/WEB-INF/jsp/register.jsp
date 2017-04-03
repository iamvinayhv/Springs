<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>register</title>
</head>

<body style="color:blue; background-color:aqua;">
<div align="left" align="right">

<form action="register" method="post">

<table>

<tr><td>Name:</td><td><input type="text" name="name" placeholder="enter your name"></td></tr><br/>
<tr><td>Department:</td><td><input type="text" name="dept" placeholder="enter your dept"></td></tr><br/>
<tr><td>Salary:</td><td><input type="number" name="salary" placeholder="enter your salary"></td></tr><br/>
<tr><td>E-mail:</td><td><input type="text" name="mail" placeholder="enter your E-mail"></td></tr><br/>
<tr><td>Password:</td><td><input type="password" name="password" placeholder="enter password"></td></tr><br/><br/>

</table>

<input align="left" type="submit" value="SignUp" style="color:gold; background-color:green" >

</form>
</div>

</body>
</html>