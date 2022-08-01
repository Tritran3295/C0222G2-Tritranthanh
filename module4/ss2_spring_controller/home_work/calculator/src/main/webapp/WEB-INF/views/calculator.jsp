<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 7/14/2022
  Time: 4:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Calculator</h1>
<form action="calculate" method="post">
    <div>
        <label>Number One: <input type="text" name="numberOne"></label>
    </div>
    <div>
        <label>Number Two: <input type="text" name="numberTwo"></label>
    </div>
    <button type="submit" name="calculating" value="+">Addition(+)</button>
    <button type="submit" name="calculating" value="-">Addition(-)</button>
    <button type="submit" name="calculating" value="*">Addition(*)</button>
    <button type="submit" name="calculating" value="/">Addition(/)</button>

    <h3>Result: ${result}</h3>
    <h5>Errors: ${announcement}</h5>
</form>
</body>
</html>
