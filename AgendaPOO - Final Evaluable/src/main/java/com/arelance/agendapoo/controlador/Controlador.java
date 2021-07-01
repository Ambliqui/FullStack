/**
 * Con el controlador vamos a conectar la vista y el modelo
 * Para ello vamos a instaciar cada uno de los elementos que entran en juego
 * 
 * Definicion encontrada de controlador:
 * Recibe los eventos de entrada (un clic, un cambio en un campo de texto, etc.).
 * Contiene reglas de gestión de eventos, del tipo "SI Evento Z, entonces Acción W".
 * Estas acciones pueden suponer peticiones al modelo o a las vistas. Una de
 * estas peticiones a las vistas puede ser una llamada al método "Actualizar()".
 * Una petición al modelo puede ser "Obtener_tiempo_de_entrega
 * ( nueva_orden_de_venta )". 
 */
package com.arelance.agendapoo.controlador;

import com.arelance.agendapoo.modelo.ScheduleDao;
import com.arelance.agendapoo.servicio.Verification;
import com.arelance.agendapoo.vista.InOut;
import com.arelance.agendapoo.vista.MenuMain;

/**
 *
 * @author Mefisto
 */
public class Controlador {

    private static ScheduleDao agenda = ScheduleDao.getInstance();
    private static Verification verificacion = new Verification();
    private static InOut inout = new InOut();

    public Controlador() {
    }

    //Recibo datos
    //Los derivo a vista o a Dao
    public static void imprimirAgenda() {
        //Mando a modelo
        if (!verificacion.empySchedule(agenda)) {
            inout.printSchedule(agenda.getAgenda(), agenda.getContador());
        } else {
            //Mando a vista
            inout.printInfoMsg(1);
        }
    }

    public static int buscarContacto(int field, String valor) {
        int indice = -1;
        if (!verificacion.empySchedule(agenda)) {
            indice = agenda.findContact(field, valor);
        } else {
            //Agenda Vacia
            inout.printInfoMsg(1);
        }
        return indice;
    }

    public static void mostrarContacto(int field, String valor) {
        int indice = buscarContacto(field, valor);
        if (indice != -1) {
            inout.printContact(agenda.getAgenda(), indice);
        } else {
            inout.printInfoMsg(5);
        }
    }

    public static void agregarContacto(String[] contactoCreado) {
        if (verificacion.fullSchedule(agenda)) {
            if (contactoCreado != null) {
                agenda.addContact(contactoCreado);
                inout.printInfoMsg(2);
            } else {
                //Se ha producido un error
                inout.printInfoMsg(6);
            }
        } else {
            inout.printInfoMsg(0);
        }
    }

    public static void modificarContacto(int field, String valor, String[] nuevoContacto) {
        int indice = buscarContacto(field, valor);
        if (indice != -1) {
            if (agenda.modifyContact(indice, nuevoContacto) != null) {
                inout.printInfoMsg(4);
            } else {
                //Se ha producido un error
                inout.printInfoMsg(6);
            }
        } else {
            //Elemento no encontrado
            inout.printInfoMsg(5);
        }
    }

    public static void borrarContacto(int field, String valor) {
        int indice = buscarContacto(field, valor);
        if (indice != -1) {
            if (agenda.deleteContact(indice) != null) {
                //Borrado correctamente
                inout.printInfoMsg(3);
            } else {
                //Se ha producido un error
                inout.printInfoMsg(6);
            }
        } else {
            //Elemento no encontrado
            inout.printInfoMsg(5);
        }
    }

    public static void borrarAgenda() {
        if (!verificacion.empySchedule(agenda)) {
            agenda.deleteSchedule();
            inout.printInfoMsg(8);
        } else {
            //Agenda Vacia
            inout.printInfoMsg(1);
        }
    }

    public static void rellenarAgenda() {
        agenda.autoFillSchedule();
        //Restaurada copia de seguridad
        inout.printInfoMsg(9);

    }
    
    public static void iniciar(){
        
        //Mostrmos la bienvenida
        System.out.println("Bienvenido a tu agenda personal\n¿En que puedo ayudarte?");
        //Autorrellenamos el array (opcional, solo para poder hacer puebas de la mayoía de los metodos)
        agenda.autoFillSchedule();
        /**
         * *********************************************************************
         * Seguimos con el Menu principal, el cual será un bucle infinito con
         * los diferentes métodos que nos va a lanzar peticiones al Controlador
         * *********************************************************************
         */
        MenuMain.loopMainMenu();
    }
}
