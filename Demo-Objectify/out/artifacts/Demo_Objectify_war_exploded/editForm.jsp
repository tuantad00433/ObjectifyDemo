<%@ page import="com.entity.Student" %><%--
  Created by IntelliJ IDEA.
  User: ADMIN-PC
  Date: 11/14/2017
  Time: 11:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% Student student = (Student) request.getAttribute("studentFound");%>
<form action="/edit" method="POST">
    <fieldset>
        <legend>Form Dang Ky</legend>
        <div class="form-group">
            <label for="">Id</label>
            <input type="text" name="id" value=<%=student.getId() %> >
        </div>
        <div class="form-group">
            <label for="">FullName</label>
            <input type="text" name="fullName" value=<%=student.getFullName() %> >
        </div>

        <div class="form-group">
            <label for="">Rollnum</label>
            <input type="text" name="rollNumber" value=<%=student.getRollNumber() %>>
        </div>
        <div class="form-group">
            <label for="">Address</label>
            <input type="text" name="address" value=<%=student.getAddress() %>>
        </div>
        <div class="form-group">
            <label for="">Email</label>
            <input type="text" name="email" value=<%=student.getEmail() %>>
        </div>
        <div class="form-group">
            <label for="">Status</label>
            <input type="text" name="status" value=<%=student.getStatus() %> >
        </div>
        <button type="submit">SUBMIT</button>
    </fieldset>
</form>
</body>
</html>
