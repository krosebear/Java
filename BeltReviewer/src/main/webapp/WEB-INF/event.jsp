<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Event Details</title>
  </head>
  <body>
    <h1><c:out value="${event.eName}"/></h1>
    <br>
    <h3>Host: <c:out value="${event.createdBy.firstName} ${event.createdBy.lastName}"/></h3>
    <h3>Date: <fmt:formatDate type="date" value="${event.eDate}"/></h3>
    <h3>Location: <c:out value="${event.city}, ${event.state}"/></h3>
    <h3>People who are attending event: </h3>
  </body>
</html>
