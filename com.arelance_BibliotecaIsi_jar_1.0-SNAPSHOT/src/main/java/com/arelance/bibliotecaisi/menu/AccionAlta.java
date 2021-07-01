/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi.menu;

import com.arelance.bibliotecaisi.beans.Usuario;
import com.arelance.bibliotecaisi.menu.vista.Vista;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mefisto
 */
public class AccionAlta extends Accion {

    @Override
    public void ejecutar() {
        /*  
        Habria que llamar al controlador.alta
        el controlador comprueba que no exista y si no existe
        llama al usuarioDao y el usuarioDao.alta guarda
         */
        FileOutputStream fileOut = null;
        FileInputStream fileIn = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        try {
            System.out.println("Doy el alta");
            fileOut = new FileOutputStream("biblioteca.bin");
            oos = new ObjectOutputStream(fileOut);
            FileInputStream fis = new FileInputStream("biblioteca.bin");
            ois = new ObjectInputStream(fis);
            // fileIn = new FileInputStream("biblioteca.bin");

            List<Usuario> datos = new ArrayList<>();
           oos.writeObject(new Usuario("Pepe", "perez", "123", "000"));
            //datos.addAll((List) ois.readObject());
            Usuario usuario;
            
//            Object aux = ois.readObject();
//            while (aux != null) {
//    
//                usuario = (Usuario) aux;
//                datos.add(usuario);
//                aux = ois.readObject();
//            }
            //aqui habria que comparar si el usuario que hemos recogido 
            //esta en los datos del archivo
            Vista vista = new Vista();
            Usuario nuevoUsuario = vista.recogerUsuario();
            if (!datos.contains(nuevoUsuario)) {
                //datos.add(nuevoUsuario);
                //lo guardamos
                oos.writeObject(nuevoUsuario);
            }
            System.out.println(datos);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionAlta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionAlta.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
                ois.close();
                fileOut.close();
                fileIn.close();
            } catch (IOException ex) {
                Logger.getLogger(AccionAlta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
