/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.holamundo.util;

import java.util.Scanner;

/**
 *
 * @author Ambliqui
 */
public class FlujosBucles {

    public static void main(String[] args) {
//        System.out.println("Tabla de la verdad:");
//        System.out.println(true && true);
//        System.out.println(true && false);
//        System.out.println(true || false);
//        System.out.println(false || false);

//        //If else
//        System.out.println("IF ELSE");
//        if (5>6) {
//            System.out.println("Soy la primera");
//        } else {
//            System.out.println("Soy la segunda");
//        }
        
        int x = obtenerNumero("Dame la x:");
        int y = obtenerNumero("Dame la y:");
    }
    private static int obtenerNumero(String msg){
        Scanner teclado = new Scanner(System.in);
        System.out.println(msg);
        return teclado.nextInt();
    }
}
