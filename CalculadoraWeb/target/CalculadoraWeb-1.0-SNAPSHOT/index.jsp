<%-- 
    Document   : index
    Created on : 8 jul. 2021, 9:55:25
    Author     : Mefisto
--%>

<%!
    public double operacion(HttpServletRequest request) {

        double resultado = 0;
        double x = Double.parseDouble(request.getParameter("op1"));
        double y = Double.parseDouble(request.getParameter("op2"));

        switch (request.getParameter("operacion")) {
            case "sumar":
                resultado = x + y;
                break;
            case "restar":
                resultado = x - y;
                break;
            case "multiplicar":
                resultado = x * y;
                break;
            case "dividir":
                resultado = x / y;
                break;
        }
        return resultado;
    }

    private String casilla1 = "";
    private String casilla2 = "";
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        casilla1 = request.getParameter("op1") == null ? "" : request.getParameter("op1");
        casilla2 = request.getParameter("op2") == null ? "" : request.getParameter("op2");
    %>
    <body>
        <h1>Calculadora</h1>
        <form>
            <label>Num 1</label><input type="text" name="op1" placeholder="0" value="<%=casilla1%>"><br>
            <label>Num 2</label><input type="text" name="op2" placeholder="0" value="<%=casilla2%>"><br>            
            <input type="submit" name ="operacion" value="sumar">
            <input type="submit" name ="operacion" value="restar">
            <input type="submit" name ="operacion" value="multiplicar">
            <input type="submit" name ="operacion" value="dividir">
        </form>
        <%
            if (request.getParameter("op1") != null && request.getParameter("op2") != null) {
        %>
        <label>Resultado</label><br>
        <input type="number" name="resultado" value="<%=operacion(request)%>"><br>

        <%} else {
                out.print("No se puede dividir por 0");
            }
        %>
        <%}%>
    </body>
</html>
