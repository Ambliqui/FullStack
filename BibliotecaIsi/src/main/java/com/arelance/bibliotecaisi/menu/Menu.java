/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi.menu;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Mefisto
 */
public class Menu implements Serializable{

    private Set<Opcion> opciones;

    public Menu(Set<Opcion> opciones) {
        this.opciones = opciones;
    }
    
    public int elegirOpcion(){
        int opcion = -1;
        opcion = new Scanner(System.in).nextInt();
        for (Iterator<Opcion> iterator = opciones.iterator(); iterator.hasNext();) {
            if(iterator.next().getItem()== opcion-1){
                iterator.next().getAccion().ejecutar();
            }
        }
//        opciones.iterator().next().getAccion().ejecutar(); //.get(opcion-1).getAccion().ejecutar();
        return opcion;
    }
    
    public Set<Opcion> getOpciones() {
        return opciones;
    }
}
