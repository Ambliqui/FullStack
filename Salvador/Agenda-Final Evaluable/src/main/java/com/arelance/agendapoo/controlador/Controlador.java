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

import com.arelance.agendapoo.data.ScheduleData;
import com.arelance.agendapoo.modelo.ScheduleDao;
import com.arelance.agendapoo.servicio.Verification;
import com.arelance.agendapoo.vista.InOut;
import com.arelance.agendapoo.vista.MenuMain;

/**
 *
 * @author Mefisto
 */
public class Controlador {

    private static Controlador controlador;
    //Creamos instancias de todos los elementos que vamos a relacionar
    private static ScheduleDao agenda = ScheduleDao.getInstance();
    private static Verification verificacion = new Verification();
    private static InOut inout = new InOut();

    private Controlador() {
        //llama aqui a iniciar y que no sea static etc... e instancia a Controller 
        // en el main
        //por cierto el Controller es un buen candidato para un Singleton
//        controlador = Controlador.getInstance();
//        controlador.iniciar();
    }
    
    public static Controlador getInstance(){
        if (controlador == null) {
            controlador = new Controlador();
        }
        return controlador;
    }

    /**
     * Los metodos a desarrollar se van a encargar de recibir peticiones de las
     * vistas la vista recogera en caso de ser necesario el objeto que necesite
     * el DAO lo validará y una vez revisado en el Controlador si está correcto
     * lo mandamos a DAO y si no lo mandamos a una vista para que de el mensaje
     * de error.
     *
     * De igual manera vamos a ir informando al usuario de cada accion que vaya
     * realizando de forma correcta.
     */
    //XXX no instancias nunca el Contolador no es un MVC es un ¿Static?-VC 
    //no lo hagas así... no existe este patrón
    public boolean iniciar() {
        //Mostrmos la bienvenida
        System.out.println("Bienvenido a tu agenda personal\n¿En que puedo ayudarte?");
        //Autorrellenamos el array (opcional, solo para poder hacer puebas de la mayoía de los metodos)
        agenda.autoFillSchedule();
        /**
         * *********************************************************************
         * Seguimos con el Menu principal, el cual será un bucle infinito con
         * los diferentes métodos que nos va a lanzar peticiones al Controlador
         * 
         * Tambien esta integrada la parte de hacerlo por herencia y con el
         * objeto Option, No la dejo funcional (aunque lo es) para no interferir
         * en el programa. Lo he intentado al menos, pero sigue si ser totalmente
         * escalable
         * 
         * Post data. Tras la explicacion del viernes 18 de junio queda pendiente
         * la implementacion del menu con un patron Command
         * *********************************************************************
         */
        MenuMain.loopMainMenu();
        return true;
    }
   
    public void imprimirAgenda() {
        //Verifico si la agenda NO está vacía desde el DAO
        if (!verificacion.empySchedule(agenda)) {
            inout.printSchedule(ScheduleData.getInstance().getAgendaDato(), agenda.getContador());
        } else {
            //Mando a vista
            inout.printInfoMsg(1);
        }
    }
    
    public String[] buscarContacto(String[] contact) {
        int indice = -1;
        if (!verificacion.empySchedule(agenda)) {
//            indice = agenda.findContact(contact);
        } else {
            //Agenda Vacia
            inout.printInfoMsg(1);
        }
        return contact;
    }
    // debe recibir un contacto o un array unidimensional[nombre, etc...]
    public void mostrarContacto(String[] valor) {
        //XXX
        // está acoplado debes tener como parametro el contacto y cuando llamas al método
        // mostarContacto(buscarContacto(field,valor)) no usas para nada field y valor en el método mostarContacto
        // son los parámetros de buscarContacto...
//        int indice = controlador.buscarContacto(valor);
//        if (indice != -1) {
//            inout.printContact(agenda.getAgenda(), indice);
//        } else {
//            inout.printInfoMsg(5);
//        }
    }
    //menos los de la vista  está ok
    public void agregarContacto(String[] contactoCreado) {
        if (verificacion.fullSchedule(agenda)) {
            if (contactoCreado != null) {
                if (agenda.addContact(contactoCreado) != null) {
                    inout.printInfoMsg(2);
                } else {
                    //Se ha producido un error
                    inout.printInfoMsg(6);
                }
            } else {
                //Se ha producido un error
                inout.printInfoMsg(6);
            }
        } else {
            //Agenda llena
            inout.printInfoMsg(0);
        }
    }
    //así no se busca es por un comparator o por el comrarable y el binariSearch
    public void modificarContacto(String[] contacto, String[] nuevoContacto) {
        if (contacto != null) {
            if (agenda.modifyContact(contacto, nuevoContacto) != null) {
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
//XXX ver comentarios más abajo
        public void borrarContacto (String[] contacto) {
            if (agenda.deleteContact(contacto) != null) {
                //Borrado correctamente
                inout.printInfoMsg(3);
            } else {
                //Se ha producido un error
                inout.printInfoMsg(6);
            }
    }
//XXX mejor así.Además, tienes los dos tipos de mensajes juntos.Los de error y los de información.
//     public static void borrarContacto(int field, String valor) {
//        int indice = buscarContacto(field, valor);
//        int msg;
//        if (indice != -1) {
//            if (agenda.deleteContact(indice) != null) {
//                //Borrado correctamente
//                msg = 3;
//            } else {
//                //Se ha producido un error
//               msg=6;
//            }
//        } else {
//            //Elemento no encontrado
//            msg=5;
//        }
//         inout.printInfoMsg(msg);
//    }

    //Metodo para hacer pruebas de diferentes métodos. Es relativamente normal encontrarlos en ciertas aplicaciones
    //Debes de retorna el número y mostar el printInfoMsg fuera...
    public void borrarAgenda() {
        if (!verificacion.empySchedule(agenda)) {
            if (agenda.deleteSchedule() != null) {
                //Agenda borrada con exito
                inout.printInfoMsg(8);
            } else {
                //Se ha producido un error
                inout.printInfoMsg(6);
            }
        } else {
            //Agenda Vacia
            inout.printInfoMsg(1);
        }
    }

    //Metodo para hacer pruebas de diferentes métodos. Es relativamente normal encontrarlos en ciertas aplicaciones
    //vista y datos juntos
    public void rellenarAgenda() {
        agenda.autoFillSchedule();
        //Restaurada copia de seguridad
        inout.printInfoMsg(9);

    }
}
