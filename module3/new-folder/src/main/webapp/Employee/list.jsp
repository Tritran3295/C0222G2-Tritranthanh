<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 6/7/2022
  Time: 4:22 PM
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
    <h1>List Employee</h1>
    <h2>
        <a href="/">Back</a>
    </h2>
    <h1><a href="/Employees?action=create">
        create
    </a></h1>
    <form action="">

    </form>
</center>
<div>
    <table border="1">
        <tr>
            <th>Id </th>
            <th>Name Employee </th>
            <th>Day Of Birth </th>
            <th>Id Card Employee </th>
            <th>Salary </th>
            <th>Phone </th>
            <th>Email </th>
            <th>Address </th>
            <th>id Position </th>
            <th>Id Degree Education</th>
            <th>Id Division</th>
            <th>Option</th>
            <th>Option</th>
        </tr>
        <c:forEach var="temp" items="${employeeList}">
            <tr>
                <td>${temp.idEmployee}</td>
                <td><c:out value="${temp.nameEmployee}"/></td>
                <td><c:out value="${temp.dayOfBirth}"/></td>
                <td><c:out value="${temp.idCardEmployee}"/> </td>
                <td><c:out value="${temp.salary}"/></td>
                <td><c:out value="${temp.phone}"/></td>
                <td><c:out value="${temp.email}"/></td>
                <td><c:out value="${temp.address}"/></td>
                <td>
                    <c:if test="${temp.idPosition == 1}">Lễ Tân</c:if>
                    <c:if test="${temp.idPosition == 2}">Phục Vụ </c:if>
                    <c:if test="${temp.idPosition == 3}">Chuyên Viên</c:if>
                    <c:if test="${temp.idPosition == 4}">Giám Sát </c:if>
                    <c:if test="${temp.idPosition == 5}">Quản Lý </c:if>
                    <c:if test="${temp.idPosition == 6}">Giám Đốc </c:if>
                </td>
                <td>
                    <c:if test="${temp.idDegreeEducation == 1}">Trung Cấp</c:if>
                    <c:if test="${temp.idDegreeEducation == 2}">Cao Đẳng</c:if>
                    <c:if test="${temp.idDegreeEducation == 3}">Đại Học</c:if>
                    <c:if test="${temp.idDegreeEducation == 4}">Sau Đại Học</c:if>
                </td>
                <td>
                    <c:if test="${temp.idDivision == 1}">Sale-Marketing</c:if>
                    <c:if test="${temp.idDivision == 2}">Hành Chính</c:if>
                    <c:if test="${temp.idDivision == 3}">Phục Vụ</c:if>
                    <c:if test="${temp.idDivision == 4}">Quản Lý</c:if>
                </td>
                <td>
                    <a href="/Employees?action=edit&id=${temp.idEmployee}">Edit</a>
                </td>
                <td>
                    <a href="/Employees?action=delete&id=${temp.idEmployee}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
<%--<table class="table table-dark">--%>
<%--    <thead>--%>
<%--    <tr>--%>
<%--        <th scope="col">Id </th>--%>
<%--        <th scope="col">Name Employee </th>--%>
<%--        <th scope="col">Day Of Birth </th>--%>
<%--        <th scope="col">Id Card Employee </th>--%>
<%--        <th scope="col">Salary </th>--%>
<%--        <th scope="col">Phone </th>--%>
<%--        <th scope="col">Email </th>--%>
<%--        <th scope="col">Address </th>--%>
<%--        <th scope="col">id Position </th>--%>
<%--        <th scope="col">Id Degree Education</th>--%>
<%--        <th scope="col">Id Division</th>--%>
<%--        <th scope="col">User Name</th>--%>
<%--    </tr>--%>
<%--    </thead>--%>
<%--    <tbody>--%>
<%--<c:forEach var="temp" items="${employeeList}">--%>

<%--<tr>--%>
<%--        <th scope="row">1</th>--%>
<%--        <td>Mark</td>--%>
<%--        <td>Otto</td>--%>
<%--        <td>@mdo</td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--        <th scope="row">2</th>--%>
<%--        <td>Jacob</td>--%>
<%--        <td>Thornton</td>--%>
<%--        <td>@fat</td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--        <th scope="row">3</th>--%>
<%--        <td>Larry</td>--%>
<%--        <td>the Bird</td>--%>
<%--        <td>@twitter</td>--%>
<%--    </tr>--%>
<%--    </tbody>--%>
<%--</table>--%>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>

</html>
