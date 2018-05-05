 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>Survey:</h1>
  <hr>
    <br>
<form action="/login" method="POST">
  <input type="text" name="name" placeholder="Your Name"><br>
    <select name="dojolocation">
      <option value="SanJose">San Jose</option>
      <option value="Seattle">Seattle</option>
      <option value="DC">DC</option>
      <option value="Tulsa">Tulsa</option>
    </select><br>
    <select name="favlanguage">
      <option value="python">Python</option>
      <option value="java">Java</option>
      <option value="csharp">C#</option>
      <option value="javascript">Javascript</option>
    </select><br>
    <textarea name="comment" rows="8" cols="80" placeholder="Comment:(optional)"></textarea><br>
    <input type="submit" name="" value="Submit Survey">
</form>
</body>
</html>
