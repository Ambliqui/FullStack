/** ****************************************************************************
 *Esta Clase va a ser nuestro Entorno
 * Aqui decalraremos los métodos principales que nos piden en el ejercicio
 *******************************************************************************
 */
package com.arelance.agendapoo.data;

/**
 *
 * @author Mefisto
 */
//Esta clase será nuestro contexto
public class ScheduleData {

    private ScheduleData schedule;
    
    //Defimos un array de 2 dimensiones para almacenar los datos (En POO esto no tiene sentido, pero asi lo solicitan)
    private String[][] agendaData;

    private ScheduleData() {
    }
    
    public ScheduleData getInstance(){
        if (schedule == null) {
            schedule = new ScheduleData();
        }
        return schedule;
    }

    public String[][] getAgendaDato() {
        return agendaData;
    }

}
