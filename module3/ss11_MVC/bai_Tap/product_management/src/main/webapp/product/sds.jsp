<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 7/3/2022
  Time: 11:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Edit Customer</h2>
            </caption>
            <tr>
                <th>ID Customer :</th>
                <td>
                    <input type="text" name="idCustomer" id="idCustomer" value="${customer.idCustomer}"readonly size="45"/>
                </td>
            </tr>
            <tr>
                <th>Customer Name:</th>
                <td>
                    <input type="text" name="nameCustomer" id="nameCustomer" value="${customer.nameCustomer}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Day Of Birth:</th>
                <td>
                    <input type="text" name="dayOfBirth" id="dayOfBirth" value="${customer.dayOfBirth}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Gender:</th>
                <td>
                    <label>
                        <select name="gender">
                            <option value="${customer.gender == 1}">Nam</option>
                            <option value="${customer.gender == 0}">Nữ</option>
                            <option value="${customer.gender == 2}">Khác</option>
                        </select>
                    </label>
                </td>
            </tr>
            <tr>
                <th>Id Card:</th>
                <td>
                    <input type="text" name="idCard" id="idCard" value="${customer.idCard}" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Phone Number:</th>
                <td>
                    <input type="text" name="phoneNumber" id="phoneNumber" value="${customer.phoneNumber}" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Email:</th>
                <td>
                    <input type="text" name="email" id="email" value="${customer.email}" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Address:</th>
                <td>
                    <input type="text" name="address" id="address" value="${customer.address}" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Customer Type:</th>
                <td>
                    <select name="idCustomerType" id="idCustomerType">
                        <option value="${customer.idCustomerType == 1}">Diamond</option>
                        <option value="${customer.idCustomerType == 2}">Platinum</option>
                        <option value="${customer.idCustomerType == 3}">Gold</option>
                        <option value="${customer.idCustomerType == 4}">Silver</option>
                        <option value="${customer.idCustomerType == 5}">Member</option>
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
