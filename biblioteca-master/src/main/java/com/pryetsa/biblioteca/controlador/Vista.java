/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pryetsa.biblioteca.controlador;

import com.pryetsa.biblioteca.servicios.UsuarioDTO;
import java.util.List;

/**
 *
 * @author pryet
 */
class Vista {
    
    public void usuarioRegistrado(){
        System.out.println("Usuario añadido con exito");
    }
    public void usuarioBorrado(){
        System.out.println("Usuario eliminado con exito");
    }
    
    public void imprimirUsuarios(List<UsuarioDTO> usuarios){
        int index=0;
        for (UsuarioDTO usuario : usuarios) {
            index++;
            System.out.println(index+". "+usuario.getNombre()+" "+usuario.getApellidos());
        }
    }
}
