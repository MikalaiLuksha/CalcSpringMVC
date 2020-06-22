
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<ul style="list-style: decimal">
<c:forEach items="${history}" var="res">
    <li>${res}</li>
</c:forEach>
</ul>

<p><a href="/">Return</a></p>
</body>
</html>
