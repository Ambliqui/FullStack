/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendarefinitiva.menu.actions;

import com.arelance.agendarefinitiva.menu.Action;
import com.arelance.agendarefinitiva.modelo.Contact;

/**
 *
 * @author Mefisto
 */
public class ShowContactAction implements Action<Contact>{

    @Override
    public void execute(Contact item) {
         System.out.println("\nUsuario: " + "\n\tNombre : "+ item.getNombre() + "\n\tTelefono :  " + item.getTelefono() + "\n\tEmail :  " + item.getEmail());
    }
    
}
