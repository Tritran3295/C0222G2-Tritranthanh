<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 6/13/2022
  Time: 1:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
  <head>
    <title>$Title$</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.css">
  </head>
  <body>
  <a class="navbar-brand" href="/Rents">List</a>
  <a class="navbar-brand" href="">Create</a>

  </body>
  <script src="../jquery/jquery-3.5.1.min.js"></script>
  <script src="../datatables/js/jquery.dataTables.min.js"></script>
  <script src="../datatables/js/dataTables.bootstrap4.min.js"></script>
  <script>
    $(document).ready(function () {
      $('#myTable').dataTable({
        "dom": 'lrtip',
        "lengthChange": false,
        "pageLength": 7
      });
    } );
  </script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
          crossorigin="anonymous"></script>
</html>
