<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 7/13/2022
  Time: 4:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/dictionary/translate">
    <div>
        <lable>Enter English word :</lable>
        <input type="text" name="eng">
    </div>
    <div>
        <button>submit</button>
    </div>
    <div>
        Dictionary : ${str}
    </div>
</form>
</body>
</html>
