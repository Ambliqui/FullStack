/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendarefinitiva;

import com.arelance.agendarefinitiva.modelo.Contact;
import com.arelance.agendarefinitiva.menu.Action;
import java.util.List;

/**
 *
 * @author Mefisto
 */
public class GestorContacto {

//    private Action<Contact>[] accion;
    private Action<Contact>[] accion;

    public GestorContacto(Action<Contact>[] opciones) {
        this.accion = opciones;
    }

    //Pasamos el indice de la opcion y un contacto sobre el que ejecutamos la accion
    public void executeCommand(int index, Contact contact) {
        accion[index].execute(contact);
    }
    
    //El Array ya es de un tipo en concreto
//    public void executeCommand(int index, List<Contact> contact) {
//        accion[index].execute(contact);
//    }
}
