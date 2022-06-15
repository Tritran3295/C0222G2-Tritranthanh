<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 6/10/2022
  Time: 9:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    Edit Employee
                </h2>
            </caption>
            <c:if test="${employeeList != null}">
                <input type="hidden" name="id" value="<c:out value='${employeeList.idEmployee}' />"/>
            </c:if>
            <tr>
                <th> Name Employee:</th>
                <td>
                    <input type="text" name="nameEmployee" size="45"
                           value="<c:out value='${employeeList.nameEmployee}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Day Of Birth:</th>
                <td>
                    <input type="text" name="dayOfBirth" size="45"
                           value="<c:out value='${employeeList.dayOfBirth}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Id card Employee:</th>
                <td>
                    <input type="text" name="idCardEmployee" size="45"
                           value="<c:out value='${employeeList.idCardEmployee}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Salary:</th>
                <td>
                    <input type="text" name="salary" size="15"
                           value="<c:out value='${employeeList.salary}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Phone: </th>
                <td>
                    <input type="text" name="phone" size="15"
                           value="<c:out value='${employeeList.phone}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Email:</th>
                <td>
                    <input type="text" name="email" size="15"
                           value="<c:out value='${employeeList.email}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Address:</th>
                <td>
                    <input type="text" name="address" size="15"
                           value="<c:out value='${employeeList.address}' />"
                    />
                </td>
            </tr>
            <tr>
                <th> Position:</th>
                <td>
                    <select name="idPosition">
                        <c:forEach var="c" items="${positionList}">
                            <option value="${c.idPosition}">${c.namePosition}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th> Degree Education:</th>
                <td>
                    <select name="idDegreeEducation">
                        <c:forEach var="c" items="${degreeEducationList}">
                            <option value="${c.idDegreeEducation}">${c.nameDegreeEducation}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Division:</th>
                <td>
                    <select name="idDivision">
                        <c:forEach var="c" items="${divisionList}">
                            <option value="${c.idDivision}">${c.nameDivision}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>

            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
