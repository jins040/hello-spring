<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-12
  Time: 오전 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>      <!--dependency 설정-->
<html>
<head>
    <title>Title</title>
    <!-- Latest compiled and minified CSS -->
    <!--웹으로 타고 가기 때문에 css파일로 가져올 때보다 늦다.-->
    <link rel="stylesheet" href="/asset/css/bootstrap.css">
</head>
<body>
    <h1>전체보기 페이지입니다.</h1>


    <c:forEach var="article" items="${list}">   <!--items에서 객체를 받아 var에 넣어준다.-->
        <ul>
            <li>글 번호 : ${article.articleId}</li>
            <li>
                제목 : <a href="/bbs/${article.articleId}">${article.title}</a>
                    (${article.author})
            </li>
        </ul>
    </c:forEach>

<a href="/bbs/write">글쓰기</a>    <!--Get 방식으로, GET 화면으로 가야 되기 때문에-->

    <!--js파일은 밑에 scrip setting-->
<script src="/asset/js/jquery-3.2.1.js"></script>
<script src="/asset/js/bootstrap.js"></script>
</body>
</html>
