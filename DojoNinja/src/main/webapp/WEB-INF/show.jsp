<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <a style="float:right" href="/">Dashboard</a>
<h1><c:out value="${dojo.name}"/> Dojo</h1>
<table style="width:50%;">

    <tr>
      <td><h3>First Name</h3></td>
      <td><h3>Last Name</h3></td>
      <td><h3>Age</h3></td>
    </tr>
    <c:forEach var="ninja" items="${dojo.ninjas}">
    <tr>
      <td><c:out value="${ninja.firstName}"/></td>
      <td><c:out value="${ninja.lastName}"/></td>
      <td><c:out value="${ninja.age}"/></td>
    </tr>
  </c:forEach>
</table>


</body>
</html>
