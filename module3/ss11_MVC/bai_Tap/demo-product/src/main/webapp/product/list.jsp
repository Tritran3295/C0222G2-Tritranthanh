<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 5/31/2022
  Time: 10:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh sách sản phẩm</h1>
<a href="/products?action=create">Tạo mới sản phẩm</a>
<c:forEach items="${danhSach}" var="temp">
    <h3>${temp.idProduct},${temp.nameProduct},${temp.priceProduct},${temp.describeProduct},${temp.hostProduct}
    <a href="/products?action=edit&idProduct=${temp.idProduct}">Edit</a>
    <a href="/products?action=delete&idProduct=${temp.idProduct}">Delete</a>
        <a href="/products?action=detail&idProduct=${temp.idProduct}">Detail</a>
    </h3>
</c:forEach>

</body>
</html>
