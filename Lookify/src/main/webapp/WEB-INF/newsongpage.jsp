<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add a New Song</title>
</head>
<body>
  <table>
<form:form method="POST" action="/song/newOne" modelAttribute="song">
    <tr>
      <td><form:label path="name">Song Name
      <form:errors path="name"/></form:label></td>
      <td><form:input path="name"/></td>
    </tr>
    <tr>
      <td><form:label path="artist">Artist
      <form:errors path="artist"/></form:label></td>
      <td><form:input path="artist"/></td>
    </tr>
    <tr>
      <td><form:label path="rating">Rating
        </form:label><form:errors path="rating"/></td>

      <td><form:input type="number" min="1" max="10" path="rating"/></td>

    </tr>
    <tr>
      <td></td>
      <td><input type="submit" value="Submit"/></td>
    </tr>
  </form:form>
</table>
</body>
</html>
