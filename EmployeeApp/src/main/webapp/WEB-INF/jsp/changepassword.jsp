<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Change Password</title>
</head>
<body>
<form action="changepassword" method="post">

<table>

<tr><td>E-mail:</td><td><input type="text" name="mail" placeholder="enter your E-mail"></td></tr><br/>
<tr><td>Enter old Password:</td><td><input type="password" name="oldpassword" placeholder="enter old password"></td></tr><br/>
<tr><td>Enter new Password:</td><td><input type="password" name="newpassword" placeholder="enter new password"></td></tr><br/>
<tr><td>Re-Enter new Password:</td><td><input type="password" name="reEnter" placeholder="enter new password"></td></tr><br/>

</table>

<input type="submit" value="change password">
</form>

</body>
</html>