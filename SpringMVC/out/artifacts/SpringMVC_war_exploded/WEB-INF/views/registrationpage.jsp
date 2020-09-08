<%--
  Created by IntelliJ IDEA.
  User: vivek
  Date: 15-05-2020
  Time: 01:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<h2>Welcome to Online Help Services</h2>
<form:form modelAttribute="register"  action="register" method="post">
    <table>
        <tr>
            <td>UserName</td>
            <td><form:input path="userName" name="userName" id="userName"/></td>
            <td><form:errors path="userName" cssClass="error"/> </td>
        </tr>
        <tr>
            <td>Contact</td>
            <td><form:input path="contactNumber" name="contactNumber" id="contactNumber"/></td>
            <td><form:errors path="contactNumber" cssClass="error"/></td>

        </tr><tr>
            <td>Email</td>
            <td><form:input path="emailId" name="emailId" id="emailId"/></td>
            <td><form:errors path="emailId" cssClass="error"/></td>
        </tr><tr>
            <td>Confirm Email</td>
            <td><form:input path="confirmEmailId" name="confirmEmailId" id="confirmEmailId"/></td>
            <td><form:errors path="confirmEmailId" cssClass="error"/></td>
        </tr>
        <tr>
            <td><form:checkbox path="status" name="check" id="check"></form:checkbox></td>
            <td>I agree</td>
            <td><form:errors path="status" cssClass="error"/></td>
        </tr>
        <tr>
            <td><input type="submit" name="submit" value="Register"></td>
            <td><input type="reset" name="reset" value="Reset"></td>
        </tr>
    </table>
</form:form>
</body>
</html>
