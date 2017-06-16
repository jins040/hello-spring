<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-16
  Time: 오후 3:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- Bootstrap core CSS -->
    <link href="/asset/css/bootstrap.css" rel="stylesheet">
</head>
<body>

<div class="container">
    <div class="header clearfix">
        <nav>
            <ul class="nav nav-pills pull-right">
                <li role="presentation" class="active"><a href="#">Home</a></li>
            </ul>
        </nav>
        <h3 class="text-muted">글 쓰기 화면입니다.</h3>
    </div>

    <div class="jumbotron">
        <form action="/post/view-all/write" method="post">
            <div class="input-group input-group-md border_setting">
                <span class="input-group-addon">제목</span>
                <input type="text" name="title" class="form-control" placeholder="title">
            </div>
            <div class="input-group input-group-md border_setting">
                <span class="input-group-addon">내용</span>
                <input type="text" name="content" class="form-control" placeholder="content">
            </div>
            <div class="input-group input-group-md border_setting">
                <span class="input-group-addon">사용자 번호</span>
                <input type="text" name="memberSeq" class="form-control" placeholder="member#">
            </div>
            <p><input type="submit" value="글 등록하기" class="btn btn-sm btn-success"></p>
        </form>
    </div>

    <footer class="footer">
        <p>&copy; 2017 Kitri, ds11.</p>
    </footer>

</div> <!-- /container -->

</body>
</html>
