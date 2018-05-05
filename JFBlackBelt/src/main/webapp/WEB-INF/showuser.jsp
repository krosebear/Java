<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <div style="float:right;"class="">
    <a href="/logout">Logout</a><br>
    <a href="/dashboard">Dashboard </a>
  </div>
  <br>
      First name: <c:out value="${user.firstName}"/><br>
      Last name: <c:out value="${user.lastName}"/><br>
      email: <c:out value="${user.email}"/><br>
      <hr>
        <br><br>
      Total Number of Posts: <c:out value="${fn:length(user.idea)}"/><br>
      Total Number of Likes: <c:out value="${fn:length(user.ideas)}"/>

</body>
</html>
