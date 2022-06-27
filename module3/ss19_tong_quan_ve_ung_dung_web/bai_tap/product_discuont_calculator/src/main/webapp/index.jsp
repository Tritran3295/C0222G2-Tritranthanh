<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 6/27/2022
  Time: 9:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Currency Converter</h2>
  <form action="/discount" method="post">
    <label>Product Description</label>
    <input type="text" name="productDescription" placeholder="Description"><br/>
    <label>List Price</label>
    <input type="text" name="listPrice" placeholder="Price"><br/>
    <label>Discount Percent</label>
    <input type="number" name="discountPercent" placeholder="Discount Percent"><br/>
    <button type="submit">Calculate</button>
  </form>
  <h2>Discount amount : ${discountAmount}</h2>
  <h2>Last Price : ${lastPrice}</h2>
  </body>
</html>
