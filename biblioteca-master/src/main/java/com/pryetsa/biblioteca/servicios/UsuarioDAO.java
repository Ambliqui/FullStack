/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pryetsa.biblioteca.servicios;

import com.pryetsa.biblioteca.beans.Libreria;
import com.pryetsa.biblioteca.beans.Usuario;

/**
 *
 * @author pryet
 */
public class UsuarioDAO implements IUsuario{
    Libreria libreria=Libreria.getInstance();
    @Override
    public boolean alta(Usuario usuario) {
        return libreria.getUsuarios().add(usuario);
    }

    @Override
    public boolean baja(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean login(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean desconexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
