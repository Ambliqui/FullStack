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
public class ComparatorSalario implements Comparator<Empleado>{

    @Override
    public int compare(Empleado o1, Empleado o2) {
        return Float.compare(o1.getSalario(), o2.getSalario());
    }
}
