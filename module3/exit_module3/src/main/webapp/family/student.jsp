<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 7/11/2022
  Time: 9:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
  <table>
    <tr>
      <th>Stt</th>
      <th>name</th>
      <th>class</th>
    </tr>
    <c:forEach items="studentList" var="temp">
      <tr>
        <td>${temp.stt}</td>
        <td>${temp.name}</td>
        <td>${temp.class}</td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
