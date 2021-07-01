/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendapoo.servicio;

import com.arelance.agendapoo.modelo.ScheduleDao;

/**
 *
 * @author Mefisto
 */

/*************** En desarrollo *************/
public class Verification {

    public Verification() {
    }
    
    //Agenda Vacia
    public boolean empySchedule(ScheduleDao agenda){
        //Lógica positiva
        return agenda.getContador() == - 1;
    }
    
    //Agenda llena
    public boolean fullSchedule (ScheduleDao agenda){
        //Lógica negativa
        return agenda.getContador() < agenda.getAgenda().length - 1;
    }
    
    //Numero de telefono entre maximo y minimo
    
    //No permitir nulos o vacios
    
    //No permitir valores duplicados
}
