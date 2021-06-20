/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendarefinitiva.menu;

import com.arelance.agendarefinitiva.modelo.SingletonAgenda;
import com.arelance.agendarefinitiva.GestorContacto;
import com.arelance.agendarefinitiva.menu.actions.ExitAction;
import com.arelance.agendarefinitiva.menu.actions.PrintSchedule;
import com.arelance.agendarefinitiva.modelo.Contact;
import com.arelance.agendarefinitiva.vista.InOut;
import java.util.*;

/**
 *
 * @author Mefisto
 */
public class MenuMain extends Menu {

    public MenuMain() {
        opciones = new ArrayList<>();
        opciones.add(new Option(1, "Ver Agenda"));
        opciones.add(new Option(2, "Buscar contacto"));
        opciones.add(new Option(3, "Añadir Contacto"));
        opciones.add(new Option(4, "Modificar Contacto"));
        opciones.add(new Option(5, "Borrar Contacto"));
        opciones.add(new Option(6, "Salir"));
    }

    public MenuMain(ArrayList<Option> opciones) {
        this.opciones = opciones;
    }

    public void accionMainMenu(Action[] opciones) {
        GestorContacto gestor=new GestorContacto(opciones);
        showMenu("Escoge una opcion\n");
        int option = InOut.getNumber();
        if (option != 1 && option != 6) {
        gestor.executeCommand(option-1, InOut.createContact());    
        }else if (option == 1){
            new PrintSchedule().execute(SingletonAgenda.INSTANCE.agenda);
        }else{
            new ExitAction().execute(null);
        }
    }
    public static void main(String[] args) {

    }
}
