/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ambliqui
 */
import com.arelance.holamundo.util.Calculadora;

public class Saludo {
    public static void main (String[] args){
        System.out.println("Esta es mi calculadora: ");
        System.out.println("Suma : " + Calculadora.sumar(3,2));
        System.out.println("Resta : " + Calculadora.restar(3,2));
        System.out.println("Multiplicación: " + Calculadora.multiplicar(3,2));
        System.out.println("División: " + Calculadora.dividir(3,2));
    }   
}