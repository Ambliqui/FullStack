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
public class Opcion {
    private int item;
    private String label;
    private Accion accion;

    public Opcion(int item, String label, Accion accion) {
        this.item = item;
        this.label = label;
        this.accion = accion;
    }

    public int getItem() {
        return item;
    }

    public String getLabel() {
        return label;
    }

    public Accion getAccion() {
        return accion;
    }
}
