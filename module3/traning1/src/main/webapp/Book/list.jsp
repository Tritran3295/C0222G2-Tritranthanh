<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 6/11/2022
  Time: 4:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.css">
</head>
<body>
<center>
    <h3> Danh Sách Sách</h3>
</center>
<table border="1" id="tableBook" class="table table-striped table-bordered" style="width: 100%">
    <thead>
    <tr>
        <th>Code Book</th>
        <th>Name Book</th>
        <th>Author</th>
        <th>Describe</th>
        <th>Amount</th>
        <th>Option</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="temp" items="${listBook}">
        <tr>
            <td>${temp.codeBook}</td>
            <td>${temp.nameBook}</td>
            <td>${temp.author}</td>
            <td>${temp.describe}</td>
            <td>${temp.amount}</td>
            <td>
                <a href="Books?action=loan">Loan</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>

</table>
</body>
<script src="../jquery/jquery-3.5.1.min.js"></script>
<script src="../datatables/js/jquery.dataTables.min.js"></script>
<script src="../datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableBook').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    } );
</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</html>
