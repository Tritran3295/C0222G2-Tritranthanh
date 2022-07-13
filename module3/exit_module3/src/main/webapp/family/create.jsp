<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <title>Title</title>
  <link rel="stylesheet" href="../../bootstrap-5/normalize.css">
  <title>Furama - New Employee</title>
  <link rel="stylesheet" href="../../bootstrap413/css/bootstrap.min.css">
  <link rel="stylesheet" href="../../datatables/css/dataTables.bootstrap4.min.css">
  <link rel="stylesheet" href="../../bootstrap-5/bootstrap.min.css">
  <style>
    body{
      box-sizing: border-box;
      margin: 0px;
      padding: 0px;
      background-color: #17a2b8;
    }
    html{
      font-size: 12px !important;
    }
  </style>

</head>
<body>
<div class="container-fluid col-auto">
  <div class="container-fluid mt-3 w-50">
    <form action="/employee?action=create" method="post">
      <h4>Add New Employee</h4>
      <br>
      <div class="row mb-3">
        <label for="inputEmail1" class="col-sm-2 col-form-label">Name</label>
        <div class="col-sm-10">
          <input type="text" name="nameEmployee" class="form-control" id="inputEmail1">
        </div>
      </div>
      <div class="row mb-3">
        <label for="inputEmail2" class="col-sm-2 col-form-label">Birthday</label>
        <div class="col-sm-10">
          <input type="date" name="dateOfBirth" class="form-control" id="inputEmail2">
        </div>
      </div>
      <div class="row mb-3">
        <label for="inputEmail3" class="col-sm-2 col-form-label">ID Card</label>
        <div class="col-sm-10">
          <input type="text" name="idCard" class="form-control" id="inputEmail3">
        </div>
      </div>
      <div class="row mb-3">
        <label for="inputEmail4" class="col-sm-2 col-form-label">Salary</label>
        <div class="col-sm-10">
          <input type="text" name="salary" class="form-control" id="inputEmail4">
        </div>
      </div>
      <div class="row mb-3">
        <label for="inputEmail5" class="col-sm-2 col-form-label">Phone</label>
        <div class="col-sm-10">
          <input type="text" name="phoneNumber" class="form-control" id="inputEmail5">
        </div>
      </div>
      <div class="row mb-3">
        <label for="inputEmail6" class="col-sm-2 col-form-label">Email</label>
        <div class="col-sm-10">
          <input type="email" name="email" class="form-control" id="inputEmail6">
        </div>
      </div>
      <div class="row mb-3">
        <label for="inputEmail7" class="col-sm-2 col-form-label">Address</label>
        <div class="col-sm-10">
          <input type="text" name="address" class="form-control" id="inputEmail7">
        </div>
      </div>
      <div class="row mb-3">
        <label for="inputEmail8" class="col-sm-2 col-form-label">Position</label>
        <div class="col-sm-10">
          <select name="idPosition" id="inputEmail8" class="form-select"
                  aria-label="Default select example">
            <option>-- Choose Position --</option>
            <c:forEach items="${positionList}" var="temp">
              <option value="${temp.idPosition}">${temp.namePosition}</option>
            </c:forEach>
          </select>
        </div>
      </div>
      <div class="row mb-3">
        <label for="inputEmail9" class="col-sm-2 col-form-label">Education</label>
        <div class="col-sm-10">
          <select name="idEducationDegree" id="inputEmail9" class="form-select"
                  aria-label="Default select example">
            <option>-- Choose Education Degree --</option>
            <c:forEach items="${educationDegreeList}" var="temp">
              <option value="${temp.idEducationDegree}">${temp.nameEducationDegree}</option>
            </c:forEach>
          </select>
        </div>
      </div>
      <div class="row mb-3">
        <label for="inputEmail10" class="col-sm-2 col-form-label">Division</label>
        <div class="col-sm-10">
          <select name="idDivision" id="inputEmail10" class="form-select"
                  aria-label="Default select example">
            <option>-- Choose Division --</option>
            <c:forEach items="${divisionList}" var="temp">
              <option value="${temp.idDivision}">${temp.nameDivision}</option>
            </c:forEach>
          </select>
        </div>
      </div>

      <div class="row mb-3">
        <label for="inputEmail11" class="col-sm-2 col-form-label"></label>
        <div class="col-sm-10">
          <button type="submit" class="btn btn-primary" id="inputEmail11">Save</button>
          <a class="btn btn-secondary" href="/employee" style="float: right">Cancel</a>
        </div>
      </div>
    </form>
  </div>
</div>
<script src="../../bootstrap-5/bootstrap.bundle.min.js"></script>
<script src="../../jquery/jquery-3.5.1.min.js"></script>
<script src="../../datatables/js/jquery.dataTables.min.js"></script>
<script src="../../datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
  $(document).ready(function () {
    $('#tableEmployee').dataTable({
      "dom": 'lrtip',
      "lengthChange": false,
      "pageLength": 7
    });
  });
</script>
</body>