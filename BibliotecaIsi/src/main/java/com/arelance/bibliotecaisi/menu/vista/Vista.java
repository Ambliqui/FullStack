/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi.menu.vista;

import com.arelance.bibliotecaisi.beans.Usuario;
import java.util.Scanner;

/**
 *
 * @author Ambliqui
 */
public class Vista {

    public Usuario recogerUsuario() {
        String nombre;
        String apellido;
        String DNI;
        String password;

        System.out.println("Introdice el nombre: ");
        nombre = new Scanner(System.in).nextLine();
        System.out.println("Introdice el Apellido: ");
        apellido = new Scanner(System.in).nextLine();
        System.out.println("Introdice el DNI: ");
        DNI = new Scanner(System.in).nextLine();
        System.out.println("Introdice el password: ");
        password = new Scanner(System.in).nextLine();

        Usuario usuario = new Usuario(nombre, apellido, DNI, password);

        return usuario;
    }
}
