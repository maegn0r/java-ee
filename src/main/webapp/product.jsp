<%@page import="java.util.List" %>
<%@page import="ru.gb.entity.Product" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Продукты</title>
    <style>
        li {
            list-style-type: none;
        }
    </style>
</head>
<body>
<h2>Продукты</h2>
<ul>
    <% for (Product product : (List<Product>) (request.getAttribute("products"))) { %>
    <li><b><%=product.getName()%>
    </b></li>
    <li>вес: <%=product.getWeight()%> кг.; тип: <%=product.getType()%>
    </li>
    <li><br></li>
    <% } %>
</ul>
</body>
</html>
