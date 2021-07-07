


import com.arelance.beans.Libro;
import com.arelance.beans.Usuario;
import java.util.HashSet;
import java.util.LinkedHashMap;
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
//        LinkedHashMap<Libro, Set<Usuario>> libreria = new LinkedHashMap<>();
//        libreria.put(null, null);
//        libreria.put(new Libro("La historia interminable", "1"), null);
//        libreria.put(new Libro("La vuelta al mundo en 80 dias", "2"), null);
//        libreria.put(new Libro("Dracula", "3"), null);
//        libreria.put(new Libro("El retrato de Dorian Gray", "4"), null);
//        libreria.put(new Libro("El sabueso de los Baskerbille", "5"), null);
//        se.getSession().setAttribute("biblioteca", libreria);
        
        se.getSession().setAttribute("listado", new HashSet<Usuario>());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }
}
