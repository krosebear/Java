<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Registration</title>
</head>
<body>
	<fieldset>
		<legend> Registration</legend>
    <form:errors path="user.*"/>
    <form:form method="POST" action="/register/user" modelAttribute="user">
      <table>
        </tr>
        <tr>
          <td><form:label path="firstName">First Name:</form:label></td>
          <td><form:input type="text" path="firstName" /></td>
        </tr>
        <tr>
          <td><form:label path="lastName">Last Name:</form:label></td>
          <td><form:input type="text" path="lastName" /></td>
        </tr>
        <tr>
          <td><form:label path="age">Age:</form:label></td>
          <td><form:input type="number" path="age" /></td>
        </tr>
        <tr>
          <td><form:label path="email">EMail:</form:label></td>
          <td><form:input type="email" path="email" /></td>
        </tr>
        <tr>
          <td><form:label path="birthday">Birthday:</form:label></td>
          <td><form:input type="date" path="birthday" /></td>
        </tr>
        <tr>
          <td><form:label path="password">Password:</form:label></td>
          <td><form:input type="password" path="password"/></td>
          <td><input type="password" name="c_password"/></td>
        </tr>
        <tr>
          <td></td>
          <td><input type="submit" value="Register"/></td>
        </tr>
      </table>
    </form:form>
	</fieldset>

	<fieldset>
		<legend>Login</legend>
    <table>
      <form:form method="POST" action="/login/user" modelAttribute="user">
      <tr>
        <td><form:label path="email">EMail:</form:label></td>
        <td><form:input type="email" path="email" /></td>
      </tr>
      <tr>
        <td><form:label path="password">Password:</form:label></td>
        <td><form:input type="password" name="password"/></td>
        <td><input type="password" name="c_password"/></td>
      </tr>
    </table>
  </form:form>
	</fieldset>
</body>
</html>
