/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestionciudad;

import java.util.ArrayList;

/**
 *
 * @author Ambliqui
 */
public class Controller {

    private final int MAXIMO = 4;
    private String[] ciudades = new String[MAXIMO];
    private int contador = -1;

    public boolean add(String ciudad) {
        //ArrayList<String> nombreArrayList = new ArrayList<>();
        if (contador < ciudades.length - 1) {
            ciudades[++contador] = ciudad;
            return true;
        }
        return false;
    }

    public boolean delete(Integer index) {
        //index-lenght -1
        return true;
    }

    public static void main(String[] args) {
        copiarArrayBidimensional();
    }

    public static void copiarArray() {
        Integer[] source = {1, 2, 3};
        Integer[] dest = {4, 5, 6, 7};
        System.arraycopy(source, 1, dest, 1, 2);
        System.arraycopy(source, 1, dest, dest.length - 2, 2);
    }

    public static void copiarMitad() {
        Integer[] source = {1, 2, 3, 4};
        Integer[] dest = {5, 6, 7, 8, 9, 10, 11, 12};
        System.arraycopy(source, 0, dest, dest.length / 2, source.length);
    }

    public static void copiarArrayBidimensional() {
        String[][] source = new String[3][];
        source[0] = new String[]{"Isi", "1234"};
        source[1] = new String[]{"Salv Solo", "4567"};
        source[2] = new String[]{"Antonio", "abcd"};
        String[][] dest = new String[source.length][];
        System.arraycopy(source, 0, dest, 0, source.length);
    }
}
