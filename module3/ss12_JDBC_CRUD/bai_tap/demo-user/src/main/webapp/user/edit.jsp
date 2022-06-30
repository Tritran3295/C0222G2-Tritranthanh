<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 6/30/2022
  Time: 11:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center" >
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Edit User</h2>
            </caption>
            <tr>
                <th>User ID:</th>
                <td>
                    <input type="text" name="id" id="id" value="${product.id}" readonly size="45"/>
                </td>
            </tr>
            <tr>
                <th>User Name:</th>
                <td>
                    <input type="text" name="name" id="name" value="${product.name}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>User Email:</th>
                <td>
                    <input type="text" name="email" id="email" value="${product.email}"size="45"/>
                </td>
            </tr>
            <tr>
                <th>Country:</th>
                <td>
                    <input type="text" name="country" id="country" value="${product.country}" size="15"/>
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
