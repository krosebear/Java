<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ninja Gold</title>
</head>
<body>
  <div class="container">
    <a href="/reset" style="float:right;">Reset Game</a>
    <div class="gold">
      Total Gold: <c:out value="${gold}"/>
    </div>
    <div class="category">

        <h3>Farm</h3><br>
        <form action="/process" method="post">
	            	<input type="hidden" name="building" value="farm" />
	             	<input type="submit" value="Find Gold!"/>
	            </form>


        <h3>Cave</h3><br>
        <form action="/process" method="post">
	            	<input type="hidden" name="building" value="cave" />
	             	<input type="submit" value="Find Gold!"/>
	            </form>


        <h3>House</h3><br>
        <form action="/process" method="post">
	            	<input type="hidden" name="building" value="house" />
	             	<input type="submit" value="Find Gold!"/>
	            </form>


        <h3>Casino</h3><br>
        <form action="/process" method="post">
	            	<input type="hidden" name="building" value="casino" />
	             	<input type="submit" value="Find Gold!"/>
	            </form>
    </div>
    <br><br><hr>
    <div class="activity">
      <c:forEach var="msg" items="${messages}">
				<c:choose>
					<c:when test="${msg.contains('lost')}">
						<p class="red"><c:out value="${msg}"/></p>
					</c:when>
					<c:otherwise>
						<p class="green"><c:out value="${msg}"/></p>
					 </c:otherwise>
				</c:choose>
			</c:forEach>
    </div>
  </div>
</body>
</html>
