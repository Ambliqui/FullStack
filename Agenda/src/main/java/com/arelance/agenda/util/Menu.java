/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agenda.util;

import com.arelance.agenda.datos.Agenda;

/**
 *
 * @author Mefisto
 */
public class Menu {

    public static void showMenu() {
        String option = "0";
        while (!"6".equals(option)) {
            printMenu();
            option = accionMenu();
        }
    }

    private static void printMenu() {
        System.out.println("Selecciona una opcion: "
                + "\n1.- Añadir contacto."
                + "\n2.- Buscar contacto."
                + "\n3.- Borrar contacto."
                + "\n4.- Modificar contacto."
                + "\n5.- Imprimir agenda."
                + "\n6.- Salir del programa.");
    }

    private static String accionMenu() {
        String option = Datos.getData("");
        switch (option) {
            case "1":
                Agenda.addContact();
                break;
            case "2":
                Agenda.showContact();
                break;
            case "3":
                Agenda.deleteContact();
                break;
            case "4":
                Agenda.modifyContact();
                break;
            case "5": 
                Agenda.printSchedule();
                break;
            case "6":
                Imprimir.printBye();
                break;
            default:
                System.out.println("La opcion elegida no es correcta");
                break;
        }
        //System.exti(0);
        return option;
    }
}
