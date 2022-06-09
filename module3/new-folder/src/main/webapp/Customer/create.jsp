<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 6/6/2022
  Time: 12:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Furama Resort</title>
</head>
<body>

<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New Customer</h2>
            </caption>
            <tr>
                <th>User Name:</th>
                <td>
                    <input type="text" name="nameCustomer" id="name" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Day of birthday Customer:</th>
                <td>
                    <input type="text" name="birthday" id="birthday" size="45"/>
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
                <th>Id Card Customer:</th>
                <td>
                    <input type="text" name="idCard" id="idCard" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Numbers Phone:</th>
                <td>
                    <input type="text" name="phone" id="phone" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Email:</th>
                <td>
                    <input type="text" name="email" id="email" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Address:</th>
                <td>
                    <input type="text" name="address" id="address" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Type Customer:</th>
                <td>
                   <select name="idTypeCustomer">
                       <option value="1">Diamond</option>
                       <option value="2">Gold</option>
                       <option value="3">Silver</option>
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
