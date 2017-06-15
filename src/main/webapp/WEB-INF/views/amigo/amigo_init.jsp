<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-12
  Time: 오후 2:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Amigo Initial Display</title>

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body>

    <h1 class="text-muted">Amigo 초기 화면입니다.</h1>

    <div class="jumbotron">
        <form action="/amigo/regist">
            <p><input type="submit" value="Go to Registration Page" class="btn btn-lg btn-success"></p>
        </form>
    </div>

    <c:forEach var="amigo" items="${amigoList}">
        <li>
            #${amigo.amigoId} : <a href="/amigo/${amigo.amigoName}">${amigo.amigoName}</a>
        </li>
    </c:forEach>

</body>
</html>
