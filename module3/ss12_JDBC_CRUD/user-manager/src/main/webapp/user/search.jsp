<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 6/1/2022
  Time: 9:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2> List Found</h2>
<div>
    <h1>Search follow country</h1>
</div>
<div align="center">
    <form method="get">
        <input type="hidden" value="searchCountry" name="nameUser">
    </form>
    <table border="1" cellpadding="5">
        <caption><h2>List of Users</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="user" items="${listUser}">
            <tr>
                <td><c:out value="${user.id}"/></td>
                <td><c:out value="${user.name}"/></td>
                <td><c:out value="${user.email}"/></td>
                <td><c:out value="${user.country}"/></td>
            </tr>
        </c:forEach>
        <tr>
            <td>
                <a href="/users">Back to list</a>
            </td>
        </tr>
    </table>
</div>
</body>
</html>
