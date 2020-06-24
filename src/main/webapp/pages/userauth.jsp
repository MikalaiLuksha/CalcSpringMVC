<%--
  Created by IntelliJ IDEA.
  User: Pelar
  Date: 24.06.2020
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UserAuth</title>
</head>
<body>
<form action="/user/auth" method="post">
    <input type="text" name="login" placeholder="Login">
    <input type="text" name="password" placeholder="Password">
    <button>Submit</button>
</form>

${message}
</body>
</html>
