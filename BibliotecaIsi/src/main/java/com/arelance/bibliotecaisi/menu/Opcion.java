/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi.menu;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.item;
        hash = 67 * hash + Objects.hashCode(this.accion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Opcion other = (Opcion) obj;
        if (this.item != other.item) {
            return false;
        }
        if (!Objects.equals(this.accion, other.accion)) {
            return false;
        }
        return true;
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
