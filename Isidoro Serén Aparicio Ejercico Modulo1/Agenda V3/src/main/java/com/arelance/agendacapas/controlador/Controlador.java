/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendacapas.controlador;

import com.arelance.agendacapas.modelo.AgendaDao;
import com.arelance.agendacapas.modelo.AgendaVo;
import com.arelance.agendacapas.vista.*;

/**
 *
 * @author Mefisto
 */
public class Controlador {

    private AgendaVo agendaVo = AgendaVo.getInstance();
    private AgendaDao agendaDao = AgendaDao.getInstance();
    private MenuMain mainMenu = new MenuMain();

    public Controlador() {
    }
    
    public void iniciar() {
        agendaDao.autoFillSchedule();
        while (true) {
            mainMenu.accionMainMenu();
        }
    }

}
