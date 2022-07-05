
<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 7/3/2022
  Time: 11:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
          crossorigin="anonymous">
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.css">
    <style>
        /*body{*/
        /*    box-sizing: border-box;*/
        /*    margin: 0px;*/
        /*    padding: 0px;*/
        /*    background: url("https://statics.vinpearl.com/Tong%20quan_1647430024_1647852023.png") center/cover no-repeat;*/
        /*}*/
        html {
            font-size: 12px !important;
        }
    </style>
</head>
<body>
<div class="container-fluid bg-success text-white">
    <div class="col-12 row">
        <div class="col-1 "><img src="https://furamavietnam.com/wp-content/uploads/2018/08/logo.png" style="width:75px;"
                                 class="rounded-pill"></div>
        <div class="col-11 ">
            <div class="col-lg-12 row">
                <div class="col-lg-10 text-center"><h1 style="color: sandybrown">Furama Management</h1></div>
                <div class="col-lg-2 ">
                    <p>Welcome to ...<br><strong>...Furama Resort!!!</strong></p>
                </div>
            </div>
        </div>
    </div>
    <div class="col-12 row ">
        <nav class="navbar">
            <div class="container-fluid text-white-50 bg-dark">
                <a class="navbar-brand" href="/index.jsp">Home</a>
                <a class="navbar-brand" href="/customer?action=create">Create New Customer</a>
                <form class="d-flex navbar-brand">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search"
                           width="100px">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
            </div>
        </nav>
    </div>
</div>

<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Edit Customer</h2>
            </caption>
            <tr>
                <th>Customer ID:</th>
                <td>
                    <input type="text" name="idCustomer" id="idCustomer" value="${idCustomer}" readonly size="45"/>
                </td>
            </tr>
            <tr>
                <th>Customer Name:</th>
                <td>
                    <input type="text" name="nameCustomer" id="nameCustomer" value="${nameCustomer}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Day Of Birth:</th>
                <td>
                    <input type="text" name="dayOfBirth" id="dayOfBirth" value="${dateOfBirth}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Gender:</th>
                <td>
                    <select name="gender">
                        <c:choose>
                            <c:when test="${gender == 0}">
                                <option value="1">Nam</option>
                                <option value="0" selected>Nữ</option>
                                <option value="2">Khác</option>
                            </c:when>
                            <c:when test="${gender == 1}">
                                <option value="1" selected>Nam</option>
                                <option value="0" >Nữ</option>
                                <option value="2">Khác</option>
                            </c:when>
                            <c:when test="${gender == 2}">
                                <option value="1">Nam</option>
                                <option value="0" >Nữ</option>
                                <option value="2" selected>Khác</option>
                            </c:when>
                        </c:choose>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Id Card:</th>
                <td>
                    <input type="text" name="idCard" id="idCard" value="${idCard}" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Phone Number:</th>
                <td>
                    <input type="text" name="phoneNumber" id="phoneNumber" value="${numberPhone}" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Email:</th>
                <td>
                    <input type="text" name="email" id="email" value="${email}" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Address:</th>
                <td>
                    <input type="text" name="address" id="address" value="${address}" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Customer Type:</th>
                <td>
                    <select name="idCustomerType" id="idCustomerType">
                        <c:forEach var="temp" items="${customerTypeList}">
                            <c:choose>
                                <c:when test="${temp.idCustomerType == customerType}">
                                    <option value="${temp.idCustomerType}" selected>${temp.nameCustomerType}</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="${temp.idCustomerType}">${temp.nameCustomerType}</option>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Status</th>
                <td>
                    <select name="status" id="status">
                        <c:choose>
                            <c:when test="${status == 0}">
                                <option value="0" selected>Chưa Xoá</option>
                                <option value="1">Đã Xoá</option>
                            </c:when>
                            <c:when test="${status == 1}">
                                <option value="0">Chưa Xoá</option>
                                <option value="1" selected>Đã Xoá</option>
                            </c:when>
                        </c:choose>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>

</html>
