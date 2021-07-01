/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendacapas.vista;

import java.util.Scanner;

/**
 *
 * @author Mefisto
 */
public class IntroDato {
    
    public static int getNumber() {
        int numeroOpcion = -1;
        try {
            numeroOpcion = new Scanner(System.in).nextInt();
        } catch (Exception e) {
            System.out.println("Elige una opción correcta");
            return -1;
        }
        return numeroOpcion;
    }
    
    public static String getData(String msg){
        System.out.println(msg);
        return new Scanner(System.in).nextLine();
    }
}
