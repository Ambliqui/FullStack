/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.brutalzone.beans;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;

/**
 *
 * @author Ambliqui
 */
public class Persona implements Comparable <Persona>{
    private String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Persona o) {
        return nombre.compareTo(o.nombre);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.nombre);
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
        return true;
    }
    
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();
        
        listaPersonas.add(new Persona("Pepe"));
        listaPersonas.add(new Persona("Antonio"));
        listaPersonas.add(new Persona ("Marcos"));
        listaPersonas.add(new Persona ("Marcos"));
        
        
        Collections.sort(listaPersonas);
//        for (Persona listaPersona : listaPersonas) {
//            System.out.println(listaPersona.getNombre());
//        }
//        listaPersonas.forEach(new Consumer<Persona>() {
//            @Override
//            public void accept(Persona t) {
//                System.out.println(t.getNombre());
//            }
//        });
        
        listaPersonas.forEach((Persona t) -> System.out.println(t.getNombre()));
        
        
        int index = Collections.binarySearch(listaPersonas, new Persona("Pepe"));
        if (index >=0) {
            System.out.println("Lo encontre " + index);
            listaPersonas.get(index);
        } else {
            System.out.println("No encontrado" + index);
        }
        
        Comparator<Persona> inversor = Collections.reverseOrder();
        //Pendiente
        //Collections.reverseOrder(listaPersonas, inversor);
        
//        System.out.println(persona1.compareTo(persona3));
//        System.out.println(persona1.compareTo(persona2));
//        System.out.println(persona1.compareTo(persona1));
    }
}
