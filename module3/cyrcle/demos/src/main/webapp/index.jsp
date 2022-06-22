<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 5/27/2022
  Time: 5:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style type="text/css">
      .login{
        height:180px; width:200px;
        margin:0;
        padding:10px;
        border:1px #CCC solid;
      }
      .login input{
        padding:1px; margin:5px
      }
    </style>
  </head>
  <body>

  <form method="post" action="/login">
    <div class="login">
      <h2>Login</h2>
      <input type="text" name="username" size="30" placeholder="username">
      <input type="password" name="password" size="30" placeholder="password">
      <input type="submit" value="Sign in">

    </div>
  </form>

  </body>
</html>
