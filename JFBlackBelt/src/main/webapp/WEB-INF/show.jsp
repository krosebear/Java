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
  <a style="float:right;" href="/dashboard">Dashboard</a>
<%-- put what original poster posted --%>
<c:out value="${idea.createdBy.firstName}"/> said:<br>
<c:out value="${idea.randomIdea}"/>
<br><br><br><br>

<table style="border:solid 2px black; width: 40%;">
  <tr>
    <%-- table showing who liked it and their full names --%>
    <th>Alias</th>
    <th>Full Name</th>
  </tr>
  <c:forEach var="x" items="${idea.userLikes}">
    <tr>
      <td><a href="/user/${x.id}"><c:out value="${x.firstName}"/></a>
        </td>
      <td><c:out value="${x.firstName}"/> <c:out value="${x.lastName}"/></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
