/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.hola.util;

/**
 *
 * @author Mefisto
 */
public class Validadores {

    private Validadores() {
    
    }
    public static double numeroMayor(double x, double y){
        System.out.println("El número mayor es:");
        return Math.max(x, y);
    }
    public static boolean superiorCien(double x){
        return x > 100;
    }
}
