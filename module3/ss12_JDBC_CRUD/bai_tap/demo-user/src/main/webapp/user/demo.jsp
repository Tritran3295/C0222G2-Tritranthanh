<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 7/1/2022
  Time: 11:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
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
<div class="col-auto" style="margin: 0 auto;">
    <div class="bg-pink text-white" style="margin: 0 auto !important; padding: 20px;">
        <form method="post">
            <div class="form-outline mb-4">
                <label class="form-label" for="form1Example2">Customer Type</label>
                <select class="form-select" aria-label="Default select example" id="form1Example2" name="customerTypeId">
                    <option selected disabled value="0">Choice Customer Type</option>
                    <c:forEach items="${customerTypeList}" var="temp">
                        <option value="${temp.idCustomerType}">${temp.nameCustomerType}</option>
                    </c:forEach>
                </select>
                <div class="text-black text-center bg-warning">${errMap.idCustomerType}</div>
            </div>

            <div class="form-outline mb-4">
                <label class="form-label" for="form1Example1">Customer Name</label>
                <input type="text" id="form1Example1" class="form-control" name="nameCustomer" value="${nameCustomer}"/>
                <div class="text-black text-center bg-warning">${errMap.errNameCustomer}</div>
            </div>

            <div class="form-outline mb-4">
                <label class="form-label" for="form1Example3">Customer Birthday</label>
                <input type="date" id="form1Example3" class="form-control" name="dayOfBirth" value="${dayOfBirth}"/>
                <div class="text-black text-center bg-warning">${errMap.errDayOfBirth}</div>
            </div>

            <div class="form-outline mb-4">
                <label class="form-label" for="form1Example4">Customer Gender</label>
                <select class="form-select" aria-label="Default select example" id="form1Example4" name="gender">
                    <option selected disabled>Choice Customer Gender</option>
                    <option value="1">Nam</option>
                    <option value="0">Nữ</option>
                    <option value="2">Khác</option>
                </select>
                <div class="text-black text-center bg-warning">${errMap.errCustomerGender}</div>
            </div>

            <div class="form-outline mb-4">
                <label class="form-label" for="form1Example5">Customer ID Card</label>
                <input type="text" id="form1Example5" class="form-control" name="idCard" value="${idCard}"/>
                <div class="text-black text-center bg-warning">${errMap.errIdCard}</div>
            </div>

            <div class="form-outline mb-4">
                <label class="form-label" for="form1Example6">Customer Phone</label>
                <input type="text" id="form1Example6" class="form-control" name="phoneNumber" value="${phoneNumber}"/>
                <div class="text-black text-center bg-warning">${errMap.errPhoneNumber}</div>
            </div>

            <div class="form-outline mb-4">
                <label class="form-label" for="form1Example7">Customer Email</label>
                <input type="text" id="form1Example7" class="form-control" name="email" value="${email}"/>
                <div class="text-black text-center bg-warning">${errMap.errEmail}</div>
            </div>

            <div class="form-outline mb-4">
                <label class="form-label" for="form1Example8">Customer Address</label>
                <input type="text" id="form1Example8" class="form-control" name="address" value="${address}"/>
                <div class="text-black text-center bg-warning">${errMap.errAddress}</div>
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
