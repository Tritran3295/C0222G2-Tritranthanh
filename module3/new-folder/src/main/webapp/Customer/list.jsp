<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 6/6/2022
  Time: 12:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h1>List Customer</h1>
    <h2>
        <a href="/">Back</a>
    </h2>
    <h1><a href="/Customers?action=create">
        create
    </a></h1>
    <form action="">

    </form>
</center>
<div>
    <form action="/Customers" method="get">
        <input type="hidden" value="search" name="action">
        <input class="search" id="search-input" type="text" name="nameCustomer"
               placeholder="Search by customer name" style="width: 200px" value="${nameCustomer}">
        <input type="submit" value="search"  style="border-radius: 5px; border: 1px solid #0c5460">

    </form>
<table border="1">
    <tr>
        <th>Id </th>
        <th>Name Customer </th>
        <th>Day Of Birth </th>
        <th>Gender </th>
        <th>Id Card </th>
        <th>Phone </th>
        <th>Email </th>
        <th>Address </th>
        <th>Type Customer </th>
        <th>Option</th>
        <th>Option</th>
    </tr>
    <c:forEach var="temp" items="${listCustomer}">
        <tr>
            <td><c:out value="${temp.idCustomer}"/></td>
            <td><c:out value="${temp.nameCustomer}"/></td>
            <td><c:out value="${temp.birthday}"/></td>
            <td>
                <c:if test="${temp.gender == 0}">Nữ</c:if>
                <c:if test="${temp.gender == 1}">Nam</c:if>
                <c:if test="${temp.gender == 2}">Khác</c:if>
            </td>
            <td><c:out value="${temp.idCard}"/></td>
            <td><c:out value="${temp.phone}"/></td>
            <td><c:out value="${temp.email}"/></td>
            <td><c:out value="${temp.address}"/></td>
            <td>
                <c:if test="${temp.idTypeCustomer == 1}">Diamond</c:if>
                <c:if test="${temp.idTypeCustomer == 2}">Gold</c:if>
                <c:if test="${temp.idTypeCustomer == 3}">Silver</c:if>
            </td>
            <td>
                <a href="/Customers?action=edit&id=${temp.idCustomer}">Edit</a>
            </td>
            <td>
                <a href="/Customers?action=delete&id=${temp.idCustomer}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</div>

<include src="./header.html"></include>

Your content here

<include src="./footer.html"></include>
</body>
</html>
