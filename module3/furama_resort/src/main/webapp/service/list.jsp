<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 7/7/2022
  Time: 9:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
          crossorigin="anonymous">
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.css">
    <style>
        /*body{*/
        /*    box-sizing: border-box;*/
        /*    margin: 0px;*/
        /*    padding: 0px;*/
        /*    background: url("https://statics.vinpearl.com/Tong%20quan_1647430024_1647852023.png") center/cover no-repeat;*/
        /*}*/
        html {
            font-size: 12px !important;
        }
    </style>
</head>
<body>
<div class="container-fluid bg-success text-white">
    <div class="col-12 row">
        <div class="col-1 "><img src="https://furamavietnam.com/wp-content/uploads/2018/08/logo.png" style="width:75px;"
                                 class="rounded-pill"></div>
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
                <a class="navbar-brand" href="/service?action=create">Create New Service</a>
                <form class="d-flex navbar-brand" method="get" action="/service">
                    <input class="form-control me-2" type="text" name="nameService" placeholder="Search for name" aria-label="Search"
                           width="100px">
                    <input type="text" name="action" value="search" hidden>
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
            </div>
        </nav>
    </div>
</div>
<div class="container-fluid">
    <div class="container-fluid mt-3" style="overflow: auto">
        <table id="tableService" class="table table-warning table-bordered" style="font-size: 12px; width: 100%">
            <thead>
            <tr>
                <th>Id</th>
                <th>Name Facility</th>
                <th>Area</th>
                <th>Cost</th>
                <th>Max People</th>
                <th>Rent Type</th>
                <th>Type Facility</th>
                <th>Room Standard</th>
                <th>Description Other</th>
                <th>Pool Area</th>
                <th>Number Floor</th>
                <th>Facility Free</th>
                <th>Status</th>
                <th>Option</th>
                <th>Option</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="temp" items="${facilityList}">
                <tr>
                    <td>${temp.idFacility}</td>
                    <td>${temp.nameFacility}</td>
                    <td>${temp.area}</td>

                    <td>${temp.cost}</td>
                    <td>${temp.maxPeople}</td>

                    <c:forEach var="s" items="${rentTypeList}">
                        <c:if test="${temp.idRentType ==s.idRentType}">
                            <td>${s.nameRentType}</td>
                        </c:if>
                    </c:forEach>
                    <c:forEach var="i" items="${facilityTypeList}">
                        <c:if test="${temp.idFacilityType ==i.idFacilityType}">
                            <td>${i.nameFacilityType}</td>
                        </c:if>
                    </c:forEach>
                    <td>${temp.standardRoom}</td>
                    <td>${temp.descriptionOtherConvenience}</td>
                    <td>${temp.poolArea}</td>
                    <td>${temp.numberFloor}</td>
                    <td>${temp.facilityFree}</td>

                    <c:if test="${temp.status == 0}">
                        <td class="table-warning text-success">Active</td>
                    </c:if>
                    <c:if test="${temp.status == 1}">
                        <td class="table-warning text-danger">Deleted</td>
                    </c:if>
                    <td>
                        <a href="/service?action=edit&id=${temp.idFacility}">
                            <button type="submit" class="btn btn-warning">Edit</button>
                        </a>
                    </td>
                    <td>
                        <button type="button" class="btn btn-danger" data-bs-toggle="modal"
                                data-bs-target="#staticBackdropDelete${temp.idFacility}">Delete
                        </button>
                    </td>
                    <!-- Modal Delete -->
                    <div class="modal fade" id="staticBackdropDelete${temp.idFacility}" data-bs-backdrop="static"
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
                                        Do you want delete Employee <strong>${temp.idFacility}</strong>
                                    </div>
                                    <a href="/service?action=delete&id=${temp.idFacility}" class="btn btn-success">Submit</a>
                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close
                                    </button>
                                </div>
                                <div class="modal-footer"></div>
                            </div>
                        </div>
                    </div>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
<script src="../jquery/jquery-3.5.1.min.js"></script>
<script src="../datatables/js/jquery.dataTables.min.js"></script>
<script src="../datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableEmployee').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });
</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</html>
