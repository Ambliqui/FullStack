/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendarefinitiva.menu.actions;

import com.arelance.agendarefinitiva.menu.Action;
import com.arelance.agendarefinitiva.modelo.SingletonAgenda;
import com.arelance.agendarefinitiva.modelo.Contact;
import com.arelance.agendarefinitiva.vista.InOut;

/**
 *
 * @author Mefisto
 */
public class ModifyAction implements Action<Contact>{

    @Override
    public void execute(Contact t) {
        int index = 0;
        Contact contactoModificado = InOut.createContact();
        SingletonAgenda.INSTANCE.agenda.set(index, contactoModificado);
        System.out.println("Modifico contacto");
    }
    
}
