/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendacapas.modelo;

import com.arelance.agendacapas.vista.Print;

/**
 *
 * @author Mefisto
 */
public class AgendaDao {
    
    private static AgendaDao agendaDao;
    //Definimos el maximo de filas que en nuestro caso van a ser agenda
    private final int MAX_CONTACT = 5;

    /**
     * *************************************************************************
     * Definimos el maximo de columnas que en nuestro caso van a ser los datos
     * Si no definimos el tamaño de esta dimension en el array, el for del
     * método createContact da fallos puesto que al no tener tamaño definido no
     * podemos hacer un lenght. Habitualmete dejariamos el tamaño sin definir.
     * **************************************************************************
     */
    private final int MAX_DATA = 3;
    //Constante para indice de la propiedad nombre
    private static final int NOMBRE = 0;
    //Constante para indice de la propiedad email
    private static final int TELEFONO = 1;
    //Constante para indice de la propiedad nombre
    private static final int EMAIL = 2;
    //Definmos un contador para saber en que posicion nos encontramos
    private Integer contador = -1;

    private AgendaDao() {
    }
    
    public static AgendaDao getInstance(){
        if(agendaDao == null){
            agendaDao = new AgendaDao();
        }
        return agendaDao;
    }

    public String[][] autoFillSchedule() {
         
        String[][] agenda =  AgendaVo.getInstance().getAgenda();
        ContactoVo[] contactos = new ContactoVo().getContactos();
        String[] fillName = {"Antonio", "Marcos", "Pedro", "Ruben", "Isi"};
        for (int i = 0; i < agenda.length; i++) {
            //El dato del telefono devuelve un numero de móvil en el rango de los que se pueden utilizar en España actualmente
            //String.valueOf nos convierte el entero a String
            contactos[i] = new ContactoVo(fillName[i], String.valueOf((int) (Math.random() * (749999999 + 1 - 600000000)) + 600000000), fillName[i] + "@cartuja.com");
            //Sincronizamos el array de agenda con el bidimensinal;
            agenda[i] = new String[]{contactos[i].getNombre(), contactos[i].getTelefono(), contactos[i].getEmail()};
        }
        contador = MAX_CONTACT - 1;
        return agenda;
    }

    public boolean agregarContacto() {
        //Llamar desde contolador
        //comprobar agenda no llena
        //crear contacto, llamar a IntroDato
        //Agregar contacto a AgendaVo
        //Sincronizar Contacto Vo
        //Sumar contador
        
        return true;
    }

    public boolean buscarContacto() {
        return true;
    }

    public boolean modificarContacto() {
        return true;
    }

    public boolean eliminarContacto() {
        return true;
    }
    
    public void imprimirAgenda(){
        Print.printSchedule(AgendaVo.getInstance().getAgenda());
    }

    public static void main(String[] args) {
        
    }
}
