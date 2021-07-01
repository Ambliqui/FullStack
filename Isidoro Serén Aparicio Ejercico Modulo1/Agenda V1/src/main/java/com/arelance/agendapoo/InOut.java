/** *****************************************************************************
 * Desde esta clase controlamos los metodos de introducción de datos e impresión
 * globales de la aplicacion
 ***************************************************************************** */
package com.arelance.agendapoo;

import java.util.*;

/**
 *
 * @author Mefisto
 */

/*
*Esta clase es la que va a contener los metodos de entrada y salida del programa
 */
public class InOut {

    /***************************************************************************
     * Sobrecargamos el metodo getData por 2 motivos:
     * Solo vamos a recoger datos numericos en los Menus (No hace falta
     * imprimir mesaje puesto que lleva su propio msg en forma de menu).
     * Ademas en este caso hay que validarlo.
     * 
     * Solo tenemos que lanzar un mensaje al usuario cuando vayamos a pedir un tipo
     * String en nuestra aplicación
     */
    
    //Metodo para obtener un numero por teclado
    public static int getData() {
        int index = 0;
        //Extrapolamos la idea del do while al try catch
        //Hasta que no se meta un numero entero el método se va a llamar a si mismo
        try {
           index = new Scanner(System.in).nextInt();            
        } catch (Exception e) {
            System.out.println("Introduce una opción válida");
            getData();
        }
        return index;
    }

    //Sobrecarga del metodo anterior. Pide un String que se muestra por pantalla
    //Y devuelve un String recogido por teclado
    public static String getData(String msg) {
        System.out.println(msg);
        return new Scanner(System.in).nextLine();
    }

    //Imprime un mensaje en pantalla de lo que va sucediendo en el programa
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
    
    //Este metodo se parece al anterior pero lo usamos para sincronizar las peticiones de datos por pantalla
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
}
