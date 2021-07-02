/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi.menu;

import com.arelance.bibliotecaisi.beans.Usuario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mefisto
 */
public class AccionAlta implements Accion {

    private Usuario usuario;

    public AccionAlta() {
    }
    
    public AccionAlta(Usuario usuario) {
        this.usuario = usuario;
    }
    
    @Override
    public void ejecutar(){
        System.out.println("Alta de usuario");
    }
}
