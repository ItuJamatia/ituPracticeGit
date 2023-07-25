<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <div style="text-align: left;">
  <h2><a href="home">Jiffy</a></h2>
</div>
<form>
  Select available date and times<br>
  Add date: <input type="date" name="requestDate"><br>
 Add time:
  <input type="radio" name="requestTime" value="morning"> Morning
  <input type="radio" name="requestTime" value="afternoon"> Afternoon
  <input type="radio" name="requestTime" value="evening"> Evening<br>
  Timing guidelines:<br>
  <textarea name="requestTime" rows="5" cols="30"></textarea><br>
  <input type="submit" value="Next">
</form>

</body>
</html>