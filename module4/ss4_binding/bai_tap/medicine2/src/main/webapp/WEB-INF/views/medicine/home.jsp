<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 7/18/2022
  Time: 2:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
    <a href="/create">Create</a>
</p>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Year Of Birth</th>
        <th>Vehicle</th>
        <th>Day Start</th>
        <th>Day End</th>
        <th>Activity 14 Day</th>
        <th>Option</th>
    </tr>
    <c:forEach var="temp" items="${medicineList}">
        <tr>
            <td>${temp.id}</td>
            <td>${temp.name}</td>
            <td>${temp.yearOfBirth}</td>
            <td>${temp.vehicle}</td>
            <td>${temp.dayStart}</td>
            <td>${temp.dayEnd}</td>
            <td>${temp.activity14Day}</td>
            <td>
                <a href="/edit?id=${temp.id}">Edit</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
