<%--
  Created by IntelliJ IDEA.
  User: jsj
  Date: 2023/05/08
  Time: 4:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>save</title>
</head>
<body>
<form action="/member/save" method="post"> <%--post방식으로 save로 정보를 보냄--%>
  <input type="text" name="memberEmail" placeholder="이메일">
  <input type="text" name="memberPassword" placeholder="비밀번호">
  <input type="text" name="memberName" placeholder="이름">
  <input type="text" name="memberAge" placeholder="나이">
  <input type="text" name="memberMobile" placeholder="전화번호">
  <input type="submit" value="회원가입">
</form>


</body>
</html>
