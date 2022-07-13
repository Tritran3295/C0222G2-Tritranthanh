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
                <div class="col-lg-10 text-center"><h1 style="color: sandybrown">Management Family</h1></div>
            </div>
        </div>
    </div>
    <div class="col-12 row ">
        <nav class="navbar">
            <div class="container-fluid text-white-50 bg-dark">
                <a class="navbar-brand" href="/index.jsp">Home</a>
                <a class="navbar-brand" href="/family?action=create">Create New Family</a>
            </div>
        </nav>
    </div>
</div>

<div class="container-fluid">
    <div class="container-fluid mt-3" style="overflow: auto">
        <table id="tableFamily" class="table table-warning table-bordered" style="font-size: 12px; width: 100%">
            <thead>
            <tr>
                <th>STT</th>
                <th>Mã Hộ Khẩu</th>
                <th>Tên chủ hộ</th>
                <th>Số lượng thành viên</th>
                <th>Ngày lập hộ khẩu</th>
                <th>Địa chỉ nhà</th>
                <th>Option</th>
                <th>Option</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="temp" items="${familyList}">
                <tr>
                    <td>${temp.stt}</td>
                    <c:forEach var="s" items="${maHoKhauList}">
                        <c:if test="${temp.stt == s.stt}">
                            <td>${s.maHoKhau}</td>
                        </c:if>
                    </c:forEach>
                    <td>${temp.tenChuHo}</td>
                    <td>${temp.soLuongThanhVien}</td>
                    <td>${temp.ngayLapHoKhau}</td>
                    <td>${temp.diaChiNha}</td>
                    <td>
                        <a href="/family?action=edit&id=${temp.stt}">
                            <button type="submit" class="btn btn-warning">Edit</button>
                        </a>
                    </td>
                    <td>
                        <button type="button" class="btn btn-danger" data-bs-toggle="modal"
                                data-bs-target="#staticBackdropDelete${temp.stt}">Xem Thành Viên
                        </button>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
<script src="../jquery/jquery-3.5.1.min.js"></script>
<script src="../datatables/js/jquery.dataTables.min.js"></script>
<script src="../datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableFamily').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });
</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</html>
