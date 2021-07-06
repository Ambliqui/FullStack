<%-- 
    Document   : confirmar_baja
    Created on : 6 jul. 2021, 19:26:54
    Author     : Mefisto
--%>

<%@page import="com.arelance.beans.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmacion de baja</title>
    </head>
    <body>
        <h1>¿Seguro que quieres realizar la baja?</h1>
        <%
            out.println(request.getParameter("nombre"));
            out.print(request.getParameter("apellido"));
            out.print(request.getParameter("edad"));
        %>
        <form name="formulario" action="ControllerDelete" method="GET">
            <input type="submit" name="opcion" value="Si">
            <input type="submit" name="opcion" value="No">
        </form>
    </body>
</html>
