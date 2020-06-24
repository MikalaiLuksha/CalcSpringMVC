<%--
  Created by IntelliJ IDEA.
  User: Pelar
  Date: 23.06.2020
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>

<form action="/user/reg" method="post">
    <input type="text" name="name" placeholder="Name">
    <input type="text" name="login" placeholder="Login">
    <input type="text" name="password" placeholder="Password">
    <button>Submit</button>
</form>

${message}

</body>
</html>
