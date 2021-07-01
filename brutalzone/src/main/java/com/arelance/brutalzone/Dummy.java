/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.brutalzone;

/**
 *
 * @author Ambliqui
 */
public class Dummy {

    public static void main(String[] args) {
        Contexto a = Contexto.getInstance();
        Contexto b = Contexto.getInstance();
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(b.equals(a));
        Object prueba = new Object();
        System.out.println("\nPruebas Object\n");
        System.out.println(a == prueba);
        System.out.println(a.equals(prueba));
        System.out.println(prueba.equals(a));
        //De variable se comprueba contra una clase
        System.out.println(prueba instanceof Object);
    }
}
