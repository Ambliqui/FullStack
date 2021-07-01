/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemploenumtalla;

import java.time.Month;

/**
 *
 * @author Ambliqui
 */
public class Main {

    public static void main(String[] args) {
        Talla talla = Talla.MEDIUM;
        switch (talla) {
            case SMALL:
                System.out.println("Soy la talla pequeña");
                break;
            case MEDIUM:
                System.out.println("Soy la talla mediana");
                break;
            case LARGE:
                System.out.println("Soy la talla Grande");
                break;
            case XLARGE:
                System.out.println("Soy la talla extra grande");
                break;
        }
    }
}
