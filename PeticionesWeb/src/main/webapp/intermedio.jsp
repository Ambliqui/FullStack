<%-- 
    Document   : intermedio
    Created on : 8 jul. 2021, 9:33:41
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
        <h1>Intermedia</h1>
        <%
            out.print(request.getAttribute("test"));
        %>
        <a href="final.jsp">Final</a>
    </body>
</html>
