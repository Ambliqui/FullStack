/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendapoo.vista.menusalternativos;

import com.arelance.agendapoo.controlador.Controlador;
import com.arelance.agendapoo.vista.*;
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
        showMenu("Escoge una opcion\n");
        int option = InOut.getNumber();
//        switch (option) {
//            case 1:
//                Controlador.imprimirAgenda();
//                break;
//            case 2:
//                Controlador.mostrarContacto(FindMenu.loopFindMenu(), InOut.getData("¿Que quieres buscar?"));
//
//                break;
//            case 3:
//                Controlador.agregarContacto(InOut.createContact(3));
//                break;
//            case 4:
//                Controlador.modificarContacto(FindMenu.loopFindMenu(), InOut.getData("¿A quien quieres modificar?"), InOut.createContact(3));
//                break;
//            case 5:
//                Controlador.borrarContacto(FindMenu.loopFindMenu(), InOut.getData("¿Que qiueres buscar?"));
//                break;
//            case 6:
//                System.out.println("Gracias por usar esta aplicación");
//                System.exit(0);
//        }
        return option;
    }
    public static void main(String[] args) {

    }
}
