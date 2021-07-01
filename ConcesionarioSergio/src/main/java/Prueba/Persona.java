/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import java.util.Objects;

/**
 *
 * @author Mefisto
 */
public class Persona implements Cloneable{
    public StringBuilder nombre;
    public StringBuilder apellido;
    public int edad;

    public Persona(StringBuilder nombre, StringBuilder apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public StringBuilder getNombre() {
        return nombre;
    }

    public StringBuilder getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + Objects.hashCode(this.apellido);
        hash = 41 * hash + this.edad;
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
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre.toString(), other.nombre.toString())) {
            return false;
        }
        return Objects.equals(this.apellido.toString(), other.apellido.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre.toString());
        sb.append(" ").append(apellido.toString());
        sb.append(", ").append(edad).append(" años.");
        return sb.toString();
    }
    
    @Override
    public Persona clone() throws CloneNotSupportedException{
        Persona copia = (Persona) super.clone();
        copia.nombre = new StringBuilder(this.nombre);
        copia.apellido= new StringBuilder(this.apellido);
        return copia;
    }
    
    /*public static void main(String[] args) throws CloneNotSupportedException {
        Persona x = new Persona(new StringBuilder("Sergio"),new StringBuilder("López"), 10);
        Persona y = x.clone();
        System.out.println(x);
        System.out.println(y);
        System.out.println(x.equals(y));
        y.apellido.append(" Casado");
        System.out.println(x);
        System.out.println(y);
        System.out.println(x.equals(y));
    }*/
}
