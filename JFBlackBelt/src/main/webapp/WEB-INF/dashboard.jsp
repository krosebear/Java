<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dashboard</title>
</head>
<body>
<a href="/logout" style="float:right;">Logout</a>
<h1>Welcome <c:out value="${user.firstName}"/>!</h1>
<br><br><br>
  <hr>



    <form:form method="POST" action="/add/idea" modelAttribute="idea">
      <form path="user_id" value="user.id"/>
      <form:input type="text" path="randomIdea"/>
      <input type="submit" value="Idea!">
    </form:form>
    <br><br><br>



    <c:forEach var="idea" items="${ideas}">
      <p><a href="/user/${idea.createdBy.id}"><c:out value="${idea.createdBy.firstName}"/></a> Says:
      <div style="border:solid 1px black; width: 40%;"><c:out value="${idea.randomIdea}"/>
      <div style="float:right;">
        <c:if test="${idea.createdBy.id == user.id}"><a href="/deleteidea/${idea.id}">Delete</a></c:if>
      </div>
    </div></p>
        <form:form method="POST" action="/add/like">
          <p><input type="submit" value="Like">
            <a href="/brightideas/${idea.id}"><c:out value="${fn:length(idea.userLikes)}"/></a>
             people liked this</p>
            <input type="hidden" name="id" value="${idea.id}">
        </form:form>
        <hr>
    </c:forEach>
</body>
</html>
