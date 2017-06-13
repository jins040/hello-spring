<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-12
  Time: 오전 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
    <h1>전체보기 페이지입니다.</h1>


    <c:forEach var="article" items="${list}">   <!--items에서 객체를 받아 var에 넣어준다.-->
        <ul>
            <li>글 번호 : ${article.articleId}</li>
            <li>제목 : <a href="/bbs/${article.articleId}">${article.title}</a></li>
            <li>작성자 : ${article.author}</li>
            <li>내용 : ${article.content}</li>
        </ul>
    </c:forEach>


    <p>${list[0].title}</p>

<a href="/bbs/write">글쓰기</a>    <!--Get 방식으로, GET 화면으로 가야 되기 때문에-->
</body>
</html>
