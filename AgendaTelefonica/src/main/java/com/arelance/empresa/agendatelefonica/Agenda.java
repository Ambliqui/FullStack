/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.agendatelefonica;

/**
 *
 * @author lenovo
 */
public class Agenda {

    private String contactos[][];
    private static final int NOMBRE = 0;
    private static final int EMAIL = 1;
    private static final int TELEFONO = 2;
    private int contador;

    public Agenda() {
        contactos = new String[15][];

    }

    //Creamos el metodo para añadir un contacto.
    public void llenarAgenda(Contacto contacto) {
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                contactos[i] = new String[]{contacto.getNombre(), contacto.getEmail(), contacto.getTlf()};
                contador++;
                break;
            }

        }
    }

    public Contacto getContacto(int index) {

        return new Contacto(contactos[index][NOMBRE], contactos[index][EMAIL], contactos[index][TELEFONO]);

    }

    //Creamos el metodo
    public Contacto[] getContactos() {
        Contacto[] contactos = new Contacto[contador];
        for (int i = 0; i < contador; i++) {
            contactos[i] = getContacto(i);
        }
        return contactos;
    }
}
