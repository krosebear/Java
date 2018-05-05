<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a style="float:right;" href="/">Dashboard</a>
<h1>New Person</h1>
<form:form method="POST" action="/createPerson" modelAttribute="person">
<table>
<tr>
      <td><form:label path="first_name">First Name
      <form:errors path="first_name"/></form:label></td>
      <td><form:input path="first_name"/></td>
    </tr>
    <tr>
      <td><form:label path="last_name">Last Name
      <form:errors path="last_name"/></form:label></td>
      <td><form:input path="last_name"/></td>
    </tr>
    <tr>
      <td></td>
      <td><input type="submit" value="Submit"/></td>
    </tr>
</table>
</form:form>
</body>
</html>
