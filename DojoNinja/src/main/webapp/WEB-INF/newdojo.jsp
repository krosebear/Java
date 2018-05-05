<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form:form method="POST" action="/dojo/create" modelAttribute="dojo">
    <form:label path="name">Dojo Name:
      <form:errors path="name"/></form:label>
      <form:input path="name"/>
      <input type="submit" value="Create">
  </form:form>
</body>
</html>
