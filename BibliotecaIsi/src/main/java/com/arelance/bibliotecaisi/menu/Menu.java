/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi.menu;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mefisto
 */
public class Menu {

    private List<Opcion> opciones;

    public Menu(List<Opcion> opciones) {
        this.opciones = opciones;
    }

    public void imprimirMenu() {
        opciones.forEach(opcion -> {
            System.out.println(opciones.indexOf(opcion) +" numeral: "+ opcion.getItem() + ".-" + opcion.getLabel());
        });
    }
    
    public int elegirOpcion(){
        int opcion = -1;
        opcion = new Scanner(System.in).nextInt();
        opciones.get(opcion-1).getAccion().ejecutar();
        return opcion;
    }
    
    public List<Opcion> getOpciones() {
        return opciones;
    }

}
