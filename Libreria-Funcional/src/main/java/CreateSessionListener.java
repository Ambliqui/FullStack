
import com.arelance.beans.Usuario;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.Set;

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
public class CreateSessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        se.getSession().setAttribute("listado",new HashSet<Usuario>());
    }
       

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }
}
