/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendarefinitiva.menu.actions;

import com.arelance.agendarefinitiva.menu.Action;

/**
 *
 * @author Mefisto
 */
public class ExitAction implements Action{

    @Override
    public void execute(Object t) {
        System.out.println("Gracias por utilizar el programa");
        System.exit(0);
    }
    
}
