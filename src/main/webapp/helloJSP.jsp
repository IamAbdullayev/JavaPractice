<%@ page import="java.time.LocalTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: ramaz
  Date: 10.02.2025
  Time: 5:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>

    <%
        String name = request.getParameter("name");
    %>

    <%=
        "Hi " + name
    %>

</h1>

<ol>
    <li><a href="hello-servlet">hello-servlet</a></li>
    <li><a href="cart">cart</a></li>
    <li><a href="get-cookies">get-cookies</a></li>
    <li><a href="set-cookies">set-cookies</a></li>
    <li><a href="delete-cookies">delete-cookies</a></li>
    <li><a href="library">library</a></li>
</ol>

</body>
</html>
