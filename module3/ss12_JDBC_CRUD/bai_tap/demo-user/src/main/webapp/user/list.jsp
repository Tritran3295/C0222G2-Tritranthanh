<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 6/30/2022
  Time: 11:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        .table-user{
            position: relative;
            top: 0;
            left: 0;
            animation: fadeOn .5s;
        }

        @keyframes fadeOn {
            from{
                opacity: 0;
                top: 30%;
                left: 0;
            }
            to{
                opacity: 1;
                top: 0;
                left: 0;
            }
        }
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h2>
    <a href="/user?action=create">Create New User</a>
</h2>
<form method="get" action="/user">
    <input type="text" name="name" placeholder="Tìm theo tên">
    <input type="text" name="action" value="search" hidden>
    <button type="submit">Tìm kiếm</button>
</form>
<table class="table table-hover table-user" id="tableFadeIn">
    <tr>
        <th>Stt</th>
        <th>Name</th>
        <th>Email</th>
        <th>Country</th>
        <th>Option</th>
        <th>OPtion</th>

    </tr>
    <c:forEach var="s" items="${userList}">
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.email}</td>
            <td>${s.country}</td>
            <td>
                <a href="/user?action=edit&id=${s.id}">
                    <button type="submit" class="btn btn-warning">Edit</button>
                </a>
            </td>
            <td>
                <button type="button" class="btn btn-danger" data-bs-toggle="modal"
                        data-bs-target="#staticBackdropDelete${s.id}">Delete
                </button>
            </td>
            <!-- Modal Delete -->
            <div class="modal fade" id="staticBackdropDelete${s.id}" data-bs-backdrop="static"
                 data-bs-keyboard="false" tabindex="-1"
                 aria-labelledby="staticBackdropLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="staticBackdropLabelAddNew">Delete</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal"
                                    aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                            <div class="alert alert-warning">
                                Do you want delete users <strong>${s.id}</strong>
                            </div>
                            <a href="/user?action=delete&id=${s.id}" class="btn btn-success">Submit</a>
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close
                            </button>
                        </div>
                        <div class="modal-footer"></div>
                    </div>
                </div>
            </div>
        </tr>
    </c:forEach>
</table>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</html>
