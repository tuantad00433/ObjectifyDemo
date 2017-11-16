<%@ page import="com.google.appengine.api.datastore.QueryResultIterator" %>
<%@ page import="com.entity.Student" %>
<%@ page import="com.google.appengine.api.datastore.Cursor" %><%--
  Created by IntelliJ IDEA.
  User: ADMIN-PC
  Date: 11/15/2017
  Time: 3:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ListStudent</title>
</head>
<body>
<% QueryResultIterator<Student> iterator = (QueryResultIterator<Student>) request.getAttribute("iterator"); %>
<p>List of 5 Students per Page</p>
<% Cursor cursor = iterator.getCursor();
   
%>
<ul>

    <% while (iterator.hasNext()) { %>
    <% Student stu = iterator.next();%>
    <li><%=stu.getId()%> ---<%=stu.getFullName()%>---<%=stu.getStatus()%>
    </li>
    <% } %>
</ul>

<a href="/getlist?cursor=<%=cursor.toWebSafeString()%>">Click to fetch the next 5 Students</a>


</body>
</html>
