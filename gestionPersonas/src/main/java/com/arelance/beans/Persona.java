/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.beans;

/**
 *
 * @author Ambliqui
 */
public class Persona {
    //Propiedades (estan)
    private String nombre;
    private String apellidos;

    public Persona (String nombre, String apellidos){
        this.nombre = nombre;//null
        this.apellidos = apellidos;//null
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String intNombre){
        this.nombre = intNombre;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public void setApellidos(String intApellidos){
        this.apellidos = intApellidos;
    }    
}
