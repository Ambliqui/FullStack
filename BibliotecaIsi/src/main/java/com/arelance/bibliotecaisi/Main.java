/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi;

import com.arelance.bibliotecaisi.menu.*;
import com.arelance.bibliotecaisi.menu.vista.Vista;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Mefisto
 */
public class Main {

    public static void main(String[] args) {

//        List<Opcion> opciones = new ArrayList<>();
        Set<Opcion> opciones = new LinkedHashSet<Opcion>();
        
        opciones.add(new Opcion(1, "Login", new AccionLogin()));
        opciones.add(new Opcion(2, "Alta", new AccionAlta()));
        opciones.add(new Opcion(3, "Salir", new AccionSalirBiblioteca()));

        Menu menuPrincipal = new Menu(opciones);
        
        Vista vista = new Vista();
        
        vista.imprimirMenu(opciones);
        menuPrincipal.elegirOpcion();
    }
}
