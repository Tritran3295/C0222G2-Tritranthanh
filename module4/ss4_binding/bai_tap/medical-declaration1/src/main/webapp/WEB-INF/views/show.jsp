<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 7/15/2022
  Time: 10:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fieldset>
    <legend>Tờ khai chi tiết</legend>
    <div> Họ Tên : ${result.name}</div>
    <div> Năm Sinh: ${result.yearOfBirth}</div>
    <div> Giới Tính : ${result.gender}</div>
    <div> Quốc Gia : ${result.country}</div>
    <div> PassPort/CMND : ${result.idCard}</div>
    <div> Thông Tin Đi lại : ${result.vehicle}</div>
    <div> Số Hiệu Phương Tiện : ${result.idVehicle}</div>
    <div> Số Ghế : ${result.numberSheet}</div>
    <div> Ngày Khởi Hành : ${result.dayStart}</div>
    <div> Ngày Kết Thúc : ${result.dayEnd}</div>
    <div> Thông tin đi lại trong 14 ngày : ${result.activity14Day}</div>
</fieldset>
</body>
</html>
