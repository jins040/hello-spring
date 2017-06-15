<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-12
  Time: 오후 4:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>${amigo.amigoId}번 째 Amigo가 조회되었습니다.</h1>
    <ul>
        <li>#${amigo.amigoId}</li>
        <li>이름 : ${amigo.amigoName}</li>
        <li>전화 번호 : ${amigo.phoneNum}</li>
        <li>이메일 : ${amigo.email}</li>
    </ul>

    <a href="/amigo" class="btn btn-md btn-success">이전화면</a>
</body>
</html>
