<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link rel="stylesheet" href="../../bootstrap-5/normalize.css">
    <title>Furama - New Customer</title>
    <link rel="stylesheet" href="../../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../datatables/css/dataTables.bootstrap4.min.css">
    <style>
<%--        <%@include file="/css/style.css" %>--%>
    </style>
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
<div class="container-fluid col-auto">
    <div class="container-fluid mt-3 w-50">
        <form action="/customer?action=create" method="post">
            <h4>Add New Customer</h4>
            <br>
            <div class="row mb-3">
                <label for="inputEmail1" class="col-sm-2 col-form-label">Name</label>
                <div class="col-sm-10">
                    <input type="text" name="nameCustomer" class="form-control" id="inputEmail1">
                    <small class="text-danger">${errors.name}</small>
                </div>

            </div>
            <div class="row mb-3">
                <label for="inputEmail2" class="col-sm-2 col-form-label">Date Of Birth</label>
                <div class="col-sm-10">
                    <input type="date" name="dayOfBirth" class="form-control" id="inputEmail2">
                    <small class="text-danger">${errors.birthday}</small>
                </div>

            </div>
            <div class="row mb-3">
                <label for="inputEmail3" class="col-sm-2 col-form-label">Gender</label>
                <select class="form-select" aria-label="Default select example" id="inputEmail3" name="gender">
                    <option selected disabled>Choice Customer Gender</option>
                    <option value="1">Nam</option>
                    <option value="0">Nữ</option>
                    <option value="2">Other</option>
                </select>
            </div>
            <div class="row mb-3">
                <label for="inputEmail4" class="col-sm-2 col-form-label">Id Card</label>
                <div class="col-sm-10">
                    <input type="text" name="idCard" class="form-control" id="inputEmail4">
                    <small class="text-danger">${errors.idCard}</small>
                </div>

            </div>
            <div class="row mb-3">
                <label for="inputEmail5" class="col-sm-2 col-form-label">Number Phone</label>
                <div class="col-sm-10">
                    <input type="text" name="phoneNumber" class="form-control" id="inputEmail5">
                    <small class="text-danger">${errors.numberPhone}</small>
                </div>

            </div>
            <div class="row mb-3">
                <label for="inputEmail6" class="col-sm-2 col-form-label">Email</label>
                <div class="col-sm-10">
                    <input type="text" name="email" class="form-control" id="inputEmail6">
                    <small class="text-danger">${errors.email}</small>
                </div>

            </div>
            <div class="row mb-3">
                <label for="inputEmail7" class="col-sm-2 col-form-label">Address</label>
                <div class="col-sm-10">
                    <input type="text" name="address" class="form-control" id="inputEmail7">
                </div>
            </div>
            <div class="row mb-3">
                <label for="inputEmail8" class="col-sm-2 col-form-label">Type Customer</label>
                <div class="col-sm-10">
                    <select name="idCustomerType" id="inputEmail8" class="form-select"
                            aria-label="Default select example">
                        <option>-- Choose Type Customer --</option>
                        <c:forEach items="${customerTypeList}" var="temp">
                            <option value="${temp.idCustomerType}">${temp.nameCustomerType}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
            <div class="row mb-3">
                <label for="inputEmail9" class="col-sm-2 col-form-label"></label>
                <div class="col-sm-10">
                    <button type="submit" class="btn btn-primary" id="inputEmail9">Save</button>
                    <a class="btn btn-secondary" href="/customer" style="float: right">Cancel</a>
                </div>
            </div>



<%--<div class="container-fluid row " style="padding: 0">--%>

