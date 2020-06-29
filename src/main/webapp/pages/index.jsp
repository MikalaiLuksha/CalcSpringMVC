<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>

<c:if  test="${!check}">
<p><a href="/user/reg">Registration</a></p>
<p><a href="/user/auth">Authorisation</a></p>
</c:if>

<c:if test="${check}">
<p><a href="/calc">Calculation</a></p>
<p><a href="/history">History</a></p>
<p><a href="/logout">Logout</a></p>
</c:if>

${message}

</body>
</html>

