<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 6/2/2022
  Time: 4:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All Shop's Products</title>
</head>
<body>
<center>
    <h3 style="color: cornflowerblue">Welcome to MiuMiuShop</h3>

</center>

<div align="center">
<table border="1">
    <tr>
        <th>STT</th>
        <th>Name Product</th>
        <th>Product's detail</th>
        <th>Day Manufacturing</th>
        <th>Manufacturer</th>
        <th>Country</th>
    </tr>
    <c:forEach var="temp" items="${listProduct}">
        <tr>
            <td><c:out value="${temp.getStt()}"/></td>
            <td><c:out value="${temp.getNameProduct()}"/></td>
            <td><c:out value="${temp.getDetailProduct()}"/></td>
            <td><c:out value="${temp.getDateOfManufacture()}"/></td>
            <td><c:out value="${temp.getManufacturer()}"/></td>
            <td><c:out value="${temp.getCountryProduct()}"/></td>
        </tr>
    </c:forEach>


</table>
</div>
</body>
</html>
