/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lunesdivino.Clonable;

import java.util.Objects;

/**
 *
 * @author Ambliqui
 */
public class Persona implements Cloneable{
    //Final
    String  nombre;
    //No Final
    StringBuilder apellido;
    //Final
    Integer edad;

    public Persona() {
    }

    public Persona(String nombre, StringBuilder apellido, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    protected Persona clone() throws CloneNotSupportedException {
        Persona clonPersona1 = (Persona) super.clone();
        clonPersona1.apellido = new StringBuilder(this.apellido);
        return clonPersona1;
//        return super.clone();//To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public StringBuilder getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
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
        final Persona other = (Persona) obj;
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
