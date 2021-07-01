/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agenda;

import com.arelance.agenda.datos.*;
import com.arelance.agenda.util.*;

/**
 *
 * @author Mefisto
 */
public class Principal{
    public static void main(String[] args){
        Agenda.fillSchedule();
        Imprimir.printWelcome();
        Menu.showMenu();
        //Menu.printMenu();
        //Menu.accionMenu();
        //Menu.accionMenu();
        //Agenda.addContact();
        //Agenda.printSchedule();
    }
}
