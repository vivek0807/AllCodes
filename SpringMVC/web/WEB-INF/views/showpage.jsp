<%--
  Created by IntelliJ IDEA.
  User: vivek
  Date: 24-04-2020
  Time: 00:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@taglib uri = "http://www.springframework.org/tags" prefix = "sf"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="#e6e6fa">
<form:form name="" action="helpdesk"   modelAttribute="helper" method="post">
    <table>
        <tr>
            <td>Choose Service</td>
            <td><form:select path="serviceType" name="serviceType">
                <form:options items="${serviceList}"/>
            </form:select></td>
        </tr>
        <tr><td>Total Hours Service Required</td>
            <td><form:input path="noOfHours" name="noOfHours"></form:input></td>
        </tr>
        <tr>
            <td><input type="submit" name="submit" value="TotalCost"></td>
            <td><input type="reset" name="reset" value="Cancel"></td>
        </tr>
    </table>
    <table>

    </table>
</form:form>
<h2> </h2>
</body>
</html>
