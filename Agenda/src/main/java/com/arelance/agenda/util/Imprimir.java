/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agenda.util;

/**
 *
 * @author Mefisto
 */
public class Imprimir {
    public static void printWelcome (){
            System.out.println("Bienvenido a nuestro servicio de agenda IsisTation"
                    + "\n¿En que puedo ayudarle?\n");
    }
    
    public static void printBye(){
        System.out.println("Gracias por usar nuestra agenda");
    }
    
    public static void printMsg(String msg){
        System.out.println(msg);
    }
    
    public static String printGetContactMsg(int index){
        //Declaramos las cadenas de peticiones de datos
        String[] msg = new String[5];
        //Las podriamos inicializar arriba entre llaves pero elemento a elemento lo veo mas claro
        msg[0] = "Introduce el Nombre";
        msg[1] = "Introduce el Apellido";
        msg[2] = "Introduce el Telefono";
        msg[3] = "Introduce el Email";
        //Devolvemos la cadena
        return msg[index];
    }
    
        public static String printValueContactMsg(int index){
        //Declaramos las cadenas de peticiones de datos
        String[] msg = new String[5];
        //Las podriamos inicializar arriba entre llaves pero elemento a elemento lo veo mas claro
        msg[0] = "Nombre: ";
        msg[1] = "\tApellido: ";
        msg[2] = "\tTelefono: ";
        msg[3] = "\tEmail: \t";
        //Devolvemos la cadena
        return msg[index];
    }
}
