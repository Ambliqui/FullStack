/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendarefinitiva.menu.actions;

import com.arelance.agendarefinitiva.modelo.Contact;
import com.arelance.agendarefinitiva.menu.Action;
import java.util.List;

/**
 *
 * @author Mefisto
 */
public class PrintSchedule implements Action<List<Contact>> {

    @Override
    public void execute(List<Contact> t) {
        t.forEach(item -> System.out.println("\nUsuario: " + "\n\tNombre : "+ item.getNombre() + "\n\tTelefono :  " + item.getTelefono() + "\n\tEmail :  " + item.getEmail()));
    }
}
