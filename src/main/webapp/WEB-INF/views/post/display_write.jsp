<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-16
  Time: 오후 3:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>작성 글 출력 화면입니다.</h1>
    <ul>
        <li>${post.title}</li>
        <li>${post.content}</li>
        <li>${post.memberSeq}</li>
    </ul>
    <a href="/post/view-all">처음 화면으로</a>
</body>
</html>
