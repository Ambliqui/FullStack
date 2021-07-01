/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendacapas.modelo;

/**
 *
 * @author Mefisto
 */
public class AgendaVo {
    
//    private final static AgendaVo INSTANCE = new AgendaVo();
    private static AgendaVo agendaVo;
    //Defimos un array de 2 dimensiones para almacenar los datos (En POO esto no tiene sentido, pero asi lo solicitan)
    private String[][] agenda = new String [5][3];

    private AgendaVo() {
    }
    
    public static AgendaVo getInstance(){
        if (agendaVo == null) {
            agendaVo = new AgendaVo();
        }
        return agendaVo;
    }

    public String[][] getAgenda() {
        return agenda;
    }

    public void setAgenda(String[][] agenda) {
        this.agenda = agenda;
    }
    
}
