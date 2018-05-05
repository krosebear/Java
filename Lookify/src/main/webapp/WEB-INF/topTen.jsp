<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Top Ten Songs</title>
</head>
<body>
  <a style="float:right;" href="/dashboard">Dashboard</a>
<h1>Top Ten Songs:</h1>
<div class="topten" style="border:solid 2px black;">
<c:forEach items="${songs}" var="song">
  <p><c:out value="${song.rating}"/> - <a href="/songs/${song.id}"><c:out value="${song.name}"/> </a>- <c:out value="${song.artist}"/></p>

</c:forEach>
</div>
</body>
</html>
