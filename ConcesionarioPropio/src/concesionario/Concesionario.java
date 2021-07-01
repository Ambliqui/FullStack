/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

/**
 *
 * @author Ambliqui
 */
public class Concesionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Propietario p1 = new Propietario(new StringBuilder().append("Isidoro"),new StringBuilder().append("Seren"),40);
        Propietario p2 = p1.clone();
        Coche coche1 = new Coche("7848KMG", p1);
        Coche coche2 = coche1;
    }
}
