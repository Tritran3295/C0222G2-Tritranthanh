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
    <title>Management - New Family</title>
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
                <div class="col-lg-10 text-center"><h1 style="color: sandybrown">Family Management</h1></div>
                <div class="col-lg-2 ">
                    <p>Welcome to ...<br><strong>Family</strong></p>
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
<form action="/family?action=edit" method="post" style="background-color: lightcyan">
    <h4> Edit Family</h4>
    <br>
    <div class="row mb-3">
        <label for="inputEmail0" class="col-sm-2 col-form-label">Stt</label>
        <div class="col-sm-10">
            <input type="text" name="id" class="form-control" value="${stt}" id="inputEmail0" readonly>
        </div>
    </div>
    <div class="row mb-3">
        <label for="inputEmail1" class="col-sm-2 col-form-label">Mã Hộ Khẩu</label>
        <div class="col-sm-10">
            <select name="maHoKhau" id="inputEmail1" class="form-select" aria-label="Default select example">
                <c:forEach items="${maHoKhauList}" var="temp">
                    <c:choose>
                        <c:when test="${temp.stt == idMaHoKhau}">
                            <option value="${temp.stt}"
                                    selected>${temp.maHoKhau}</option>
                        </c:when>
                        <c:otherwise>
                            <option value="${temp.stt}">${temp.maHoKhau}</option>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
            </select>
        </div>
    </div>
    <div class="row mb-3">
        <label for="inputEmail2" class="col-sm-2 col-form-label">Tên chủ hộ</label>
        <div class="col-sm-10">
            <input type="text" name="tenChuHo" class="form-control" value="${tenChuHo}" id="inputEmail2">
        </div>
    </div>
    <div class="row mb-3">
        <label for="inputEmail3" class="col-sm-2 col-form-label">Số lượng thành viên</label>
        <div class="col-sm-10">
            <input type="text" name="soLuongThanhVien" class="form-control" value="${soLuongThanhVien}" id="inputEmail3">
        </div>
    </div>
    <div class="row mb-3">
        <label for="inputEmail4" class="col-sm-2 col-form-label">Salary</label>
        <div class="col-sm-10">
            <input type="text" name="ngayLapHoKhau" class="form-control" value="${ngayLapHoKhau}" id="inputEmail4">
        </div>
    </div>
    <div class="row mb-3">
        <label for="inputEmail5" class="col-sm-2 col-form-label">Number Phone</label>
        <div class="col-sm-10">
            <input type="text" name="diaChiNha" class="form-control" value="${diaChiNha}" id="inputEmail5">
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
