<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 6/8/2022
  Time: 4:16 PM
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
    <h1>Customer Management</h1>
</center>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    Edit Customer
                </h2>
            </caption>
            <c:if test="${customerList != null}">
                <input type="hidden" name="id" value="<c:out value='${customerList.idCustomer}' />"/>
            </c:if>
            <tr>
                <th>User Name:</th>
                <td>
                    <input type="text" name="nameCustomer" size="45"
                           value="<c:out value='${customerList.nameCustomer}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Day Of Birth:</th>
                <td>
                    <input type="text" name="birthday" size="45"
                           value="<c:out value='${customerList.birthday}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Gender:</th>
                <td>
                    <select name="gender">
                        <option value="1">Nam</option>
                        <option value="0">Nữ</option>
                        <option value="2">Khác</option>
                    </select>
                </td>

            </tr>
            <tr>
                <th>Id Card:</th>
                <td>
                    <input type="text" name="idCard" size="15"
                           value="<c:out value='${customerList.idCard}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Phone: </th>
                <td>
                    <input type="text" name="phone" size="15"
                           value="<c:out value='${customerList.phone}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Email:</th>
                <td>
                    <input type="text" name="email" size="15"
                           value="<c:out value='${customerList.email}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Address:</th>
                <td>
                    <input type="text" name="address" size="15"
                           value="<c:out value='${customerList.address}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Type Customer:</th>

                <td>
                        <select name="idTypeCustomer">
                            <c:forEach var="c" items="${listCustomerType}">
                            <option value="${c.idCustomerType}">${c.nameCustomerType}</option>
                            </c:forEach>
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
