<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 5/30/2022
  Time: 4:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>Name Customer</th>
        <th>Day of birth </th>
        <th>Address </th>
        <th>Image</th>
    </tr>
    <c:forEach var="temp" items="${listCustomer}">
        <tr>
            <td>${temp.name}</td>
            <td>${temp.dateOfBirth}</td>
            <td>${temp.address}</td>
            <td><img src="${temp.image}" width="50px" alt="" ></td>
        </tr>

    </c:forEach>
</table>
</body>
</html>
