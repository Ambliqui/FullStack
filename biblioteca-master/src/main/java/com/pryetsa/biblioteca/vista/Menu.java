/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pryetsa.biblioteca.vista;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pryet
 */
public class Menu {
    List<Opcion> opciones;

    public Menu(List<Opcion> opciones) {
        this.opciones = opciones;
    }
    private void imprimirMenu(){
        for (Opcion opcion : opciones) {
            System.out.println(opcion.getItemMenu()+".-"+opcion.getLabel());
        }
    }
    
    public Opcion seleccinarOpcion(){
        imprimirMenu();
        return opciones.get(new Scanner(System.in).nextInt()-1);
    }
}
