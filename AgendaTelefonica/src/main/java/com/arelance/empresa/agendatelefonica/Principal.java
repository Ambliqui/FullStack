/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.agendatelefonica;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Principal {
        public static void main(String[] args) {
            Agenda agenda= new Agenda();
            agenda.llenarAgenda( crearContacto(rellenarDato("Introducir nombre"),rellenarDato("Introducir el email"),rellenarDato("Introducir el telefono")));
            //Contacto contacto=agenda.getContacto(0);
            
    }
        //Metodo rellenardatos
        public static String rellenarDato(String msg){
            System.out.println(msg);
            return new Scanner(System.in).nextLine();
        }
    
          public static Contacto crearContacto(String nombre,String email,String telefono){
            return new Contacto(nombre,email,telefono);
            
        }
}
