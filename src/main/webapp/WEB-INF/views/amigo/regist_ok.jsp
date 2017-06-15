<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-12
  Time: 오후 2:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Amigo Go</title>
</head>
<body>
    <h1>친구 등록 내용입니다.</h1>
    <ul>
        <li>${amigo.amigoName}</li>
        <li>${amigo.phoneNum}</li>
        <li>${amigo.email}</li>
    </ul>

    <a href="/amigo" class="btn btn-md btn-success">처음으로</a>
</body>
</html>
