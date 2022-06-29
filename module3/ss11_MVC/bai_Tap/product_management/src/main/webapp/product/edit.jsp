<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 6/29/2022
  Time: 11:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/product?action=edit">
    <table border="1">
        <tr>
            <td>Id</td>
            <td>
                <input type="text" name="id" id="id" value="${product.id}" readonly>
            </td>
        </tr>
        <tr>
            <td>name</td>
            <td>
                <input type="text" name="name" id="name" value="${product.name}">
            </td>
        </tr>
        <tr>
            <td>manufactor</td>
            <td>
                <input type="text" name="manufactor" id="manufactor" value="${product.manufactor}">
            </td>
        </tr>
        <tr>
            <td>price</td>
            <td>
                <input type="text" name="price" id="price" value="${product.price}">
            </td>
        </tr>
        <tr>
            <td>name</td>
            <td>
                <input type="text" name="detailProduct" id="detailProduct" value="${product.detailProduct}">
            </td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Edit Product"></td>
        </tr>
    </table>
</form>
</body>
</html>
