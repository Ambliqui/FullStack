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
public class Coche implements Cloneable{
    private String matricula;
    private Propietario propietario;

    public Coche() {
    }

    public Coche(String matricula, Propietario propietario) {
        this.matricula = matricula;
        this.propietario = propietario;
    }
    
    @Override
    public Coche clone() throws CloneNotSupportedException{
        Coche clonCoche = (Coche) super.clone();
        clonCoche.matricula = new String(this.matricula);
        clonCoche.propietario = this.propietario;
        return clonCoche;
    }
    
    
    
    
}
