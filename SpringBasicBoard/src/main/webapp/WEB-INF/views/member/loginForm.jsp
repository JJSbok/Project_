<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: jsj
  Date: 2023/05/22
  Time: 4:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>로그인</h1>
<hr>
<form method="post">
    <table>
        <tr>
            <td>아이디</td>
            <td><input type ="text" name="uid"></td>
        </tr>
        <tr>
            <td>비밀번호</td>
            <td><input type ="password" name="pw"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type ="submit" value="로그인"></td>
        </tr>
    </table>
</form>
</body>
</html>