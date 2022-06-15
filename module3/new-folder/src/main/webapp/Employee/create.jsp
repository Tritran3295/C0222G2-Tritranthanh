<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 6/7/2022
  Time: 4:22 PM
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
                <h2>Add New Employee</h2>
            </caption>
            <tr>
                <th> Name:</th>
                <td>
                    <input type="text" name="nameEmployee" id="name" size="45"/>
                    <p style="color: red">${errors.name}</p>
                </td>
            </tr>
            <tr>
                <th>Day of birthday Customer:</th>
                <td>
                    <input type="text" name="dayOfBirth" id="birthday" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Id Card Customer:</th>
                <td>
                    <input type="text" name="idCardEmployee" id="idCard" size="45"/>
                    <p style="color: red">${errors.idCard}</p>
                </td>
            </tr>
            <tr>
                <th>Salary:</th>
                <td>
                    <input type="text" name="salary" id="salary" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Phone:</th>
                <td>
                    <input type="text" name="phone" id="phone" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Email:</th>
                <td>
                    <input type="text" name="email" id="email" size="45"/>
                    <p style="color: red">${errors.email}</p>
                </td>
            </tr>
            <tr>
                <th>Address</th>
                <td>
                <input type="text" name="address" id="address" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Position</th>
                <td>
                    <select name="idPosition">
                        <option value="1">Lễ Tân</option>
                        <option value="2">Phục Vụ</option>
                        <option value="3">Chuyên Viên</option>
                        <option value="4">Giám Sát</option>
                        <option value="5">Quản Lý</option>
                        <option value="6">Giám Đốc</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Education Degree</th>
                <td>
                    <select name="idDegreeEducation">
                        <option value="1">Trung Cấp</option>
                        <option value="2">Cao Đẳng</option>
                        <option value="3">Đại Học</option>
                        <option value="4">Sau Đại Học</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Division</th>
                <td>
                    <select name="idDivision">
                        <option value="1">Sale-Marketing</option>
                        <option value="2">Hành Chính</option>
                        <option value="3">Phục Vụ</option>
                        <option value="4">Quản Lý</option>
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