<%--    <div class="container-fluid col-auto">--%>
<%--        <div class="container-fluid mt-2 w-50">--%>
<%--            <form action="/customer?action=create" method="post">--%>
<%--                <h4>Add New Customer</h4>--%>
<%--                <br>--%>
<%--                <div class="row mb-3">--%>
<%--                    <label for="inputEmail1" class="col-sm-2 col-form-label">Cus. Type</label>--%>
<%--                    <div class="col-sm-10">--%>
<%--                        <select name="idCustomerType" class="form-select" id="inputEmail1"--%>
<%--                                aria-label="Default select example">--%>
<%--                            <c:choose>--%>
<%--                                <c:when test="${customer.idCustomerType ==0 }">--%>
<%--                                    <option value="" selected>-- Select Customer Type --</option>--%>
<%--                                    <c:forEach items="${idCustomerType}" var="type">--%>
<%--                                        <option value="${type.idCustomerType}">${type.nameCustomerType}</option>--%>
<%--                                    </c:forEach>--%>
<%--                                </c:when>--%>
<%--                                <c:otherwise>--%>
<%--                                    <option>-- Select Customer Type --</option>--%>
<%--                                    <c:forEach items="${customerTypeList}" var="type">--%>
<%--                                        <c:choose>--%>
<%--                                            <c:when test="${type.idCustomerType == customer.idCustomerType}">--%>
<%--                                                <option value="${type.idCustomerType}"--%>
<%--                                                        selected>${type.nameCustomerType}</option>--%>
<%--                                            </c:when>--%>
<%--                                            <c:otherwise>--%>
<%--                                                <option value="${type.idCustomerType}">${type.nameCustomerType}</option>--%>
<%--                                            </c:otherwise>--%>
<%--                                        </c:choose>--%>
<%--                                    </c:forEach>--%>
<%--                                </c:otherwise>--%>
<%--                            </c:choose>--%>
<%--                        </select>--%>
<%--                    </div>--%>
<%--                    <small class="text-danger">${errors.idCustomerType}</small>--%>
<%--                </div>--%>
<%--                <div class="row mb-3">--%>
<%--                    <label for="inputEmail2" class="col-sm-2 col-form-label">Name</label>--%>
<%--                    <div class="col-sm-10">--%>
<%--                        <input type="text" name="nameCustomer" class="form-control" id="inputEmail2"--%>
<%--                               value="${customer.nameCustomer}">--%>
<%--                    </div>--%>
<%--                    <small class="text-danger">${errors.nameCustomer}</small>--%>
<%--                </div>--%>
<%--                <div class="row mb-3">--%>
<%--                    <label for="inputEmail3" class="col-sm-2 col-form-label">Birthday</label>--%>
<%--                    <div class="col-sm-10">--%>
<%--                        <input type="date" name="dayOfBirth" class="form-control" id="inputEmail3"--%>
<%--                               value="${customer.dayOfBirth}">--%>
<%--                    </div>--%>
<%--                    <small class="text-danger">${errors.dayOfBirth}</small>--%>
<%--                </div>--%>
<%--                <div class="row mb-3">--%>
<%--                    <label for="inputEmail4" class="col-sm-2 col-form-label">Gender</label>--%>
<%--                    <div class="col-sm-10">--%>
<%--                        <select name="gender" class="form-select" aria-label="Default select example"--%>
<%--                                id="inputEmail4" value="${customer.gender}">--%>
<%--                            <c:choose>--%>
<%--                                <c:when test="${customer.gender == 0}">--%>
<%--                                    <option>-- Select Gender --</option>--%>
<%--                                    <option value="1">Male</option>--%>
<%--                                    <option value="0" selected>Female</option>--%>
<%--                                    <option value="2">Other</option>--%>
<%--                                </c:when>--%>
<%--                                <c:when test="${customer.gender == 1}">--%>
<%--                                    <option>-- Select Gender --</option>--%>
<%--                                    <option value="1" selected>Male</option>--%>
<%--                                    <option value="0">Female</option>--%>
<%--                                    <option value="2">Other</option>--%>
<%--                                </c:when>--%>
<%--                                <c:when test="${customer.gender == -1}">--%>
<%--                                    <option>-- Select Gender --</option>--%>
<%--                                    <option value="1">Male</option>--%>
<%--                                    <option value="0">Female</option>--%>
<%--                                    <option value="2" selected>Other</option>--%>
<%--                                </c:when>--%>
<%--                                <c:otherwise>--%>
<%--                                    <option selected>-- Select Gender --</option>--%>
<%--                                    <option value="1">Male</option>--%>
<%--                                    <option value="0">Female</option>--%>
<%--                                    <option value="2">Other</option>--%>
<%--                                </c:otherwise>--%>
<%--                            </c:choose>--%>
<%--                        </select>--%>
<%--                    </div>--%>
<%--                    <small class="text-danger">${errors.gender}</small>--%>
<%--                </div>--%>
<%--                <div class="row mb-3">--%>
<%--                    <label for="inputEmail5" class="col-sm-2 col-form-label">ID Card</label>--%>
<%--                    <div class="col-sm-10">--%>
<%--                        <input type="text" name="idCard" class="form-control" id="inputEmail5"--%>
<%--                               value="${customer.idCard}">--%>
<%--                    </div>--%>
<%--                    <small class="text-danger">${errors.idCard}</small>--%>
<%--                </div>--%>
<%--                <div class="row mb-3">--%>
<%--                    <label for="inputEmail6" class="col-sm-2 col-form-label">Phone</label>--%>
<%--                    <div class="col-sm-10">--%>
<%--                        <input type="text" name="phoneNumber" class="form-control" id="inputEmail6"--%>
<%--                               value="${customer.phoneNumber}">--%>
<%--                    </div>--%>
<%--                    <small class="text-danger">${errors.phoneNumber}</small>--%>
<%--                </div>--%>
<%--                <div class="row mb-3">--%>
<%--                    <label for="inputEmail7" class="col-sm-2 col-form-label">Email</label>--%>
<%--                    <div class="col-sm-10">--%>
<%--                        <input type="email" name="email" class="form-control" id="inputEmail7"--%>
<%--                               value="${customer.email}">--%>
<%--                    </div>--%>
<%--                    <small class="text-danger">${errors.email}</small>--%>
<%--                </div>--%>
<%--                <div class="row mb-3">--%>
<%--                    <label for="inputEmail8" class="col-sm-2 col-form-label">Address</label>--%>
<%--                    <div class="col-sm-10">--%>
<%--                        <input type="text" name="address" class="form-control" id="inputEmail8"--%>
<%--                               value="${customer.address}">--%>
<%--                    </div>--%>
<%--                    <small class="text-danger">${errors.address}</small>--%>
<%--                </div>--%>

<%--            </form>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>


<script src="../../bootstrap-5/bootstrap.bundle.min.js"></script>
<script src="../../jquery/jquery-3.5.1.min.js"></script>
<script src="../../datatables/js/jquery.dataTables.min.js"></script>
<script src="../../datatables/js/dataTables.bootstrap4.min.js"></script>
</body>
</html>

</body>