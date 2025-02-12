<%--
  Created by IntelliJ IDEA.
  User: ramaz
  Date: 11.02.2025
  Time: 7:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cart</title>
</head>
<body>
    <%@ page import="com.example.myjakartaee.Cart" %>

    <% Cart cart = (Cart) session.getAttribute("cart"); %>

    <p> <%= cart.getName() %> </p>
    <p> <%= cart.getQuantity() %> </p>
</body>
</html>
