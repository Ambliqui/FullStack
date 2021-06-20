/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendarefinitiva.menu.actions;

import com.arelance.agendarefinitiva.modelo.Contact;
import com.arelance.agendarefinitiva.menu.Action;
import com.arelance.agendarefinitiva.modelo.SingletonAgenda;

/**
 *
 * @author Mefisto
 */
public class AddAction implements Action<Contact>{

    @Override
    public void execute(Contact t) {
        SingletonAgenda.INSTANCE.agenda.add(t);
        System.out.println("Método agregar");
    }
    
}
