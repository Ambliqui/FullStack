/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sobrecarga;

import static com.arelance.sobrecarga.Sobrecarga.sumar;

/**
 *
 * @author Ambliqui
 */
public class Principal {
    public static void main(String[] args) {
        Sobrecarga elemento1 = new Sobrecarga();
        Sobrecarga elemento2 = new Sobrecarga(50, 80);
        long [] numerosMultiples = {30,70};
        Sobrecarga elemento3 = new Sobrecarga(numerosMultiples);
        
        System.out.println("Parametros predefinidos Clase: "
                + new Sobrecarga().getNum1()
                + " + " + new Sobrecarga().getNum2()
                + " = " + sumar(new Sobrecarga().getNum1(), new Sobrecarga().getNum2()));
        
        System.out.println("Parametros predefinidos instancia: "
                + elemento1.getNum1()
                + " + " + elemento1.getNum2()
                + " = " + sumar(elemento1.getNum1(), elemento1.getNum2()));
        
        System.out.println("Parametros argumentos instancia: "
                + elemento2.getNum1()
                + " + " + elemento2.getNum2()
                + " = " + sumar(elemento2.getNum1(), elemento2.getNum2()));
    
        System.out.println("Parametros argumento array: "
                + elemento3.getNum1()
                + " + " + elemento3.getNum2()
                + " = " + sumar(elemento3.getNum1(), elemento3.getNum2()));
    }
}
