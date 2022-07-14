<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 7/14/2022
  Time: 3:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="save" method="post">
    <h2>Sandwich Condiment</h2>
    <label>Lettuce</label>
    <input type="checkbox" name="condiment" value="Lettuce">
    <label>Tomato</label>
    <input type="checkbox" name="condiment" value="Tomato">
    <label>Mustard</label>
    <input type="checkbox" name="condiment" value="Mustard">
    <label>Sprouts</label>
    <input type="checkbox" name="condiment" value="Sprouts">
    <button type="submit">Select</button>
</form>
<div>
    <h3>Sandwich condiment with</h3>
    <p>Result: ${condiment}</p>
</div>
</body>
</html>
