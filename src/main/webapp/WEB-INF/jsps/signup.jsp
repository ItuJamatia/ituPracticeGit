<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>users registrations</title>
</head> <div style="text-align: left;">
  <h2><a href="home">Jiffy</a></h2>
</div>
<body bgcolor='white'>
<center><h2>Sign Up</h2></center><hr><br>
<center>Create a free account with Jiffy. Have an account?
<a href="login">Log In</a></center><br><br>

<form action="signup" method="post">

<center>First Name<input type="text" name="firstName"/></center><br>
<center>Last Name<input type="text" name="lastName"/></center><br>
<center>Email<input type="text" name="email"/></center><br>
<center>Phone<input type="text" name="phone"/></center><br>
<center>Password<input type="text" name="password"/></center><br>
<center>Confirm Password<input type="text" name="confirmPassword"/></center><br>

<center><input type="submit" value="Sign Up"/></center><br>

<center>By signing up you're agreeing to Jiffy's
<a href="terms&conditions">Terms and Conditions</a></center><br>
</body>
</html>