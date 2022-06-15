<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 6/13/2022
  Time: 9:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th> Mã MB</th>
        <th> Diện Tích</th>
        <th> Trạng thái</th>
        <th> tầng</th>
        <th> Loại Văn Phòng</th>
        <th> Giá cho thuê</th>
        <th> ngày bắt đầu</th>
        <th> ngày kết thúc</th>
    </tr>
    <c:forEach var="temp" items="${rentBuildingList}">
        <tr>
            <td>${temp.codeRentBuilding}</td>
            <td>
                <c:if test="${temp.status ==1 }">Trống</c:if>
                <c:if test="${temp.status ==2 }">Hạ Tầng</c:if>
                <c:if test="${temp.status ==3 }">Đầy Đủ</c:if>
            </td>
            <td>${temp.SRentBuilding}</td>
            <td>${temp.floor}</td>
            <td>
                <c:if test="${temp.typeRoom == 1}">Văn Phòng chia sẻ </c:if>
                <c:if test="${temp.typeRoom == 2}">Văn Phòng trọn gói </c:if>
            </td>
            <td>${temp.price}</td>
            <td>${temp.dayStart}</td>
            <td>${temp.dayEnd}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
