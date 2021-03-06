<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/6/2022
  Time: 4:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>Furama Management</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
        rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous" >
  <style>
    body{
      box-sizing: border-box;
      margin: 0px;
      padding: 0px;
     background: url("https://statics.vinpearl.com/Tong%20quan_1647430024_1647852023.png") center/cover no-repeat;
    }
    html{
      font-size: 12px !important;
    }
  </style>
</head>
<body>
<div class="container-fluid bg-success text-white" >
  <div class="col-12 row">
    <div class="col-1 "><img src="https://furamavietnam.com/wp-content/uploads/2018/08/logo.png" style="width:75px;" class="rounded-pill"></div>
    <div class="col-11 ">
      <div class="col-lg-12 row">
        <div class="col-lg-10 text-center"><h1 style="color: sandybrown">Furama Management</h1></div>
        <div class="col-lg-2 ">
          <p>Welcome to ...<br><strong>...Furama Resort!!!</strong></p>
        </div>
      </div>
    </div>
  </div>
  <div class="col-12 row ">
    <nav class="navbar">
      <div class="container-fluid text-white-50 bg-dark">
        <a class="navbar-brand" href="/index.jsp">Home</a>
        <a class="navbar-brand" href="/employee">Employee</a>
        <a class="navbar-brand" href="/customer">Customer</a>
        <a class="navbar-brand" href="/service">Service</a>
        <a class="navbar-brand" href="/contract">Contract</a>
        <form class="d-flex navbar-brand">
          <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" width="100px">
          <button class="btn btn-outline-success" type="submit">Search</button>
        </form>
      </div>
    </nav>
  </div>
  <footer class="container-fluid text-center p-2 text-light" style="height: 24px">
  </footer>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</html>