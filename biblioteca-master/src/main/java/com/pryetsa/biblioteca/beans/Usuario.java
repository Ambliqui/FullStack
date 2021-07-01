/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pryetsa.biblioteca.beans;

import java.util.Objects;

/**
 *
 * @author pryet
 */
public final class Usuario implements Comparable<Usuario>{
    private final String nombre;
    private final String apellidos;
    private final String password;

    public Usuario(String nombre, String apellidos, String password) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public int hashCode() {
        int hash = 3;//admite usuarios con pass repetido
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.apellidos);
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
        }//admite usuarios con pass repetido
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.apellidos, other.apellidos);
    }

    @Override
    public String toString() {
        return "\nUsuario{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", password=" + password + '}';
    }

    @Override
    public int compareTo(Usuario o) {
        int resultado;
        if(nombre.compareToIgnoreCase(o.nombre)==0){
            resultado=apellidos.compareToIgnoreCase(o.apellidos);
        }else{
            resultado=nombre.compareToIgnoreCase(o.nombre);
        }
        return resultado;
    }
    
    
}
