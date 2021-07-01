/**
 * El mini-patron Dao-Vo hace que una parte del modelo lleve la estructura del
 * dato (VO es un Bean) y que el DAO sea la encargada de recibir los parametros adecuados
 * para comunicarse con la parte persistente de datos
 */
package com.arelance.agendapoo.modelo;

import com.arelance.agendapoo.data.ContactData;
import com.arelance.agendapoo.data.ScheduleData;
import java.util.Arrays;

/**
 *
 * @author Mefisto
 */
public class ScheduleDao{

    //Propiedad necesaria para el patron Singleton, es la única instancia sobre la que vamos a trabajar
    private static ScheduleDao scheduleDao;
    //Pedimos los datos a las distintas "entidades" de la base de datos
    private String[][] agenda = ScheduleData.getInstance().getAgendaDato();
    private ContactVo[] contactos = ContactData.getInstance().getContactos();
    private final int MAX_CONTACT = ScheduleData.getInstance().getMAX_CONTACT();
    private final int MAX_DATA = new ScheduleVo().getMAX_DATA();
    //Definmos un contador para saber en que posicion nos encontramos
    private Integer contador = -1;
    private String[] contactoArray;

    //Definimos un único constructor como privado para poder hacer el patron Singleton
    private ScheduleDao() {
    }

    //De esta es la unica manera de pedirle una instancia a la clase
    //Queda pendiente hacerlo por Enum en version de colecciones
    public static ScheduleDao getInstance() {
        //Si la instacia no existe la crea, sino nos devuelve la que ya existe
        if (scheduleDao == null) {
            scheduleDao = new ScheduleDao();
        }
        return scheduleDao;
    }

    //Método para sincronizar desde el array bidimensional al de contactos
    private ContactVo syncArray(int index) {
        contactos[index] = new ContactVo(
                agenda[index][CampoContacto.NOMBRE.ordinal()],
                agenda[index][CampoContacto.TELEFONO.ordinal()],
                agenda[index][CampoContacto.EMAIL.ordinal()]);
        return contactos[index];
    }

    //Metodo para sincronizar el DAO con los datos persistentes
    private void updateData(String[][] agenda, ContactVo[] contactos) {
        //no tiene sentido aplastar siempre los array. Los has instanciado en el singleton. Debes modificar su estado y respetar el encapsulado.
        // los ArrayList cada vez que dan de alta un nuevo elemento no  se cambian por un array nuevo....
        ScheduleData.getInstance().setAgendaData(agenda);
        ContactData.getInstance().setContactos(contactos);
    }

    //Metodo para autorrelenar el array para hacer pruebas
    public String[][] autoFillSchedule() {
        String[] fillName = {"A", "B", "C", "D", "E"};
        for (int i = 0; i < agenda.length; i++) {
            //El dato del telefono devuelve un numero de móvil en el rango de los que se pueden utilizar en España actualmente
            //String.valueOf nos convierte el entero a String
            contactos[i] = new ContactVo(fillName[i], fillName[i] + "@crtj.com", String.valueOf(i));
//            contactos[i] = new ContactVo(fillName[i], fillName[i] + "@cartuja.com", String.valueOf((int) (Math.random() * (749999999 + 1 - 600000000)) + 600000000));
            //Sincronizamos el array de agenda con el bidimensinal;
            agenda[i] = new String[]{contactos[i].getName(), contactos[i].getEmail(), contactos[i].getPhone()};
        }
        updateData(agenda, contactos);
        contador = agenda.length - 1;
        return agenda;
    }

    //Método para añadir agenda
    public String[] addContact(String[] nuevoContacto) {
        /**
         * *********************************************************************
         * Insertamos los datos en la siguiente posicion libre del array, de ahí
         * el preincremento y no el postincremento
         * ********************************************************************
         */
        agenda[++contador] = nuevoContacto;
        //Sincronizamos el array
        syncArray(contador);
        return agenda[contador];
    }

    //Método para buscar un elemento dentro del array especificando el campo. Devuelve el indice i del elemento
    public int findContact(int findField, String elementFind) {
        for (int i = 0; i <= contador; i++) {
            //Usamos equalsIgnoreCase para hacer una comparacion de cadenas que no sea Case Sensitive
            if (getAgenda()[i][findField].equalsIgnoreCase(elementFind)) {
                //Devuelve la posicion del elemento encontrado
                return i;
            }
        }
        //Bandera de no encontrado
        return -1;
    }

    //Método para modificar un contacto
//    public String[] modifyContact(int index, String[] nuevoContacto) {
//        //Introducimos los datos
//        agenda[index] = nuevoContacto;
//        //sincronizamos los array
//        syncArray(index);
//        updateData(agenda, contactos);
//        return agenda[index];
//    }
    public String[] modifyContact(String[]contacto, String[] nuevoContacto) {
        //Introducimos los datos
//        agenda[index] = nuevoContacto;
        //sincronizamos los array
//        syncArray(index);
        updateData(agenda, contactos);
        return nuevoContacto;
    }

    public String[] deleteContact(String[] contacto) {

        //Guardamos el elemento que vamos a borrar
//        String[] contactoEliminado = agenda[index];

        /**
         * *****************************************************************
         * Mejoramos el acarreo tradicional del array con un arraycopy.
         * ****************************************************************
         */
//        System.arraycopy(agenda, index + 1, agenda, index, agenda.length - 1 - index);
//        System.arraycopy(contactos, index + 1, contactos, index, contactos.length - 1 - index);
        --contador;
        updateData(agenda, contactos);//XXX lo aplastas etc... busca los usos de 
        return contacto;

    }

    //Metodo creado para hacer pruebas con la lista vacia
    public String[][] deleteSchedule() {
        String[][] copiaAgenda = agenda;
        agenda = new String[MAX_CONTACT][MAX_DATA];
        contactos = new ContactVo[MAX_CONTACT];
        contador = -1;
        updateData(agenda, contactos);
        return copiaAgenda;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Arrays.deepHashCode(this.contactoArray);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ScheduleDao other = (ScheduleDao) obj;
        if (!Arrays.deepEquals(this.contactoArray, other.contactoArray)) {
            return false;
        }
        return true;
    }
    
    public int getMAX_CONTACT() {
        return MAX_CONTACT;
    }

    public int getMAX_DATA() {
        return MAX_DATA;
    }

    public int getContador() {
        return contador;
    }

    public String[][] getAgenda() {
        return agenda;
    }
}
