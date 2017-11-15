<%--
  Created by IntelliJ IDEA.
  User: ADMIN-PC
  Date: 11/14/2017
  Time: 10:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>RegisterForm</title>
</head>
<body>

<form action="/register" method="POST">
    <fieldset>
        <legend>Form Dang Ky</legend>
        <div class="form-group">
            <label for="">FullName</label>
            <input type="text" name="fullName">
        </div>
        <div class="form-group">
            <label for="">Rollnum</label>
            <input type="text" name="rollNumber">
        </div>
        <div class="form-group">
            <label for="">Address</label>
            <input type="text" name="address">
        </div>
        <div class="form-group">
            <label for="">Email</label>
            <input type="text" name="email">
        </div>
        <button type="submit">SUBMIT</button>
    </fieldset>
</form>

</body>
</html>
