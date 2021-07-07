<%-- 
    Document   : main_menu
    Created on : 6 jul. 2021, 17:51:00
    Author     : Mefisto
--%>

<%@page import="com.arelance.beans.Usuario"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Biblioteca Municipal</title>
    </head>
    <body>
        <h1>Bienvenido a nuestra libreria</h1>
        <form name="formulario" action="Controller" method="GET">
            <label>Nombre: </label><br>
            <input type="text" name="nombre"><br> 
            <label>Apellido: </label><br>
            <input type="text" name="apellido"><br>
            <label>Edad: </label><br>
            <input type="number" name="edad"><br><br>
            <input type="submit" name="accion" value="alta">
            <input type="submit" name="accion" value="baja">
            <input type="submit" name="accion" value="imprimir">
        </form>
        <%
            Set<Usuario> listado = (Set<Usuario>) request.getSession().getAttribute("listado");
            out.println("<br>Usuarios de la libreria: " + listado.size());
            for (Usuario usuario : listado) {
                out.print("<br>" + usuario.toString());
            }
        %>
    </body>
</html>
