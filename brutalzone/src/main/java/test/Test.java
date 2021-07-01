/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Ambliqui
 */
public class Test {

    //Comparable es la ordenacion natural
    //Comparator es una ordenaciozn personalizada
    public static void main(String[] args) {

//        Boolean t = true;
//        Boolean f = false;
//        System.out.println(t.compareTo(f));
//        List<Integer> xxx;
//        Integer x = 5;
//        int y = 4;
//        System.out.println(x+y);
        String[] nombre = new String[]{"pepe", "eva", "maria", "juan", "Isidoro", "ave"};
        //Nunca se pueden instanciar clases abstractas ni interfaces
        Comparator<String> comparatorLongitud
                = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };

        Comparator<String> comparatorAlfabetico
                = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        Arrays.sort(nombre, comparatorLongitud.thenComparing(comparatorAlfabetico) );
        for (String elemento : nombre) {
            System.out.println(elemento);
        }
    }
}
