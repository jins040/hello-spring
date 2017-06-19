<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-16
  Time: 오후 4:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="/post/view-all/write">글 등록하기</a>

    <c:forEach var="memberList" items="${memberList}">   <!--items에서 객체를 받아 var에 넣어준다.-->
        <ul>
            <li>Member # : ${memberList.memberSeq}</li>
            <li>
                User ID : <a href="/post/view-all/${memberList.memberSeq}">${memberList.userId}</a>(작성 글 목록 보기)
            </li>
            <li>PW : ${memberList.password}</li>
            <li>E-mail address : ${memberList.email}</li>
            <li>Point : ${memberList.point}</li>
            <li>Joined Date : ${memberList.joinDate}</li>
        </ul>
    </c:forEach>
</body>
</html>
