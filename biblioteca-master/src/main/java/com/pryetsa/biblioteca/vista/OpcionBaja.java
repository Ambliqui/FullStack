/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pryetsa.biblioteca.vista;

import com.pryetsa.biblioteca.controlador.ControladorUsuarios;

/**
 *
 * @author pryet
 */
public class OpcionBaja extends Opcion implements IAccion{
    private ControladorUsuarios cu;

    public OpcionBaja(int itemMenu, String label) {
        super(itemMenu, label);
        cu=new ControladorUsuarios();
    }
    
    @Override
    public void ejecutar() {
        //metodo del controlador para seleccionar el usuario a borrar
    }
}
