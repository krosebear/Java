<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <link type="text/css" rel="stylesheet" href="<c:url value="/css/dashboard.css" />" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dashboard</title>
</head>
<body>
<a href="/logout" style="float:right;">Logout</a>
<h1>Welcome <c:out value="${user.firstName}"/>!</h1>
<br><br><br>
  <h3>Here are some events in your State:</h3>
<table style="width:55%;">
  <tr>
    <th>Name</th>
    <th>Date</th>
    <th>Location</th>
    <th>State</th>
    <th>Host</th>
    <th>Action/Status</th>
  </tr>
  <c:forEach var="event" items="${events}">
  <c:if test="${event.state == user.state}">
  <tr>
    <td><c:out value="${event.eName}"/></td>
    <td><fmt:formatDate type="date" value="${event.eDate}"/></td>
    <td><c:out value="${event.city}"/></td>
    <td><c:out value="${event.state}"/></td>
    <td><c:out value="${event.createdBy.firstName}"/></td>
    <td><c:if test="${event.createdBy.id == user.id}">
<a href="/delete/event/${event.id}">Delete</a>
</c:if> | <a class="a" href="/event/show/${event.id}">Details</a></td>
  </tr>
  </c:if>
</c:forEach>

</table>
  <hr>
  <h3>Here are some events in other States:</h3>
<table style="width:55%;">
  <tr>
    <th>Name</th>
    <th>Date</th>
    <th>Location</th>
    <th>State</th>
    <th>Host</th>
    <th>Action/Status</th>
  </tr>
  <c:forEach var="event" items="${events}">
    <c:if test="${event.state != user.state}">
  <tr>
    <td><c:out value="${event.eName}"/></td>
    <td><fmt:formatDate type="date" value="${event.eDate}"/></td>
    <td><c:out value="${event.city}"/></td>
    <td><c:out value="${event.state}"/></td>
    <td><c:out value="${event.createdBy.firstName}"/></td>
    <td><c:if test="${event.createdBy.id == user.id}">
<a href="/delete/event/${event.id}">Delete</a>
</c:if> | <a class="a" href="/event/show/${event.id}">Details</a></td>
  </tr>
  </c:if>
</c:forEach>

</table>
<br>
<hr><br><br>
  <h3>Create an Event</h3>
    <form:form method="POST" action="/add/event" modelAttribute="event">
      <form:errors path="event.*" style="color:red;"/>
      <%-- <form path="user_id" value="user.id"/> --%>
      <form:input type="text" path="eName" placeholder="Event name"/><br>
      <form:input type="date" path="eDate"/><br>
      <form:input type="text" path="city" placeholder="City"/><br>
      <form:input type="text" path="state" placeholder="State"/><br>
      <input type="submit" value="Submit">
    </form:form>
</body>
</html>
