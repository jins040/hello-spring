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
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Title</title>
    <style>
        .bg-2 {
        background-color: #474e5d; /* Dark Blue */
        color: #ffffff;
        }
    </style>
    <!-- Bootstrap core CSS -->
    <link href="/asset/css/bootstrap.css" rel="stylesheet">
    <link href="/asset/css/main.css" rel="stylesheet">
</head>
<body>

    <div class="container-fluid bg-2 margin_setting text-center">
        <span class="glyphicon glyphicon-list-alt margin_setting">
        <h6>자유게시판</h6>
        </span>
    </div>

    <div class="container-fluid margin_setting text-center">
        <table style="width:100%">
            <tr>
                <th>
                    <div class="input-group input-group-md">
                        <span class="input-group-addon">제목</span>
                        <p class="form-control">${bslol[bsNum-1].bsTitle}</p>
                        <%--<input type="text" name="title" class="form-control" placeholder="${bslol[bsNum-1].bsTitle}">--%>
                    </div>
                </th>
                <th>
                    <div class="input-group input-group-md">
                        <span class="input-group-addon">글쓴이</span>
                        <p class="form-control">${bslol[bsNum-1].bsWriter}</p>
                        <%--<input type="text" name="title" class="form-control" placeholder="${bslol[bsNum-1].bsWriter}">--%>
                    </div>
                </th>
            </tr>
            <tr>
                <td colspan="2">
                    <textarea name="content" class="form-control" placeholder="내용"></textarea>
                </td>
            </tr>
        </table>
    </div>

    <div class="margin_setting">
        <div style="float: right">
        <form action="/bs-sample" class="form_align_1">
            <input type="submit" value="이전" class="btn btn-xs btn-success">
        </form>
        </div>
        <div style="float: right">
            <form action="/bs-sample/bs-write" class="form_align_1">
                <input type="submit" value="글쓰기" class="btn btn-xs btn-success" >
            </form>
        </div>
    </div>

</body>
</html>
