/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 *
 * @author Mefisto
 */
public class Empleado extends Persona {

    private float salario;

    public Empleado(float salario) {
        this.salario = salario;
    }

    public Empleado(String nombre, LocalDate fecha, float salario) {
        super(nombre, fecha);
        this.salario = salario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Float.floatToIntBits(this.salario);
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
        if (Float.floatToIntBits(this.salario) != Float.floatToIntBits(other.salario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Empleado " + super.toString() + " salario= " + salario;
        //return "Empleado{" + "salario=" + salario + '}';
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        List<Empleado> lista = new ArrayList<>();

        Empleado empleado1 = new Empleado("Antonio", LocalDate.parse("01-01-1993", formato), 1400);
        Empleado empleado2 = new Empleado("Marcos", LocalDate.parse("01-01-1978", formato), 1000);
        Empleado empleado3 = new Empleado("Pedro", LocalDate.parse("01-01-1997", formato), 1400);
        Empleado empleado4 = new Empleado("Ruben", LocalDate.parse("01-01-1997", formato), 1300);
        Empleado empleado5 = new Empleado("Isi", LocalDate.parse("17-10-1980", formato), 1200);

        lista.add(empleado1);
        lista.add(empleado2);
        lista.add(empleado3);
        lista.add(empleado4);
        lista.add(empleado5);

        System.out.println("\nLista original:\n");
        lista.forEach(System.out::println);

        lista.sort(new ComparatorSalario());
        System.out.println("\nOrdenado por salario:\n");
        lista.forEach(System.out::println);

        lista.sort(new ComparatorFecha().thenComparing(empleado5));
        System.out.println("\nOrdenado por fecha y salario:\n");
        lista.forEach(System.out::println);
    }
}
