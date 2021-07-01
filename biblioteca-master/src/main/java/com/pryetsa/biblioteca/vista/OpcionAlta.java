/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pryetsa.biblioteca.vista;

import com.pryetsa.biblioteca.beans.Usuario;

/**
 *
 * @author pryet
 */
public class OpcionAlta implements IAccion{

    private Usuario usuario;
    private ControladorLogin cl;
    public boolean alta(Controladorlogin cl){
        this.cl=cl;
    }
    @Override
    public void ejecutar() {
        cl.altaUsuario(usuario);
    }
    
}
