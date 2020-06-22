<%--
  Created by IntelliJ IDEA.
  User: LukshaNV
  Date: 22.06.2020
  Time: 9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main</title>
</head>
<body>
<form action="/calc" method="post">
    <input type="text" name="num1" placeholder="number 1">
    <select name="operation">
        <option disabled>Enter operation</option>
        <option value="plus"> + </option>
        <option value="minus"> - </option>
        <option value="times"> * </option>
        <option value="div"> / </option>
    </select>
    <input type="text" name="num2" placeholder="number 2">
    <button>Calc</button>

    <b> Result - ${result}</b>

    <p><a href="/">Return</a></p>


</body>
</html>

