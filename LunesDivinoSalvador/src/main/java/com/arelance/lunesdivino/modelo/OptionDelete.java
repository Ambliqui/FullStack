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
public class OptionDelete extends Opcion  {

    public OptionDelete(View view) {
        super(view);
    }

    @Override
    public void ejecutarOPcion() {
      libro=super.view.getData();
      System.out.println("estoy haciendo la baja" +libro.getTitulo());
    }

}
