<%--
  Created by IntelliJ IDEA.
  User: livch
  Date: 22.06.2021
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>

<h1>Registration</h1>

<form action="registration" method="post">
    <label >First name :</label> <input name="firstName">
    <br>
    <label >Lastname :</label> <input name="lastName">
    <br>
    <label >email :</label> <input name="email">
    <br>
    <label >password :</label> <input name="password">
    <br>
    <input type="submit" value="Submit">

</form>

</body>
</html>
