/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lunesdivino.Clonable;

/**
 *
 * @author Ambliqui
 */
public class Test {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Isi", new StringBuilder().append("Seren") , 40);
        Persona personaClone = persona1;
   
        System.out.println(persona1.equals(personaClone));
        personaClone.apellido = persona1.apellido.append("Hurtado");
        System.out.println(persona1.equals(personaClone));
    }    
}
