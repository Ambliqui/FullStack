/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendacapas.vista;

/**
 *
 * @author Mefisto
 */
public class Print {

    public static void printInfoMsg(int index) {
        //Creamos un array con los mensajes que nos va a devolver la aplicacion
        String[] infoMsg = new String[6];
        //Lo rellenamos por indice y no en las llaves de la declaración porque a mi parecer
        //Queda mas limpio y localizable
        infoMsg[0] = "\nLa agenda está llena";
        infoMsg[1] = "\nLa agenda está vacia";
        infoMsg[2] = "\nEl contacto se ha creado correctamente";
        infoMsg[3] = "\nEl contacto se ha borrado correctamente";
        infoMsg[4] = "\nEl contacto se ha modificado correctamente";
        infoMsg[5] = "\nNo se ha encontrado el contacto";
        System.out.println(infoMsg[index]);
    }

    public static String printLabel(int index) {
        //Mismo metodo que el anterior, pero para las etiquetas que devuelven los datos en funcion de un indice
        //No lo puedo sobrecargar porque reciben el mismo numero de parametros y del mismo tipo
        //Ademas no me parece conveniente mezclarlos
        String[] msg = new String[3];
        msg[0] = "Nombre: ";
        msg[1] = "Telefono: ";
        msg[2] = "Email: ";
        //Devolvemos la cadena
        return msg[index];
    }

    public static void printContact(String[] contacto) {
        //Comprobamos que el elemento existe
        StringBuilder imprimir = new StringBuilder().append("Usuario ");
        System.out.println(imprimir);
        for (int i = 0; i < contacto.length; i++) {
            imprimir = new StringBuilder().append("\t").append(printLabel(i)).append(contacto[i]);
            System.out.println(imprimir);
        }
    }

    public static void printSchedule(String[][] contacto) {
        //for para el array hasta contador
        for (String[] item : contacto) {
            printContact(item);
        }
    }
}
