/** *****************************************************************************
 * Desde esta clase controlamos los metodos de introducción de datos e impresión
 * globales de la aplicacion
 ***************************************************************************** */
package com.arelance.agendarefinitiva.vista;

import com.arelance.agendarefinitiva.modelo.Contact;
import java.util.*;

/**
 *
 * @author Mefisto
 */

/*
*Esta clase es la que va a contener los metodos de entrada y salida del programa
 */
public class InOut {

    public InOut() {
    }

    /**
     * ****************************************
     * Metodos de recogidas de datos
     *****************************************/
    //Metodo para obtener un numero por teclado
    public static int getNumber() {
        return new Scanner(System.in).nextInt();
    }

    //Metodo para recoger una cadena por teclado
    public static String getData(String msg) {
        System.out.println(msg);
        return new Scanner(System.in).nextLine();
    }

    //Metodo para pedir un contacto
    public static String[] createContact(int max) {
        String[] contactNew = new String[max];
        for (int i = 0; i < max; i++) {
            contactNew[i] = InOut.getData("Introduce el " + InOut.printLabel(i));
        }
        return contactNew;
    }
    
    public static Contact createContact(){
        return Contact.create(getData("Introduce el Nombre: "), getData("Introduce el Telefono: "), getData("Introduce el Email: "));
    }

    ////////////////////////////////////////////////////////////////////////////
     /**
     * ****************************************
     * Metodos de impresiones de pantalla y/o etiquetas para pedir datos
     *****************************************/
    
    //Imprime un mensaje en pantalla de lo que va sucediendo en el programa
    public void printInfoMsg(int index) {
        //Creamos un array con los mensajes que nos va a devolver la aplicacion
        String[] infoMsg = new String[10];
        //Lo rellenamos por indice y no en las llaves de la declaración porque a mi parecer
        //Queda mas limpio y localizable
        infoMsg[0] = "\nLa agenda está llena";
        infoMsg[1] = "\nLa agenda está vacia";
        infoMsg[2] = "\nEl contacto se ha creado correctamente";
        infoMsg[3] = "\nEl contacto se ha borrado correctamente";
        infoMsg[4] = "\nEl contacto se ha modificado correctamente";
        infoMsg[5] = "\nNo se ha encontrado el contacto";
        infoMsg[6] = "\nSe ha producido un error";
        infoMsg[7] = "\nQuedan elementos en la agenda\nSolo puedes restaurar con la agenda vacía";
        infoMsg[8] = "\nAgenda borrada borrada por completo";
        infoMsg[9] = "\nRestaurada copia de seguridad";
        System.out.println(infoMsg[index]);
    }

    //Este metodo se parece al anterior pero lo usamos para sincronizar las peticiones de datos por pantalla
    //con el nombre de cada atributo 
    public static String printLabel(int index) {
        //Mismo metodo que el anterior, pero para las etiquetas que devuelven los datos en funcion de un indice
        //Ademas no me parece conveniente mezclarlos
        String[] msg = new String[3];
        msg[0] = "Nombre: ";
        msg[1] = "Telefono: ";
        msg[2] = "Email: ";
        //Devolvemos la cadena
        return msg[index];
    }
    
    ////////////////////////////////////////////////////////////////////////////
    //Impresion Contactos

    public void printContact(String[][] contacto, int index) {
        //Vamos a encadenar todo el texto con un StringBuilder
        StringBuilder msg = new StringBuilder();
        msg.append("Usuario ").append(index).append("\n");
        for (int i = 0; i < contacto[index].length; i++) {
            msg.append("\t").append(InOut.printLabel(i)).append(contacto[index][i]).append("\n");
        }
        System.out.println(msg);
    }

    public void printSchedule(String[][] agenda, int contador) {
        //for para el array hasta contador
        for (int i = 0; i <= contador; i++) {
            printContact(agenda, i);
        }
    }
}
