/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.hola.util;

import java.util.Scanner;

/**
 *
 * @author Mefisto
 */
public class Operaciones {
    public static double operar(double x, double y){
        Scanner operacion = new Scanner(System.in);
        int operador = 0;
        System.out.println("INTRODUCE UNA OPERACION");
        System.out.println("1-. Para sumar");
        System.out.println("2-. Para restar");
        System.out.println("3-. Para multiplicar");
        System.out.println("4-. Para dividir");
        operador = operacion.nextInt();
        switch (operador) {
            case 1:
                return Calculadora.sumar(x, y);
            case 2:
                return Calculadora.restar(x, y);
            case 3:
                return Calculadora.multiplicar(x, y);
            case 4:
                return Calculadora.dividir(x, y);
            default:
                System.out.println("Operacion no valida");
                break;
        }
        return 0;
    }
    public static String mensajear(boolean test){
        return (test) ? "Soy mayor que 100" : "Soy menor que 100";
    }
}
