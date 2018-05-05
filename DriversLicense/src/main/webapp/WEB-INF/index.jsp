<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a style="float:right; "href="/person/new">Add Person</a><br>
<a style="float:right; "href="/license/new">Add License ID</a>
<h1>Information</h1><br>
<table style="width:40%">
  <tr>
    <th>First Name</th>
    <th>Last Name</th>
    <th>License #</th>
    <th>State</th>
    <th>Expiration Date</th>
  </tr>
  <c:forEach items="${person}" var="x">
  <tr>
    <td><c:out value="${x.first_name}"/></td>
    <td><c:out value="${x.last_name}"/></td>
    <td><c:out value="${x.license.number}"/></td>
    <td><c:out value="${x.license.state}"/></td>
    <td><fmt:formatDate type="date" value="${x.license.expirationDate}" pattern="MM/dd/yyyy"/></td>
  </tr>
</c:forEach>
</table>
</body>
</html>
