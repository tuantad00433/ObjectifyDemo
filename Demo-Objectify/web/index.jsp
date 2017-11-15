<%--
  Created by IntelliJ IDEA.
  User: ADMIN-PC
  Date: 11/14/2017
  Time: 9:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <a href="/register">Click here to register</a>
  <br>

  <form action="/lookup" method="POST">
    <fieldset>
      <legend>Looking Up for Student by ID</legend>
      <label>Student ID: </label>
      <input type="text" name="id">
      <button type="submit">SEARCH</button>
    </fieldset>

  </form>

  </body>
</html>
