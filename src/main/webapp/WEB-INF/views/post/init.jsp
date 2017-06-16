<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-16
  Time: 오후 4:11
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
            <h3 class="text-muted">시작 화면입니다.</h3>
        </div>

        <div class="jumbotron">
            <form action="/post/view-all" method="post">
                <div class="input-group input-group-md border_setting">
                    <span class="input-group-addon">ID</span>
                    <input type="text" name="userId" class="form-control" placeholder="User ID">
                </div>
                <div class="input-group input-group-md border_setting">
                    <span class="input-group-addon">PassWord</span>
                    <input type="text" name="password" class="form-control" placeholder="PassWord">
                </div>
                <div style="float: right;">
                    <p>
                        <input type="submit" value="로그인" class="btn btn-sm btn-success">
                        <a href="/post/sign-up" class="btn btn-sm btn-success">회원가입</a>
                    </p>
                </div>
            </form>
        </div>

    </div> <!-- /container -->

</body>
</html>
