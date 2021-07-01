/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparator;

import java.util.Comparator;

/**
 *
 * @author Mefisto
 */
public class ComparatorFecha implements Comparator<Persona>{

    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getFecha().compareTo(o2.getFecha());
    }
}
