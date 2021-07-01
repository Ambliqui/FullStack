/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.agendatelefonica;



/**
 *
 * @author lenovo
 */
public class Contacto {
    private String nombre;
    private String email;
    private String tlf;
    

    public Contacto(String nombre, String email, String tlf) {
        this.nombre =nombre;
        this.email = email;
        this.tlf = tlf;
         
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }
    


   
    
  
}
