<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 6/13/2022
  Time: 10:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <div align="center">
        <form method="post">
            <table border="1" cellpadding="5">
                <caption>
                    <h2>Add New Rent Building</h2>
                </caption>
                <tr>
                    <th> Code Rent buiding:</th>
                    <td>
                        <input type="text" name="codeRentBuilding" id="name" size="45"/>
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
</table>
</body>
</html>
