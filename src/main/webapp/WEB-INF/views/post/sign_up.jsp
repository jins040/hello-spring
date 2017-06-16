<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-16
  Time: 오후 4:44
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
        <h3 class="text-muted">회원 가입</h3>
    </div>

    <div class="jumbotron">
        <form action="/post/sign-up" method="post">
            <div class="input-group input-group-md border_setting">
                <span class="input-group-addon">ID</span>
                <input type="text" name="userId" class="form-control" placeholder="User ID">
            </div>
            <div class="input-group input-group-md border_setting">
                <span class="input-group-addon">PassWord</span>
                <input type="text" name="password" class="form-control" placeholder="PassWord">
            </div>
            <div class="input-group input-group-md border_setting">
                <span class="input-group-addon">E-mail주소</span>
                <input type="text" name="email" class="form-control" placeholder="address@email.com">
            </div>

            <p><input type="submit" value="가입하기" class="btn btn-sm btn-success"></p>
        </form>
    </div>

    <footer class="footer">
        <p>&copy; 2017 Kitri, ds11.</p>
    </footer>

</div> <!-- /container -->

</body>
</html>
