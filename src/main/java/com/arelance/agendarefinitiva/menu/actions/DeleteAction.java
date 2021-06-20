/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendarefinitiva.menu.actions;

import com.arelance.agendarefinitiva.menu.Action;
import com.arelance.agendarefinitiva.modelo.SingletonAgenda;
import com.arelance.agendarefinitiva.modelo.Contact;

/**
 *
 * @author Mefisto
 */
public class DeleteAction implements Action<Contact>{

    @Override
    public void execute(Contact t) {
        SingletonAgenda.INSTANCE.agenda.remove(t);
        System.out.println("Borro contacto");
    }
    
}
