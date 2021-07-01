/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.calculadoraexception;

/**
 *
 * @author Ambliqui
 */

/**
 * 
 * @author Ambliqui
 */


public class Calculadora {
/**
 * 
 * @param dividendo
 * @param divisor
 * @return
 * @throws ArithmeticException 
 */
    public double dividir(double dividendo, double divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException();
        }
        double resultado;
        resultado = dividendo / divisor;
        return resultado;
    }

    public static void main(String[] args) {
        try {
            Calculadora calculadora = new Calculadora();
            System.out.println(calculadora.dividir(7, 0));
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("No puedes dividir por 0");
        }

    }
}
