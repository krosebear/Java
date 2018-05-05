<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
  
  <tr>
    <th>Name</th>
    <th>Creator</th>
    <th>Version</th>
    <th>Action</th>
  </tr>
  <c:forEach items="${languages}" var="language">
  <tr>
    <td><c:out value="${language.name}"/></td>
    <td><c:out value="${language.creator}"/></td>
    <td><c:out value="${language.version}"/></td>
    <td><a href="/languages/delete/${language.id}">Delete</a> | <a href="/languages/edit/${language.id}">Edit</a></td>
  </tr>
  </c:forEach>
</table>
<br><br><br><br>
<hr>
<form:form method="POST" action="/languages/new" modelAttribute="language">

    <form:label path="name">Name
    <form:errors path="name"/>
    <form:input path="name"/></form:label><br>

    <form:label path="creator">Creator
    <form:errors path="creator"/>
    <form:input path="creator"/></form:label><br>

    <form:label path="version">Version
    <form:errors path="version"/>
    <form:input path="version" name="version"/></form:label><br>

    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
