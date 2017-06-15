<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-12
  Time: 오후 2:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Amigo Register</title>

    <style>
        .border_setting {
            margin: 10px;
        }
    </style>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body>

    <div class="container">
        <div class="header clearfix">
            <nav>
                <ul class="nav nav-pills pull-right">
                    <li role="presentation" class="active"><a href="#">Home</a></li>
                    <li role="presentation"><a href="#">About</a></li>
                    <li role="presentation"><a href="#">Contact</a></li>
                </ul>
            </nav>
            <h3 class="text-muted">Amigo Registration 화면입니다.</h3>
        </div>

        <div class="jumbotron">
            <form action="/amigo/regist" method="post">
                <div class="input-group input-group-lg border_setting">
                    <span class="input-group-addon">친구 이름</span>
                    <input type="text" name="amigoName" class="form-control" placeholder="Amigo Name">
                </div>
                <div class="input-group input-group-lg border_setting">
                    <span class="input-group-addon">핸드폰</span>
                    <input type="text" name="phoneNum" class="form-control" placeholder="Phone #">
                </div>
                <div class="input-group input-group-lg border_setting">
                    <span class="input-group-addon">이메일</span>
                    <input type="text" name="email" class="form-control" placeholder="Email Address">
                </div>

                <p><input type="submit" value="등록" class="btn btn-lg btn-success"></p>
            </form>
        </div>

</body>
</html>
