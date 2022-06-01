<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 6/1/2022
  Time: 10:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
    <h2>List Detail Product</h2>
    <table>
        <tr>
            <td>Id Product : </td>
            <td>${requestScope["product"].getIdProduct()}</td>
        </tr>
        <tr>
            <td>Name Product : </td>
            <td>${requestScope["product"].getNameProduct()}</td>
        </tr>
        <tr>
            <td>Price Product : </td>
            <td>${requestScope["product"].getPriceProduct()}</td>
        </tr>
        <tr>
            <td>Describe Product : </td>
            <td>${requestScope["product"].getDescribeProduct()}</td>
        </tr>
        <tr>
            <td>Host Product : </td>
            <td>${requestScope["product"].getHostProduct()}</td>
        </tr>
    </table>
</form>

</body>
</html>
