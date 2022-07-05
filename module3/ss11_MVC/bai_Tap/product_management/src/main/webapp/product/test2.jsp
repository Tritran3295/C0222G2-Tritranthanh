<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/4/2022
  Time: 5:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../style/bootstrap/normalize.css">
    <link rel="stylesheet" href="../style/bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="../style/datatables/css/dataTables.bootstrap4.min.css"/>
    <style>
        .bg-pink {
            background-color: deeppink !important;
        }
        .nav-item:hover {
            border: 3px solid deeppink;
        }
    </style>
</head>
<body>
<div class="col-auto" style="margin: 0 auto;">
    <div class="bg-pink text-white" style="margin: 0 auto !important; padding: 20px;">
        <form method="post">
            <div class="form-outline mb-4">
                <label class="form-label" for="form1Example1">Customer Name</label>
                <input type="text" id="form1Example1" class="form-control" name="nameCustomer" value="${nameCustomer}"/>
                <div class="text-black text-center bg-warning">${errMap.errNameCustomer}</div>
            </div>

            <div class="form-outline mb-4">
                <label class="form-label" for="form1Example3">Customer Birthday</label>
                <input type="date" id="form1Example3" class="form-control" name="dayOfBirth"
                       value="${dayOfBirth}"/>
                <div class="text-black text-center bg-warning">${errMap.errDayOfBirth}</div>
            </div>

            <div class="form-outline mb-4">
                <label class="form-label" for="form1Example4">Customer Gender</label>
                <select class="form-select" aria-label="Default select example" id="form1Example4"
                        name="gender">
                    <c:choose>
                        <c:when test="${gender == 0}">
                            <option value="1">Nam</option>
                            <option value="0" selected>Nữ</option>
                            <option value="2">Tài</option>
                        </c:when>
                        <c:when test="${gender == 1}">
                            <option value="1" selected>Nam</option>
                            <option value="0">Nữ</option>
                            <option value="2">Tài</option>
                        </c:when>
                        <c:otherwise>
                            <option value="1">Nam</option>
                            <option value="0">Nữ</option>
                            <option value="2" selected>Khasc</option>
                        </c:otherwise>
                    </c:choose>
                </select>
                <div class="text-black text-center bg-warning">${errMap.errGender}</div>
            </div>

            <div class="form-outline mb-4">
                <label class="form-label" for="form1Example5">Customer ID Card</label>
                <input type="text" id="form1Example5" class="form-control" name="idCard"
                       value="${idCard}"/>
                <div class="text-black text-center bg-warning">${errMap.errIdCard}</div>
            </div>

            <div class="form-outline mb-4">
                <label class="form-label" for="form1Example6">Customer Phone</label>
                <input type="text" id="form1Example6" class="form-control" name="phoneNumber"
                       value="${phoneNumber}"/>
                <div class="text-black text-center bg-warning">${errMap.errPhoneNumber}</div>
            </div>

            <div class="form-outline mb-4">
                <label class="form-label" for="form1Example7">Customer Email</label>
                <input type="text" id="form1Example7" class="form-control" name="email"
                       value="${email}"/>
                <div class="text-black text-center bg-warning">${errMap.errEmail}</div>
            </div>

            <div class="form-outline mb-4">
                <label class="form-label" for="form1Example8">Customer Address</label>
                <input type="text" id="form1Example8" class="form-control" name="address"
                       value="${address}"/>
                <div class="text-black text-center bg-warning">${errMap.errAddress}</div>
            </div>

            <div class="form-outline mb-4">
                <label class="form-label" for="form1Example2">Customer Type</label>
                <select class="form-select" aria-label="Default select example" id="form1Example2"
                        name="idCustomerType">
                    <c:forEach items="${listCustomerType}" var="temp">
                        <c:choose>
                            <c:when test="${temp.idCustomerType == customerType}">
                                <option value="${temp.customerTypeId}" selected>${temp.nameCustomerType}</option>
                            </c:when>
                            <c:otherwise>
                                <option value="${temp.customerTypeId}">${temp.nameCustomerType}</option>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                </select>
                <div class="text-black text-center bg-warning">${errMap.errIdCustomerType}</div>
            </div>

            <div class="form-outline mb-4">
                <label class="form-label" for="form1Example9">Status</label>
                <select class="form-select" aria-label="Default select example" id="form1Example9"
                        name="status">
                    <c:choose>
                        <c:when test="${status == 0}">
                            <option value="0" selected class="text-success">Active</option>
                            <option value="1" class="text-danger">Deleted</option>
                        </c:when>
                        <c:when test="${status == 1}">
                            <option value="1" selected class="text-danger">Delete</option>
                            <option value="0" class="text-success">Active</option>
                        </c:when>
                    </c:choose>
                </select>
                <div class="text-black text-center bg-warning">${errMap.errStatus}</div>
            </div>
            <button type="submit" class="btn btn-warning btn-block">Submit</button>
        </form>
    </div>
</div>

</body>
<script src="../style/jquery/jquery-3.5.1.min.js"></script>
<script src="../style/datatables/js/jquery.dataTables.min.js"></script>
<script src="../style/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="../style/bootstrap/bootstrap.bundle.min.js"></script>
</html>