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
public class AccionAlta extends Accion {

    private Usuario usuario;

    public AccionAlta() {
    }
    
    public AccionAlta(Usuario usuario) {
        this.usuario = usuario;
    }
    
    @Override
    public void ejecutar() {
        FileOutputStream fileOut = null;
        FileInputStream fileIn = null;
        try {
            System.out.println("Doy el alta");
            fileOut = new FileOutputStream("biblioteca.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fileOut);    
            FileInputStream fis = new FileInputStream("biblioteca.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            fileIn = new FileInputStream("biblioteca.bin");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionAlta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionAlta.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileOut.close();
                fileIn.close();
            } catch (IOException ex) {
                Logger.getLogger(AccionAlta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
