/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendapoo;

/**
 *
 * @author Mefisto
 */

/*************** En desarrollo *************/
public class Validator {
    //Agenda Vacia
    public boolean empySchedule(Schedule agenda){
        return agenda.getContador() != - 1;
    }
    
    //Agenda llena
    public boolean fullSchedule (Schedule agenda){
        return agenda.getContador() < agenda.getMAX_CONTACT() - 1;
    }
    
    //Numero de telefono entre maximo y minimo
    
    //No meter letras en lugar de numeros
    
    //No permitir nulos o vacios
    
    //No permitir valores duplicados
}
