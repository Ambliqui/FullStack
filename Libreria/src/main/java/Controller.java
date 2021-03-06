
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.arelance.beans.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mefisto
 */
@WebServlet(urlPatterns = {"/Controller"})
public class Controller extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String edad = request.getParameter("edad");
        String accion = request.getParameter("accion");

        Set<Usuario> listado = (Set<Usuario>) request.getSession().getAttribute("listado");
//        request.getSession().setAttribute("currentUser", new Usuario(nombre,apellido,edad));

        Usuario usuarioEliminado = new Usuario(nombre, apellido, edad);
        HttpSession session = request.getSession();
        session.setAttribute("usuarioEliminado", usuarioEliminado);

        if (accion.equals("alta")) {
            listado.add(new Usuario(nombre, apellido, edad));
            request.getSession().setAttribute("listado", listado);

//            request.getServletContext().
//                    getRequestDispatcher("/main_menu.jsp").
//                    forward(request, response);
            response.sendRedirect("./main_menu.jsp");
            return;
        }

        if (accion.equals("baja")) {
//            Usuario usuarioEliminado = new Usuario(nombre, apellido, edad);
//            HttpSession session = request.getSession();
//            session.setAttribute("usuarioEliminado", usuarioEliminado);

            request.getServletContext().
                    getRequestDispatcher("/baja_confirmar.jsp").
                    forward(request, response);
//            response.sendRedirect("./baja_confirmar.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
