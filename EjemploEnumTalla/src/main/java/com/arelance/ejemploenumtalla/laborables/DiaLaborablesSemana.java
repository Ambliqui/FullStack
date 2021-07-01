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
public enum DiaLaborablesSemana {
    LUNES(true), MARTES(true), MIERCOLES(true), JUEVES(true), VIERNES(true), SABADO(false), DOMINGO(false);

    private boolean laborable;

    private DiaLaborablesSemana(boolean laborable) {
        this.laborable = laborable;
    }

    public boolean isLaborable() {
        return laborable;
    }

//    public DiaLaborablesSemana asignarFestivo(DiaLaborablesSemana dia) {
//
//        laborable = false;
//        
//        for (DiaLaborablesSemana diaSemana : DiaLaborablesSemana.values()) {
//            if (this.laborable ) {
//                
//            }
//        }
//        return dia;
//    }
    public static boolean asignarFestivo(DiaLaborablesSemana laboral, DiaLaborablesSemana feriado) throws DiaLaborableException {
        boolean cambiado;

        if (laboral.laborable && !feriado.isLaborable() && laboral.equals(feriado)) {
            
            System.out.println("Se pueden intercambiar");
            laboral.laborable = false;
            feriado.laborable = true;
            cambiado = true;
        } else {
            cambiado = false;
        }
        return cambiado;
    }
}