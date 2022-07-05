<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>

<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New Customer</h2>
            </caption>
            <tr>
                <th>Customer Name:</th>
                <td>
                    <input type="text" name="nameCustomer" id="nameCustomer" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Day Of Birth:</th>
                <td>
                    <input type="date" name="dayOfBirth" id="dayOfBirth" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Gender:</th>
                <td>
                    <label>
                        <select name="gender">
                            <option value="1">Nam</option>
                            <option value="0">Nữ</option>
                            <option value="2">Khác</option>
                        </select>
                    </label>
                </td>
            </tr>
            <tr>
                <th>Id Card:</th>
                <td>
                    <input type="text" name="idCard" id="idCard" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Phone Number:</th>
                <td>
                    <input type="text" name="phoneNumber" id="phoneNumber" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Email:</th>
                <td>
                    <input type="text" name="email" id="email" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Address:</th>
                <td>
                    <input type="text" name="address" id="address" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Customer Type:</th>
                <td>
                <select name="idCustomerType" id="idCustomerType">
                    <option value="1">Diamond</option>
                    <option value="2">Platinum</option>
                    <option value="3">Gold</option>
                    <option value="4">Silver</option>
                    <option value="5">Member</option>
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