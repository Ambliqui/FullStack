<%-- 
    Document   : datos_registro
    Created on : 6 jul. 2021, 13:05:51
    Author     : Mefisto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <form name="formulario" action="./Controller" method="GET">
            <label>Nombre: </label><br>
            <input type="text" name="nombre"><br> 
            <label>Apellido: </label><br>
            <input type="text" name="apellido"><br>
            <label>Edad: </label><br>
            <input type="number" name="edad"><br> 
            <label>Password: </label><br>
            <input type="password" name="password"><br>
            <input type="submit" name="accion" value="alta">
            <input type="submit" name="accion" value="baja">
            <input type="submit" name="accion" value="imprimir">
        </form>
    </body>
</html>
