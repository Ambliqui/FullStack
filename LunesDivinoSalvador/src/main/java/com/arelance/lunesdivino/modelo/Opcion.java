/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.lunesdivino.modelo;

import com.arelance.lunesdivino.modelo.views.View;

/**
 *
 * @author Admin
 */
public abstract  class Opcion implements Seleccionable{
    protected View view;
    protected Libro libro;

    public Opcion(View view) {
        this.view = view;
    }
    

    @Override
    public void ejecutarOPcion() {
        libro=view.getData();
        
       
    }
    
}
