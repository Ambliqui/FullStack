/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import java.util.Objects;

/**
 *
 * @author Ambliqui
 */
public class Propietario implements Cloneable{
    StringBuilder nombre;
    StringBuilder apellido;
    Integer edad;

    public Propietario() {
    }

    public Propietario(StringBuilder nombre, StringBuilder apellido, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public Propietario clone() throws CloneNotSupportedException{
        Propietario clonPropietario = (Propietario) super.clone();
        clonPropietario.nombre = new StringBuilder(this.nombre);
        clonPropietario.apellido = new StringBuilder(this.apellido);
        return clonPropietario;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.apellido);
        hash = 97 * hash + Objects.hashCode(this.edad);
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
        final Propietario other = (Propietario) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        return true;
    }
}
