<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 7/4/2022
  Time: 1:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../../bootstrap-5/normalize.css">
    <title>Furama - Edit Customer</title>
    <link rel="stylesheet" href="../../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../datatables/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" href="../../bootstrap-5/bootstrap.min.css">
</head>
<body>
<div class="container-fluid bg-success text-white ">
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
                <a class="navbar-brand" href="/index.jsp" style="width: 100%">Home</a>
            </div>
        </nav>
    </div>
</div>
<form action="/customer?action=edit" method="post" style="background-color: lightcyan">
    <h4> Edit Customer</h4>
    <br>
    <div class="row mb-3">
        <label for="inputEmail0" class="col-sm-2 col-form-label">Id Employee</label>
        <div class="col-sm-10">
            <input type="text" name="id" class="form-control" value="${idCustomer}" id="inputEmail0" readonly>
        </div>
    </div>
    <div class="row mb-3">
        <label for="inputEmail1" class="col-sm-2 col-form-label">Name</label>
        <div class="col-sm-10">
            <input type="text" name="nameCustomer" class="form-control" value="${nameCustomer}" id="inputEmail1">
            <small class="text-danger">${errors.name}</small>
        </div>
    </div>
    <div class="row mb-3">
        <label for="inputEmail2" class="col-sm-2 col-form-label">Birthday</label>
        <div class="col-sm-10">
            <input type="date" name="dayOfBirth" class="form-control" value="${dateOfBirth}" id="inputEmail2">
        </div>
    </div>
    <div class="row mb-3">
        <label for="inputEmail3" class="col-sm-2 col-form-label">Gender</label>
        <div class="col-sm-10">
            <select name="gender" id="inputEmail3" class="form-select" aria-label="Default select example">
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
        </div>
    </div>
    <div class="row mb-3">
        <label for="inputEmail4" class="col-sm-2 col-form-label">ID Card</label>
        <div class="col-sm-10">
            <input type="text" name="idCard" class="form-control" value="${idCard}" id="inputEmail4">
            <small class="text-danger">${errors.idCard}</small>
        </div>

    </div>

    <div class="row mb-3">
        <label for="inputEmail5" class="col-sm-2 col-form-label">Number Phone</label>
        <div class="col-sm-10">
            <input type="text" name="phoneNumber" class="form-control" value="${phoneNumber}" id="inputEmail5">
            <small class="text-danger">${errors.numberPhone}</small>
        </div>
    </div>
    <div class="row mb-3">
        <label for="inputEmail6" class="col-sm-2 col-form-label">Email</label>
        <div class="col-sm-10">
            <input type="email" name="email" class="form-control" value="${email}" id="inputEmail6">
            <small class="text-danger">${errors.email}</small>
        </div>

    </div>
    <div class="row mb-3">
        <label for="inputEmail7" class="col-sm-2 col-form-label">Address</label>
        <div class="col-sm-10">
            <input type="text" name="address" class="form-control" value="${address}" id="inputEmail7">
        </div>
    </div>
    <div class="row mb-3">
        <label for="inputEmail10" class="col-sm-2 col-form-label">Type Customer</label>
        <div class="col-sm-10">
            <select name="idCustomerType" id="inputEmail10" class="form-select" aria-label="Default select example">
                <c:forEach items="${customerTypeList}" var="temp">
                    <c:choose>
                        <c:when test="${temp.idCustomerType == idCustomerType}">
                            <option value="${temp.idCustomerType}"
                                    selected>${temp.nameCustomerType}</option>
                        </c:when>
                        <c:otherwise>
                            <option value="${temp.idCustomerType}">${temp.nameCustomerType}</option>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
            </select>
        </div>
    </div>
    <div class="row mb-3">
        <label for="inputEmail11" class="col-sm-2 col-form-label">Status</label>
        <div class="col-sm-10">
            <select name="status" id="inputEmail11" class="form-select" aria-label="Default select example">
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
        </div>
    </div>
    <div class="row mb-3">
        <label for="inputEmail12" class="col-sm-2 col-form-label"></label>
        <div class="col-sm-10">
            <button type="submit" class="btn btn-primary" id="inputEmail12">Save</button>
            <a class="btn btn-secondary" href="/employee" style="float: right">Cancel</a>
        </div>
    </div>
</form>
</body>
<script src="../../bootstrap-5/bootstrap.bundle.min.js"></script>
<script src="../../jquery/jquery-3.5.1.min.js"></script>
<script src="../../datatables/js/jquery.dataTables.min.js"></script>
<script src="../../datatables/js/dataTables.bootstrap4.min.js"></script>
</html>
