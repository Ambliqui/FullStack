<%-- 
    Document   : baja
    Created on : 6 jul. 2021, 13:25:32
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
        <h1>¿Seguro que quieres darte de baja?</h1>
        <form name="formulario" action="./Controller" method="GET">
            
            <input type="submit" name="accion" value="Si">
            <input type="submit" name="accion" value="No">
        </form>
    </body>
</html>
