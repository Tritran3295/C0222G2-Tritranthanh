<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 5/31/2022
  Time: 3:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>Create New Product</h1>
<a href="ProductServlet?action=create">Create a new Product</a>
<form method="post">
    <fieldset>
        <legend>Product</legend>
      <table>
        <tr>
          <td>Id Product :</td>
          <td><input type="text" name="idProduct" id="idProduct"></td>
        </tr>
        <tr>
          <td>Name Product :</td>
          <td><input type="text" name="nameProduct" id="nameProduct"></td>
        </tr>
        <tr>
          <td>Price Product :</td>
          <td><input type="text" name="price" id="priceProduct"></td>
        </tr>
        <tr>
          <td>Describe Product :</td>
          <td><input type="text" name="describe" id="describeProduct"></td>
        </tr>
        <tr>
          <td>Host Product :</td>
          <td><input type="text" name="host" id="hostProduct"></td>
        </tr>
        <tr>
          <td></td>
          <td><input type="submit" value="Create Product"></td>

        </tr>

      </table>
    </fieldset>
</form>
</body>
</html>
