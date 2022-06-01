<% Object vnd = null; %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
MỚI

<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="/surprise">
    <label>Rate: </label><br/>
    <input type="text" name="rate" placeholder="RATE" value="22000"/><br/>
    <label>USD: </label><br/>
    <input type="text" name="usd" placeholder="USD" value="0"/><br/>
    <input type = "submit" id = "submit" value = "Converter"/>
  </form>
  <h1>VND: ${vnd}</h1>
  </body>
</html>
