/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.hola;

import com.arelance.hola.util.Calculadora;
import com.arelance.hola.util.Operaciones;
import com.arelance.hola.util.Validadores;
import java.util.Scanner;

/**
 *
 * @author Mefisto
 */
public class Hola {
    public static void main (String[] args){
        double x = getNumber("Dame un numero");
        double y = getNumber("Dame un segundo numero");
        System.out.println(Validadores.numeroMayor(x, y));
        System.out.println(Operaciones.mensajear(Validadores.superiorCien(Calculadora.sumar(x, y))));
        System.out.println(Operaciones.operar(x, y));
    }
    public static double getNumber(String msg){
        Scanner teclado = new Scanner(System.in);
        System.out.println(msg);
        return teclado.nextDouble();
    }
}
