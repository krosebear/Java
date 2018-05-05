<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
  <link type="text/css" rel="stylesheet" href="<c:url value="/css/style.css" />" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Registration</title>
</head>
<body>
  <div class="facebook">
    <script>
      window.fbAsyncInit = function() {
        FB.init({
          appId      : '{326195874545248}',
          cookie     : true,
          xfbml      : true,
          version    : '{v2.11}'
        });

        FB.AppEvents.logPageView();

      };

      (function(d, s, id){
         var js, fjs = d.getElementsByTagName(s)[0];
         if (d.getElementById(id)) {return;}
         js = d.createElement(s); js.id = id;
         js.src = "https://connect.facebook.net/en_US/sdk.js";
         fjs.parentNode.insertBefore(js, fjs);
       }(document, 'script', 'facebook-jssdk'));
    </script>
  </div>
  <div id="field">
  	<fieldset>
  		<legend> Registration</legend>
      <form:errors path="user.*" style="color:red;"/>
      <form:form method="POST" action="/register/user" modelAttribute="user">
        <table class="table">
          <tr>
            <td><form:label path="firstName">First Name:</form:label></td>
            <td><form:input type="text" path="firstName" /></td>
          </tr>
          <tr>
            <td><form:label path="lastName">Last Name:</form:label></td>
            <td><form:input type="text" path="lastName" /></td>
          </tr>
          <tr>
            <td><form:label path="email">Email:</form:label></td>
            <td><form:input type="email" path="email" /></td>
          </tr>
          <tr>
            <td><form:label path="locale">City:</form:label></td>
            <td><form:input type="text" path="locale" /></td>
          </tr>
          <tr>
            <td><form:label path="state">State:</form:label></td>
            <td><form:input type="text" path="state" /></td>
          </tr>
          <tr>
            <td><form:label path="password">Password:</form:label></td>
            <td><form:input type="password" path="password"/></td>
          </tr>
          <tr>
            <td>Confirm Password:</td>
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
      <table class="table">
        <form:form method="POST" action="/login/user" modelAttribute="user">
      <div style="color:red;">
        <c:out value="${error}"/>
      </div>
        <tr>
          <td><form:label path="email">Email:</form:label></td>
          <td><form:input type="email" path="email" /></td>
        </tr>
        <tr>
          <td><form:label path="password">Password:</form:label></td>
          <td><form:input type="password" path="password"/></td>
        </tr>
        <tr>
          <td></td>
          <td><input type="submit" value="Login"/></td>
        </tr>
        </form:form>
      </table>

  	</fieldset>
  </div>
<br><br><br><br><br>
<div id="fb-root"></div>
<script>(function(d, s, id) {
    var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = 'https://connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.11&appId=326195874545248';
    fjs.parentNode.insertBefore(js, fjs);
  }(document, 'script', 'facebook-jssdk'));
</script>
  <div class="fb-login-button" data-max-rows="1" data-size="medium"
     data-button-type="login_with" data-show-faces="false" data-auto-logout-link="true" data-use-continue-as="true">
   </div>
  <fb:login-button
    scope="public_profile,email"
    onlogin="checkLoginState();">
  </fb:login-button>

</body>
</html>
