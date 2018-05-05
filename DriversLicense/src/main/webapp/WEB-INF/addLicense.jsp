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
  <a style="float:right;" href="/">Dashboard</a>
  <h1>New License</h1>
  <form:form method="POST" action="/createLicense" modelAttribute="license">
    <table>
      <tr>
        <td><form:label path="person">Person:</form:label></td>
        <td>
        <form:select path="person">
  			<c:forEach items="${persons}" var="person">
          <form:option value="${person}" label="${person.first_name}  ${person.last_name}"/>
        </c:forEach>
      </form:select>
    </td>

        </tr>
        <tr>
          <td><form:label path="state">State:</form:label></td>
          <td><form:input type="text" path="state" /></td>
        </tr>
        <tr>
          <td><form:label path="expirationDate">Expiration Date:</form:label></td>
          <td><form:input type="date" path="expirationDate" /></td>
        </tr>
        <tr>
          <td></td>
          <td><input type="submit" value="Create"/></td>
        </tr>
    </table>
  </form:form>
</body>
</html>
