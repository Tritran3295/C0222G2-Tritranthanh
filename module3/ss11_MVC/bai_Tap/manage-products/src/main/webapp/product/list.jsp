<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 5/31/2022
  Time: 3:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="ProductServlet?action=create"> Create Product</a>
<table border="1">
    <tr>
        <th>Id Product</th>
        <th>Name Product</th>
        <th>Price Product</th>
        <th>Describe Product</th>
        <th>Host Product</th>
    </tr>
    <c:forEach items="${products}" var="temp">
        <tr>
            <td>${temp.getIdProduct()}</td>
            <td>${temp.getNameProduct()}</td>
            <td>${temp.getPriceProduct()}</td>
            <td>${temp.getDescribeProduct()}</td>
            <td>${temp.getHostProduct()}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
