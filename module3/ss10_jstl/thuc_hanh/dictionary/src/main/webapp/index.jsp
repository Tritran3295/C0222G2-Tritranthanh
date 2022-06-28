<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 6/27/2022
  Time: 3:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Vietnamese Dictionary</h2>
  <form action="/dictionary" method="post">
    <input type="text" name="search" placeholder="Enter your word: "/>
    <input type = "submit" id = "submit" value = "Search"/>
  </form>

  <h3>Result : ${result}</h3>
  <h3>Alert : ${alert}</h3>
  </body>
</html>
