<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Query</title>
</head>
<body>
  <a style="float:right" href="/dashboard">Dashboard</a>
<h1>Search all:</h1>
<table>
  <tr>
    <td>Name</td>
    <td>Rating</td>
    <td>Actions</td>
  </tr>
  <c:forEach items="${search}" var="x">
  <tr>
    <td><c:out value="${x.name}"/></td>
    <td><c:out value="${x.rating}"/></td>
    <td><a href="/delete/${song.id}">Delete</a></td>
  </tr>
  </c:forEach>
</table>
</body>
</html>
