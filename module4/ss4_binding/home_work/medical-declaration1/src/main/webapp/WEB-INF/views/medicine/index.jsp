<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 7/18/2022
  Time: 11:29 AM
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
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Date Of Birth</th>
        <th>Gender</th>
        <th>Country</th>
        <th>Id Card</th>
        <th>Info swap</th>
        <th>Number Vehicle</th>
        <th>Number sheet</th>
        <th>Date Start</th>
        <th>Date End</th>
        <th>Info in 14 days</th>
        <th>Option</th>
        <th>Option</th>

    </tr>
    <c:forEach items="${medicineList}" var="temp">
        <tr>
            <td>${temp.id}</td>
            <td>${temp.name}</td>
            <td>${temp.yearOfBirth}</td>
            <td>${temp.gender}</td>
            <td>${temp.country}</td>
            <td>${temp.idCard}</td>
            <td>${temp.vehicle}</td>
            <td>${temp.idVehicle}</td>
            <td>${temp.numberSheet}</td>
            <td>${temp.dayStart}</td>
            <td>${temp.dayEnd}</td>
            <td>${temp.activity14Day}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
