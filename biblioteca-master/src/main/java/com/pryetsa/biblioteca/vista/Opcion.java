/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pryetsa.biblioteca.vista;

import java.util.List;

/**
 *
 * @author pryet
 */
public abstract class Opcion implements IAccion{
    private final int itemMenu;
    private final String label;

    public Opcion(int itemMenu, String label) {
        this.itemMenu = itemMenu;
        this.label = label;
    }

    public int getItemMenu() {
        return itemMenu;
    }

    public String getLabel() {
        return label;
    }
    
    
}
