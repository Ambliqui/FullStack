/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import java.util.Objects;

/**
 *
 * @author Ambliqui
 */
public class PersonaDomicilio extends Persona {

    private StringBuilder calle;
    private int portal;
    private int piso;

    public PersonaDomicilio(StringBuilder calle, int portal, int piso, StringBuilder nombre, StringBuilder apellido, int edad) {
        super(nombre, apellido, edad);
        this.calle = calle;
        this.portal = portal;
        this.piso = piso;
    }

    @Override
    public PersonaDomicilio clone() throws CloneNotSupportedException {
        PersonaDomicilio clone = (PersonaDomicilio) super.clone();
        clone.calle = new StringBuilder(this.calle);
        return clone;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.calle);
        hash = 79 * hash + this.portal;
        hash = 79 * hash + this.piso;
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
        final PersonaDomicilio other = (PersonaDomicilio) obj;
        if (this.portal != other.portal) {
            return false;
        }
        if (this.piso != other.piso) {
            return false;
        }
        return (Objects.equals(this.calle.toString(), other.calle.toString()) && super.equals(other));
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        StringBuilder calle = new StringBuilder("Aljarafe");
        int portal = 8;
        int piso = 2;
        StringBuilder nombre = new StringBuilder("Isi");
        StringBuilder apellido = new StringBuilder("Seren");
        int edad = 40;
        PersonaDomicilio pd1 = new PersonaDomicilio(calle, portal, piso, nombre, apellido, edad);
        PersonaDomicilio pd2 = pd1.clone();
        System.out.println(pd1.equals(pd2));
        pd2.calle = new StringBuilder("CAI");
//        pd2.edad = 30;
        System.out.println(pd1.equals(pd2));
    }
}
