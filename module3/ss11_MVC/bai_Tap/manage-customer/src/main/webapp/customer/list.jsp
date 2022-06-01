<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 5/31/2022
  Time: 10:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<td><a href="CustomerServlet?action=create">Create Customer</a></td>

<table border="1">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>email</th>
        <th>address</th>
    </tr>
    <c:forEach items="${customers}" var="temp">
        <tr>
            <td>${temp.getId()}</td>
            <td>${temp.getName()}</td>
            <td>${temp.getEmail()}</td>
            <td>${temp.getAddress()}</td>
        </tr>
    </c:forEach>
    <tr>
    </tr>
</table>
</body>
</html>
