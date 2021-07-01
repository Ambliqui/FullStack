/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pryetsa.biblioteca;

import com.pryetsa.biblioteca.beans.Libro;
import com.pryetsa.biblioteca.vista.Menu;
import com.pryetsa.biblioteca.vista.Opcion;
import com.pryetsa.biblioteca.vista.OpcionAlta;
import com.pryetsa.biblioteca.vista.OpcionBaja;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author pryet
 */
public class Main {

    public static void main(String[] args) {
        List<Opcion> lista=new ArrayList<>();
        lista.add(new OpcionAlta(1, "alta"));
        lista.add(new OpcionBaja(2, "Baja"));
        Menu menuPrincipal = new Menu(lista);
        Opcion o=menuPrincipal.seleccinarOpcion();
        System.out.println("com.pryetsa.biblioteca.Main.main()");
    }
}
