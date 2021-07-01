/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.brutalzone.beans;

import java.util.*;

/**
 *
 * @author Ambliqui
 */
public class Empleado extends Persona {

    private float salario;

    public Empleado() {
    }

    public Empleado(float salario) {
        this.salario = salario;
    }

    public Empleado(String nombre, float salario) {
        super(nombre);
        this.salario = salario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Float.floatToIntBits(this.salario);
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
        final Empleado other = (Empleado) obj;

        return super.equals(other) && (Float.floatToIntBits(this.salario) == Float.floatToIntBits(other.salario));
    }

    @Override
    public int compareTo(Persona o) {
        int redVal = super.compareTo(o);
        if (redVal == 0){
            redVal = Float.compare(salario, ((Empleado)o).salario);
        }
        return redVal;
//return super.compareTo(o);
    }

//    @Override
//    public int compareTo(Persona o) {
//        return salario.compareTo(o.salario);
//    }
    //ordenar por nombre y salario Pendiente para casa
    public static void main(String[] args) {
//        Persona persona = new Empleado();
//        Empleado empleado = new Empleado();
//        //Persona empleado2 = new Empleado();
//        System.out.println(empleado instanceof Persona);
//        Persona CAI = new Persona();
//        System.out.println(persona.getClass()== CAI.getClass());

        Empleado empleado1 = new Empleado("Antonio", 1200);
        Empleado empleado2 = new Empleado("Antonio", 1100);
        Empleado empleado3 = new Empleado ("Marcos", 1300);
        Empleado empleado4 = new Empleado ("Marcos", 1300);
        System.out.println(empleado1.compareTo(empleado2));
        System.out.println(empleado2.compareTo(empleado3));
        System.out.println(empleado3.compareTo(empleado4));
        
        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado3);
        listaEmpleados.add(empleado4);
        
        Collections.sort(listaEmpleados);
        listaEmpleados.forEach(e -> System.out.println(e.getNombre() +" "+ e.salario));
        
        
        
    }
}
