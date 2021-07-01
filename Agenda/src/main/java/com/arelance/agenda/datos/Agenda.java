/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agenda.datos;

import com.arelance.agenda.util.*;

/**
 *
 * @author Mefisto
 */
public class Agenda {

    //Limite de contactos
    private static final Integer MAX_CONTACT = 15;
    //Limite de datos
    private static final Integer MAX_DATA = 4;
    //Matriz de Contactos
    private static String[][] listin = new String[MAX_CONTACT][MAX_DATA];
    private static int contador = -1;

    public Agenda() {

    }

    public static void fillSchedule() {
        String[] nombres = {"Antonio", "Marcos", "Pedro", "Ruben", "Isi", "Agustin", "Alejandro", "Gabriel", "Jorge",
            "Manuel", "Yeray", "Fran", "Miguel", "Clemente", "Sergio"};
        String[] apellidos = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"};
        for (int i = 0; i < listin.length; i++) {
            listin[i][0] = nombres[i];
            listin[i][1] = apellidos[i];
            listin[i][2] = nombres[i] + apellidos[i] + "@cartuja.com";
            listin[i][3] = "" + 111111111 * i / 2;
        }
        contador = MAX_CONTACT - 1;
    }

    public static void addContact() {
        //crear un array para los mensajes y asi poder recorrer el For y no harcodearlo
        if (contador < listin.length - 1) {
            ++contador;
            for (int i = 0; i < listin[contador].length; i++) {
                listin[contador][i] = Datos.getData(Imprimir.printGetContactMsg(i));
            }
        }
        //Si no hay espacio en la listin nos devuelve un mensaje diciendo que esta llena
        System.out.println("La agenda esta llena");
    }

    public static int findContact(String buscado) {
        for (int i = 0; i < listin.length; i++) {
            if (listin[i][0].equals(buscado)) {
                printSchedule(i);
                return i;
            }
        }
        Imprimir.printMsg("No se ha encontrado al usuario");
        return -1;
    }

    public static void showContact() {
        //Pedir dato. Buscar dato. Imprimir dato
        printSchedule(findContact(Datos.getData("Introduce el nombre de la persona a buscar")));
    }

    public static void deleteContact() {
        if (findContact(Datos.getData("¿A quien quieres eliminar?")) != -1) {
            for (int i = 0; i < 10; i++) {

            }
            System.arraycopy(listin, 1, listin, 0, listin.length - 1);
            --contador;
        }
    }

    public static void modifyContact() {

    }

    //Sobrecarga para imprimir un elemento
    public static void printSchedule(int index) {
        printDataContact(index);
    }

    //Sobrecarga para imprimir toda la lista
    public static void printSchedule() {
        for (int i = 0; i < contador; i++) {
            printDataContact(i);
        }
    }

    //Metodo para imprimir datos unicos de contacto
    public static void printDataContact(int index) {
        if (index > -1) {
            for (int i = 0; i < listin[i].length; i++) {
                System.out.println(Imprimir.printValueContactMsg(i) + listin[index][i]);
            }
        }
    }
}
