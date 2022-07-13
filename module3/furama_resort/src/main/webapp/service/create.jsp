<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <title>Furama - New Employee</title>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="../../datatables/css/dataTables.bootstrap4.min.css">
    <style>
        body {
            box-sizing: border-box;
            margin: 0px;
            padding: 0px;
            background-color: #17a2b8;
        }

        html {
            font-size: 12px !important;
        }
    </style>

</head>
<body>
<div class="container-fluid col-auto">
    <div class="container-fluid mt-3 w-50">
        <form action="/service?action=create" method="post">
            <h4>Add New Employee</h4>
            <br>
            <div class="row mb-3">
                <label  class="col-sm-2 col-form-label">Name Facility</label>
                <div class="col-sm-10">
                    <input type="text" name="nameFacility" class="form-control" >
                </div>
            </div>
            <div class="row mb-3">
                <label  class="col-sm-2 col-form-label">Area</label>
                <div class="col-sm-10">
                    <input type="text" name="area" class="form-control" >
                </div>
            </div>
            <div class="row mb-3">
                <label  class="col-sm-2 col-form-label">Cost</label>
                <div class="col-sm-10">
                    <input type="text" name="cost" class="form-control" >
                </div>
            </div>
            <div class="row mb-3">
                <label  class="col-sm-2 col-form-label">Max People</label>
                <div class="col-sm-10">
                    <input type="text" name="maxPeople" class="form-control" >
                </div>
            </div>
            <div class="row mb-3">
                <label  class="col-sm-2 col-form-label">Rent Type</label>
                <div class="col-sm-10">
                    <select name="idPosition"  class="form-select"
                            aria-label="Default select example">
                        <option>-- Choose Rent Type --</option>
                        <c:forEach items="${rentTypeList}" var="temp">
                            <option value="${temp.idRentType}">${temp.nameRentType}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
            <div class="row mb-3">
                <label  class="col-sm-2 col-form-label">Type Facility</label>
                <select name="idPosition" id="choiceFacilityType" onchange="selectFacility()" class="form-select"
                        aria-label="Default select example">
                    <option>-- Choose Rent Type --</option>
                    <c:forEach items="${facilityTypeList}" var="temp">
                        <option value="${temp.idFacilityType}">${temp.nameFacilityType}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="row mb-3" id="standardRoom" style="display: none">
                <label  class="col-sm-2 col-form-label">Standard Room</label>
                <div class="col-sm-10">
                    <input type="text" name="standardRoom" class="form-control" >
                </div>
            </div>
            <div class="row mb-3" id="descriptionOther" style="display: none">
                <label  class="col-sm-2 col-form-label">Description Other</label>
                <div class="col-sm-10">
                    <input type="text" name="descriptionOther" class="form-control" >
                </div>
            </div>
            <div class="row mb-3"id="poolArea" style="display: none">
                <label  class="col-sm-2 col-form-label">Pool Area</label>
                <div class="col-sm-10">
                    <input type="text" name="poolArea" class="form-control" >
                </div>
            </div>
            <div class="row mb-3"id="numberFloor" style="display: none">
                <label  class="col-sm-2 col-form-label">Number Floor</label>
                <div class="col-sm-10">
                    <input type="text" name="numberFloor" class="form-control" >
                </div>
            </div>
            <div class="row mb-3" id="facilityFree" style="display: none">
                <label  class="col-sm-2 col-form-label">Facility Free</label>
                <div class="col-sm-10">
                    <input type="text" name="facilityFree" class="form-control">
                </div>
            </div>
            <div class="row mb-3">
                <label for="inputEmail11" class="col-sm-2 col-form-label"></label>
                <div class="col-sm-10">
                    <button type="submit" class="btn btn-primary" id="inputEmail11">Create</button>
                    <a class="btn btn-secondary" href="/employee" style="float: right">Cancel</a>
                </div>
            </div>
        </form>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="../../datatables/js/jquery.dataTables.min.js"></script>
<script src="../../datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    function selectFacility() {
        let getValue = $('#choiceFacilityType').val();
        console.log(getValue);
        switch (getValue) {
            case '1':
                $('#standardRoom').show()
                $('#descriptionOther').show()
                $('#poolArea').show()
                $('#numberFloor').show()
                $('#facilityFree').hide()
                break;
            case '2':
                $('#standardRoom').show()
                $('#descriptionOther').show()
                $('#poolArea').hide()
                $('#numberFloor').show()
                $('#facilityFree').hide()
                break;
            case '3':
                $('#standardRoom').hide()
                $('#descriptionOther').hide()
                $('#poolArea').hide()
                $('#numberFloor').hide()
                $('#facilityFree').show()
                break;
        }
    }
</script>

</body>