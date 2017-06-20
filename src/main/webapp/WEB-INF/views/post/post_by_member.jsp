<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-19
  Time: 오전 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="post" items="${post}">
        <ul>
            <li>${post.memberSeq}</li>
            <li>${post.postSeq}</li>
            <li>${post.title}</li>
            <li>${post.content}</li>
            <li>${post.writeDate}</li>
        </ul>
</c:forEach>
<a href="/post/view-all">처음 화면으로</a>
</body>
</html>
