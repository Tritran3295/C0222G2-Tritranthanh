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
<form action="calculate" method="post">
    <div>
        <label>Number One: <input type="text" name="numberOne"></label>
    </div>
    <div>
        <label>Number Two: <input type="text" name="numberTwo"></label>
    </div>
    <select>
        <option name="calculating" value="+">+</option>
        <option name="calculating" value="-">-</option>
        <option name="calculating" value="*">*</option>
        <option name="calculating" value="/">/</option>
    </select>
    <button type="submit">Calculator</button>
    <h3>Result: ${result}</h3>
</form>
</body>
</html>
