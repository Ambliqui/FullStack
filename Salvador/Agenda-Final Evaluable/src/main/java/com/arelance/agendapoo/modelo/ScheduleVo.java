/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendapoo.modelo;

/**
 *
 * @author Mefisto
 */
//XXX Esta clase  sobra solo se usa para el MAX_Data el array no se usa nunca
public class ScheduleVo {

    /**
     * *************************************************************************
     * Definimos el maximo de columnas que en nuestro caso van a ser los datos
     * Si no definimos el tamaño de esta dimension en el array, el for del
     * método createContact o de autofill da fallos puesto que al no tener tamaño
     * definido no podemos hacer un lenght. Habitualmete dejariamos el tamaño sin definir.
     * **************************************************************************
     */
    private final int MAX_DATA = 3;
    //Defimos un array de longitud 3 que representan los datos de cada contacto
    private String[] contacto = new String[MAX_DATA];

    public ScheduleVo() {
    }

    public int getMAX_DATA() {
        return MAX_DATA;
    }
}
