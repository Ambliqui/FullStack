/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi.menu.vista;

import com.arelance.bibliotecaisi.beans.Credenciales;
import com.arelance.bibliotecaisi.beans.DatosPersonales;
import com.arelance.bibliotecaisi.beans.Libro;
import com.arelance.bibliotecaisi.beans.Usuario;
import com.arelance.bibliotecaisi.menu.Opcion;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Ambliqui
 */
public class Vista {

    public Usuario recogerUsuario() {
        String nombre;
        String apellido;
        String nick;
        String password;

        System.out.println("Introdice el nombre: ");
        nombre = new Scanner(System.in).nextLine();
        System.out.println("Introdice el Apellido: ");
        apellido = new Scanner(System.in).nextLine();
        System.out.println("Introdice el Nick: ");
        nick = new Scanner(System.in).nextLine();
        System.out.println("Introdice el password: ");
        password = new Scanner(System.in).nextLine();

        Usuario usuario = new Usuario(new Credenciales(nick, password), new DatosPersonales(nombre, apellido));

        return usuario;
    }

    public Libro recogerLibro() {

        String titulo;
        String ISBN;

        System.out.println("Introdice el titulo: ");
        titulo = new Scanner(System.in).nextLine();
        System.out.println("Introdice el ISBN: ");
        ISBN = new Scanner(System.in).nextLine();
        Libro libro = new Libro(titulo, ISBN);
        return libro;
    }

    public void imprimirMenu(Set<Opcion> opciones) {
        opciones.forEach(opcion -> {
            System.out.println(opcion.getItem() + ".-" + opcion.getLabel());
        });
    }
}
