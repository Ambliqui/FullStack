/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pryetsa.biblioteca.servicios;

import com.pryetsa.biblioteca.beans.Usuario;

/**
 *
 * @author pryet
 */
public class UsuarioDTO {
    private final String nombre;
    private final String apellidos;

    public UsuarioDTO(Usuario usuario) {
        this.nombre = usuario.getNombre();
        this.apellidos = usuario.getApellidos();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    
}
