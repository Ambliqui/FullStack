/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi.menu;

/**
 *
 * @author Mefisto
 */
public class AccionSalirBiblioteca extends Accion{
    
    @Override
    public void ejecutar(){
        System.out.println("Gracias por usar nuestra biblioteca");
        System.exit(0);
    }
}
