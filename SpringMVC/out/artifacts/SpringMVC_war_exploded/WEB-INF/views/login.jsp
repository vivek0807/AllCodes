<%@ page import="com.app.controller.LoginBean" %><%--
  Created by IntelliJ IDEA.
  User: vivek
  Date: 24-04-2020
  Time: 00:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@taglib uri = "http://www.springframework.org/tags" prefix = "sf"%>
<jsp:useBean id="loginBean" class="com.app.controller.LoginBean" scope="application"/>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="#e6e6fa">
<form:form name="loginForm" action="submitlogin"   modelAttribute="loginBean" method="post">
    <table>
        <tr>
            <td><form:input type ="text" path="userName"/></td>
        </tr>
        <tr><td>
            <form:input type ="password" path="password"/>
        </td></tr>
        <tr>
            <td>
                <input type="submit" value="submit"/>
            </td>
        </tr>

    </table>

</form:form>
</body>
</html>
