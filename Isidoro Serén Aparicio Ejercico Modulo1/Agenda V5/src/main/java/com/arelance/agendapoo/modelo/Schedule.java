/** ****************************************************************************
 *Esta Clase va a ser nuestro Entorno
 * Aqui decalraremos los métodos principales que nos piden en el ejercicio
 *******************************************************************************
 */
package com.arelance.agendapoo.modelo;

/**
 *
 * @author Mefisto
 */
//Esta clase será nuestro contexto
public class Schedule {

    private Schedule schedule;
    //Defimos un array de 2 dimensiones para almacenar los datos (En POO esto no tiene sentido, pero asi lo solicitan)
    private String[][] agendaDato;

    private Schedule() {
    }
    
    public Schedule getInstance(){
        if (schedule == null) {
            schedule = new Schedule();
        }
        return schedule;
    }

    /**
     * @return the agendaDato
     */
    public String[][] getAgendaDato() {
        return agendaDato;
    }

}
