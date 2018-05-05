<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="/languages">Dashboard</a>
<a href="/languages/delete/{id}">Delete</a>
<br>
<br>
<br>
<form:form method="POST" action="/languages/edit/{id}" modelAttribute="language">
<table>
  <tr>
    <td><form:label path="name">Name <form:errors path="name"/></form:label></td>
    <td><form:input path="name"/></td>
  </tr>
  <tr>
    <td><form:label path="creator">Creator
    <form:errors path="creator"/></form:label></td>
    <td><form:input path="creator"/></td>
  </tr>
  <tr>
    <td><form:label path="version">Version
    <form:errors path="version"/></form:label></td>
    <td><form:input path="version"/></td>
  </tr>
  <tr>
    <td></td>
    <td><input type="submit" value="Submit"/></td>
  </tr>
</table>
</form:form>

</body>
</html>
