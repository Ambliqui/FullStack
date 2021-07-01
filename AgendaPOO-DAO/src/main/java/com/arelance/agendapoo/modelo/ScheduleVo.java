/** ****************************************************************************
 * Simulacion de dato persistente de base de datos
 *******************************************************************************
 */
package com.arelance.agendapoo.modelo;

public class ScheduleVo {

    private ScheduleVo scheduleDato;
        //Definimos el maximo de filas que en nuestro caso van a ser agenda
    private final int MAX_CONTACT = 5;

    /**
     * *************************************************************************
     * Definimos el maximo de columnas que en nuestro caso van a ser los datos
     * Si no definimos el tamaño de esta dimension en el array, el for del
     * método createContact da fallos puesto que al no tener tamaño definido no
     * podemos hacer un lenght. Habitualmete dejariamos el tamaño sin definir.
     * **************************************************************************
     */
    private final int MAX_DATA = 3;
//    private String[][] agenda = new String[MAX_CONTACT][MAX_DATA];
//    //Forma correcta de orientarlo a objetos. Array de instancias de la clase Contact
//    private Contact[] contactos = new Contact[MAX_CONTACT];
//    //Defimos un array de 2 dimensiones para almacenar los datos (En POO esto no tiene sentido, pero asi lo solicitan)
    private String[][] agendaDato;

    private ScheduleVo() {
    }
    
    public ScheduleVo getInstance(){
        if (scheduleDato == null) {
            scheduleDato = new ScheduleVo();
        }
        return scheduleDato;
    }

    public String[][] getAgendaDato() {
        return agendaDato;
    }

}
