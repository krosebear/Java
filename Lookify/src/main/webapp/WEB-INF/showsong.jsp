<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Song Info</title>
</head>
<body>
  <a href="/dashboard" style="float:right;">Dashboard</a>

  <br><br><br>
  <table style="width: 50%;">
    <tr>
      <td>Title</td>
      <td><c:out value="${song.name}"/></td>
    </tr>
    <tr>
      <td>Artist</td>
      <td><c:out value="${song.artist}"/></td>
    </tr>
    <tr>
      <td>Rating (1-10)</td>
      <td><c:out value="${song.rating}"/></td>
    </tr>
  </table>
  <br>
    <a href="/delete/${id}">Delete</a>


</body>
</html>
