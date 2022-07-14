<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 7/13/2022
  Time: 2:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/currency" method="get">
    <fieldset>
        <legend>Currency</legend>
        <ul>
            <li>USD : <input name="usd" type="text" size="30"></li>
        </ul>
        <input type="submit" value="Exchange">
    </fieldset>
</form>
<h2>Result : ${vnd}</h2>
</body>
</html>
