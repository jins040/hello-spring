<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-13
  Time: 오후 4:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <style>
        .border_setting {
            margin: 10px;
        }
    </style>

    <!-- Bootstrap core CSS -->
    <link href="/asset/css/bootstrap.css" rel="stylesheet">

    <link href="/asset/css/main.css" rel="stylesheet">

</head>
<body>

<div class="container">
    <div class="header clearfix">
        <nav>
            <ul class="nav nav-pills pull-right">
                <li role="presentation"><a href="#">Home</a></li>
                <li role="presentation"><a href="#">About</a></li>
                <li role="presentation"><a href="#">Contact</a></li>
            </ul>
        </nav>
        <h3 class="text-muted">글 등록 화면입니다.</h3>
    </div>

    <div class="jumbotron">
        <form action="/bs-sample" method="post">
            <div class="input-group input-group-lg border_setting">
                <span class="input-group-addon">제목</span>
                <input type="text" name="bs_title" class="form-control" placeholder="Title">
            </div>
            <div class="input-group input-group-lg border_setting">
                <span class="input-group-addon">작성자</span>
                <input type="text" name="bs_writer" class="form-control" placeholder="Writer">
            </div>
            <div class="input-group input-group-lg border_setting">
                <span class="input-group-addon">내용</span>
                <textarea name="bs_content" class="form-control" placeholder="Content"></textarea>
            </div>

            <div style="float: right">
                <input type="submit" value="등록" class="btn btn-sm btn-success input_align_1">
                <input type="submit" value="처음으로" class="btn btn-sm btn-success input_align_1">
            </div>
        </form>
    </div>
</div>

</body>
</html>
