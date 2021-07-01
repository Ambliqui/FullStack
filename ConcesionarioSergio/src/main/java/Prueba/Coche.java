/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import java.util.Objects;

/**
 *
 * @author Sergio
 */
public final class Coche implements Cloneable {

    private final String matricula;
    private Persona propietario;

    public Coche(String matricula, Persona propietario) {
        this.matricula = matricula;
        this.propietario = propietario;
    }

    public String getMatricula() {
        return matricula;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.matricula);
        hash = 29 * hash + Objects.hashCode(this.propietario);
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
        final Coche other = (Coche) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return Objects.equals(this.propietario, other.propietario);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(matricula).append(", Propietario: ").append(propietario.toString());
        return sb.toString();
    }

    @Override
    public Coche clone() throws CloneNotSupportedException {
        Coche copia = (Coche) super.clone();
        copia.propietario = this.propietario.clone();
        return copia;
    }

    /*public static void main(String[] args) throws CloneNotSupportedException {
        Coche x = new Coche("9999 GGG", new Persona(new StringBuilder("Sergio"), new StringBuilder("López"), 99));
        Coche y = x.clone();
        y.getPropietario().getApellido().append(" Casado");
        System.out.println(x.getPropietario());
        System.out.println(y.getPropietario());
    }*/
    public static void main(String[] args) throws CloneNotSupportedException {
        StringBuilder calle = new StringBuilder().append("Aljarafe");
        int portal = 8;
        int piso = 2;
        StringBuilder nombre = new StringBuilder().append("Isi");
        StringBuilder apellido = new StringBuilder().append("Seren");
        int edad = 40;
        PersonaDomicilio pd1 = new PersonaDomicilio(calle, portal, piso, nombre, apellido, edad);
        PersonaDomicilio pd2 = pd1.clone();
        System.out.println(pd1.equals(pd2));
        pd2.edad = 30;
        System.out.println(pd1.equals(pd2));
    }
}
