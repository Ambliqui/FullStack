/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.lunesdivino.modelo;

import com.arelance.lunesdivino.modelo.views.RecogerDatosLibro;
import com.arelance.lunesdivino.modelo.views.View;
import com.arelance.lunesdivino.services.CRUDRepository;

/**
 *
 * @author Admin
 */
public class Controller {
    
    private CRUDRepository cRUDRepository=new CRUDRepository();
    private View view;
    
    public boolean altaLibro(){
        view=new RecogerDatosLibro();
        Libro libro=view.getData();
        return  cRUDRepository.add(libro);
        
    }
    public static void main(String[] args) {
        Controller controller=new Controller();
        controller.altaLibro();
    }
}
