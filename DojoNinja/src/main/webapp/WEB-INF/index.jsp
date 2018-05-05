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
<a href="/dojo/new">New Dojo</a>
<a href="/ninja/new">New Ninja</a>
<hr><br><br>
  <table>
    <tr>
      <td>Dojo Name</td>
      <td>Ninja Count</td>
    </tr>
    <c:forEach items="${dojo}" var="x">
    <tr>
      <td>
        <a href="/show/${x.id}"><c:out value="${x.name}"/></a>
        </td>
      <td><c:out value="${x.ninjas.size()}"/></td>
    </tr>
  </c:forEach>
  </table>
</body>
</html>
