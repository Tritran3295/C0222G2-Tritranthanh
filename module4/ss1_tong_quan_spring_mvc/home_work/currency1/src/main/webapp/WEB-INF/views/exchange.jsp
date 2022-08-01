<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 7/14/2022
  Time: 2:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/currency">
    <div>
        <p>USD : <input name="usd" type="number"></p>
        <p>Rate: <input name="rate" hidden></p>
        <button type="submit">exchange</button>
    </div>
    <h1>Result: ${vnd}</h1>
</form>
</body>
</html>
