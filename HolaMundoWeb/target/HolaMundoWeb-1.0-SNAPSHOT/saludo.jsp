<%-- 
    Document   : saludo
    Created on : 6 jul. 2021, 9:43:06
    Author     : Mefisto
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Helloou</h1>
        <%
        List<Usuario> listado= (List<Usuario>) request.getSession().getAttribute("listado");
        
        out.print("Calla");
        %>
    </body>
</html>
