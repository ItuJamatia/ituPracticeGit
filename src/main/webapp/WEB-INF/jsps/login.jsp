<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Log_in users</title>
</head>
<body bgcolor='white'>
 <div style="text-align: left;">
  <h2><a href="home">Jiffy</a></h2>
</div>
<center><h1>Log In</h1></center><hr><br>
<center>New to Jiffy?<a href="signup">Sign Up</a></center><br><br>

<form action="login" method="post">

<center>Email<input type="text" name="email"/></center><br>
<center>Password<input type="text" name="password"/></center><br>

<center><input type="submit" value="Login"/></center><br>

<center>${msg}</center><br>
</body>
</html>