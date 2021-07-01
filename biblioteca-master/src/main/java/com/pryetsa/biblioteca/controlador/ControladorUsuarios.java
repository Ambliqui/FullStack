/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pryetsa.biblioteca.controlador;

import com.pryetsa.biblioteca.beans.Libreria;
import com.pryetsa.biblioteca.beans.Usuario;
import com.pryetsa.biblioteca.servicios.UsuarioDAO;

/**
 *
 * @author pryet
 */
public class ControladorUsuarios{
    private Libreria libreria=Libreria.getInstance();
    private UsuarioDAO uDAO;
    private Vista vista;
    public void altaUsuario(Usuario usuario){
        if(uDAO.alta(usuario))
        {
            vista.usuarioRegistrado();
            //mensaje usuario registrado
        }else{
           //usuario repetido, no añadido
        }
    }
    
    public void bajaUsuario(Usuario usuario){
        
        if(uDAO.baja(usuario))
        {
            vista.usuarioBorrado();
            //mensaje usuario borrado
        }else{
           //usuario repetido, no borrado
        }
    }
    
    public Usuario seleccionUsuario(){
        vista.imprimirUsuarios();
    }
}
