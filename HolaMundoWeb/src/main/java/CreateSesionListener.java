
import java.util.ArrayList;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Web application lifecycle listener.
 *
 * @author Mefisto
 */

public class CreateSesionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        se.getSession().setAttribute("listado", new ArrayList<>());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        //momento para no perder los datos
        //Cerrar lo que tenda abierto
    }
}
