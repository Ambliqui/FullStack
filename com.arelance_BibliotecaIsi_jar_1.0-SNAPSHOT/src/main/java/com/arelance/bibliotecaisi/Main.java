/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi;

import com.arelance.bibliotecaisi.menu.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mefisto
 */
public class Main {

    public static void main(String[] args) {

        
        //Serializar y guardar
        List<Opcion> opciones = new ArrayList<>();
        
        opciones.add(new Opcion(1, "Alta", new AccionAlta()));
//        opciones.add(new Opcion(2, "Baja", new AccionBaja()));
        opciones.add(new Opcion(2, "Login", new AccionLogin()));
        opciones.add(new Opcion(3, "Salir", new AccionSalirBiblioteca()));
        
        Menu menuPrincipal = new Menu(opciones);
        while(true){
        menuPrincipal.imprimirMenu();
        menuPrincipal.elegirOpcion();
        }
        
    }
}
