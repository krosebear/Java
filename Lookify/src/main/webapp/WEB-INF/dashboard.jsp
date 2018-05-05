<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lookify Dash</title>
</head>
<body>
<a href="/songs/new">Add Song</a>
<a href="/search/topTen">Top Songs</a><br>
<form action="/search" method="POST">
		<input id="searchText" type="text" placeholder="Artist Name" name="artist" />
		<input class="button" type="submit" value="Search Artists"/>
</form>
<hr>
<table style="width:25%">
  <tr>
    <th>Song Name</th>
    <th>Rating</th>
    <th>Actions</th>
  </tr>
  <c:forEach items="${songs}" var="song">
  <tr>
    <td> <a href="/songs/${song.id}">

      <c:out value="${song.name}"/></a></td>
    <td><c:out value="${song.rating}"/></td>
    <td><a href="/delete/${song.id}">Delete</a></td>
  </tr>
</c:forEach>
</table>
</body>
</html>
