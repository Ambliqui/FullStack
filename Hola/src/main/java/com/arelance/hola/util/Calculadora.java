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
public class Calculadora {
    //Al declarar como private el constructor no deja hacer instancias de esta clase
    private Calculadora(){
    
}
    public static double sumar(double x, double y){
        double resultado = x + y;
    return resultado;
    }
    public static double restar(double x, double y){
        double resultado = x - y;
    return resultado;
    }
    public static double multiplicar(double x, double y){
        double resultado = x * y;
    return resultado;
    }
    public static double dividir(double x, double y){
       return x/y;
    }
}
