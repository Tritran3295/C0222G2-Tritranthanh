<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 5/31/2022
  Time: 11:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <input type="number" name="idProduct" value="${productEdit.idProduct}">
    <input type="name" name="nameProduct" value="${productEdit.nameProduct}">
    <input type="price" name="priceProduct" value="${productEdit.priceProduct}">
    <input type="describe" name="describeProduct" value="${productEdit.describeProduct}">
    <input type="host" name="hostProduct" value="${productEdit.hostProduct}">
    <button>Edit</button>

</form>

</body>
</html>
