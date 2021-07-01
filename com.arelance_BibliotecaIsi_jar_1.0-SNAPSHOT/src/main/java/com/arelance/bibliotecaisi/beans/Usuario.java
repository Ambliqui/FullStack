/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi.beans;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Ambliqui
 */
public class Usuario implements Serializable{

    private static final long serialVersionUID = 1L;
    private String nombre;
    private String apellido;
    
    //Separar
    private String DNI;
    private String password;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String DNI, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.DNI);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.DNI, other.DNI)) {
            return false;
        }
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //quitar password despues de las pruebas
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", password=" + password + '}';
    }
}
