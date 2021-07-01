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
public interface IUsuario {
    boolean alta(Usuario usuario);
    boolean baja(Usuario usuario);
    boolean login(Usuario usuario);
    boolean desconexion();
}
