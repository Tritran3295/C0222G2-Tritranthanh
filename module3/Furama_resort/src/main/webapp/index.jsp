<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 6/5/2022
  Time: 3:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Furama Resort</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div>
    <div id="content" class="container">
        <div id="post">
            <img class="logo"
                 srcset="data:image/jpeg;base64,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">
        </div>
        <div id=sidebar>
            <p class="name">Trần Thanh Trí</p>
        </div>
    </div>
    <div class="col-12" id="chai">
        <div class="col-8">
            <p>Home</p>
            <p>Employee</p>
            <p>Customer</p>
            <p>Service</p>
            <p>Contract</p>
        </div>
        <div class="col-4">
            <p><input placeholder="search"></p>
        </div>
    </div>
    <div class="col-12">
        <div class="col-2">
            <div>
                <p>Item One</p>
            </div>
            <div>
                <p>Item Two</p>
            </div>
            <div>
                <p>Item Three</p>
            </div>
        </div>
        <div class="col-10">
            <p>Body</p>
        </div>
    </div>
    <div class="col-12">
        <p>Footer</p>

    </div>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>
