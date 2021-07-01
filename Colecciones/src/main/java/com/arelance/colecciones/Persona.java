/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.colecciones;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.TreeSet;

/**
 *
 * @author Ambliqui
 */
public final class Persona implements Comparable<Persona> {

    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + Objects.hashCode(this.apellido);
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
        return true;
    }

    @Override
    public int compareTo(Persona p) {
        int retValue;
        retValue = nombre.compareTo(p.nombre);
        if (retValue == 0) {
            retValue = apellido.compareTo(p.apellido);
        }
        return retValue;
    }

    public static void pruebaIterador(Iterator<Persona> lista, Persona persona) {
        while (lista.hasNext()){
            Persona next = lista.next();
            if(next.equals(persona)){
                lista.remove();
                return;
            }
        }
    }

    public static void main(String[] args) {
        Collection<Persona> personas = new TreeSet<>();
       LinkedHashMap lista = new LinkedHashMap();
        personas.add(new Persona("Isi", "Serén"));
        personas.add(new Persona("Salvador", "Gutierrez"));
        personas.add(new Persona("Pepe", "Botella"));
        personas.add(new Persona("Ana", "Torroja"));
        personas.add(new Persona("Manolo", "Garcia"));
        personas.add(new Persona("Pepe", "Tercio"));

        pruebaIterador(personas.iterator(), new Persona("Ana", "Torroja"));
        
        personas.forEach(persona -> {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        });
    }
}
