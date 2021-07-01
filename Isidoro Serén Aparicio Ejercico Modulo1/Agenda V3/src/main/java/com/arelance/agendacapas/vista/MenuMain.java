/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendacapas.vista;

import com.arelance.agendacapas.*;
import com.arelance.agendacapas.modelo.*;
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

    public int accionMainMenu() {
        AgendaDao agendaDao = AgendaDao.getInstance();
        showMenu("Escoge una opcion\n");
        int option = IntroDato.getNumber();
        switch (option) {
            case 1:
                agendaDao.imprimirAgenda();
                break;
            case 2:
                agendaDao.buscarContacto();
                break;
            case 3:
                agendaDao.agregarContacto();
                break;
            case 4:
                agendaDao.modificarContacto();
                break;
            case 5:
                agendaDao.eliminarContacto();
                break;
            case 6:
                System.out.println("Gracias por usar esta aplicación");
                System.exit(0);
        }
        return option;
    }

    public static void main(String[] args) {

    }
}
