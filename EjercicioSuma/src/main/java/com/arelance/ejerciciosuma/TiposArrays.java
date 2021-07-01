/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejerciciosuma;

import java.util.*;
import static java.lang.System.out;

//import java.util.List;

/**
 *
 * @author Ambliqui
 */
public class TiposArrays {
    public static void main (String[] args){
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = new Integer[]{4, 5, 6};
        Integer[] array3 = new Integer[3];
        List list1 = Arrays.asList(array1);
        //List list1 = new int[0];
        out.println(list1.get(0));
    }
    public static long sumarArray (long [] numeros){
        long resultado = 0;
        for (long num : numeros) { 
            resultado += num;
        }
        
//        for (int i = 0; i<numeros.length; i++) {
//            resultado = resultado + numeros[i];
//        }
        return resultado;
    }
    
    public static void rellenarArray (Integer [][] matriz){
        Integer contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]= contador += 1;
            }
        }
    }

    public static void rellenarArrayPares(Integer [][] matriz){
        Integer contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]= contador += 2;
            }
        }       
    }
    
    public static void imprimirArray (Integer [][] matriz){
        System.out.println("Imprimo el array");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
    
    public static void asignarBloque (Integer[][] datos){
        Integer cont=0;
        for (int i = 0; i < datos.length; i++) {
            Integer [] array = {cont += 2,cont += 2,cont += 2};
            datos[i] = array;
        }
    }
}