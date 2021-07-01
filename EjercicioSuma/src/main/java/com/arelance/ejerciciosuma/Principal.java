/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejerciciosuma;

/**
 *
 * @author Ambliqui
 */
public class Principal {
    public static void main (String[] args){
        OperacionSuma operacionSuma = new OperacionSuma();
        System.out.println(operacionSuma.sumar());
        long resultado = OperacionSuma.sumar(3, 5);
        System.out.println(resultado);
        long[] array1 = {1, 2, 12};
        int[] array2 = new int[]{4, 5, 6};
        int[] array3 = new int[3];
        System.out.println(TiposArrays.sumarArray(array1));
        Integer [][] matriz = new Integer [3][3]; 
        System.out.println(matriz[0][0]);
        
        TiposArrays.rellenarArray(matriz);
        TiposArrays.imprimirArray(matriz);
        
        //Array multidimensional
        Integer[][] datos = new Integer [3][];
        
        System.out.println("Arrays multidimensionales");
        TiposArrays.asignarBloque(datos);
        TiposArrays.imprimirArray(datos);
    }
}
