<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-16
  Time: 오후 4:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>회원 가입이 완료되었습니다..</h1>
    <ul>
        <li>ID: ${member.userId}</li>
        <li>PW: ${member.password}</li>
        <li>Email: ${member.email}</li>
        <li>Point: 글을 등록할 때마다 10점씩 적립됩니다.</li>
    </ul>
<a href="/post">처음 화면으로</a>
</body>
</html>
