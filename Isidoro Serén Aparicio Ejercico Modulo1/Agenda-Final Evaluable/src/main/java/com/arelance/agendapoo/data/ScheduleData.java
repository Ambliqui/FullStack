/** ****************************************************************************
 * Dato "persistente" de la BD, nos va a guardar los arrays de datos de cada contacto
 *******************************************************************************
 */
package com.arelance.agendapoo.data;

/**
 *
 * @author Mefisto
 */
public class ScheduleData {

    private static ScheduleData scheduleData;
    //Definimos el maximo de filas que en nuestro caso van a ser el maximo de 
    //contactos que tenga la agenda
    private final int MAX_CONTACT = 5;
    //Defimos un array de 2 dimensiones que va a simular nuestro dato persistente de BD
    private String[][] agendaData = new String[MAX_CONTACT][];

    private ScheduleData() {
    }
    
    public static ScheduleData getInstance(){
        if (scheduleData == null) {
            scheduleData = new ScheduleData();
        }
        return scheduleData;
    }

    public String[][] getAgendaDato() {
        return agendaData;
    }

    public void setAgendaData(String[][] agendaData) {
        this.agendaData = agendaData;
    }

    public int getMAX_CONTACT() {
        return MAX_CONTACT;
    }
}
