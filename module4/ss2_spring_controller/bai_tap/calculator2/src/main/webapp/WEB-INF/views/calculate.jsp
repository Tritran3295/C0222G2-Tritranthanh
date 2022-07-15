<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 7/15/2022
  Time: 11:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/calculating" method="post">
    <label>Number One : <input type="number" name="numberOne" value="${numberOne}" required ></label>
    <label>Number Two : <input type="number" name="numberTwo" value="${numberTwo}" required ></label>
    <button type="submit" name="operation" value="+">Addition(+)</button>
    <button type="submit" name="operation" value="-">Addition(-)</button>
    <button type="submit" name="operation" value="*">Addition(*)</button>
    <button type="submit" name="operation" value="/">Addition(/)</button>
</form>
<h3>Result Division : ${result}</h3>
<h3>Errors : ${alert}</h3>
</body>
</html>
