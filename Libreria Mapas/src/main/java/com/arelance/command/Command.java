/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.command;

import com.arelance.beans.Usuario;

/**
 *
 * @author Mefisto
 */
public interface Command {
    void ejecutar(Usuario usuario);
}
