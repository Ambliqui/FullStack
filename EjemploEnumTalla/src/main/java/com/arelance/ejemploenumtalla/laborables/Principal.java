/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemploenumtalla.laborables;

/**
 *
 * @author Ambliqui
 */
public class Principal {
    public static void main(String[] args) throws DiaLaborableException {
        DiaLaborablesSemana.asignarFestivo(DiaLaborablesSemana.MIERCOLES, DiaLaborablesSemana.DOMINGO);
        for (DiaLaborablesSemana dia : DiaLaborablesSemana.values()) {
            System.out.println(dia + ":" + dia.isLaborable());
        }
        
    }
}
