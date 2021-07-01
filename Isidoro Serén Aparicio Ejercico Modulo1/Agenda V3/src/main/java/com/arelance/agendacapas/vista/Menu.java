/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendacapas.vista;

import com.arelance.agendacapas.Option;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mefisto
 */
public class Menu {

    protected ArrayList<Option> opciones;

    public Menu() {
    }

    public Menu(ArrayList<Option> opciones) {
        this.opciones = opciones;
    }

    public boolean showMenu(String msgInicial) {
        StringBuilder msg = new StringBuilder().append(msgInicial);
        for (int i = 0; i < getOpciones().size(); i++) {
            msg.append(getOpciones().get(i).getItem()).append(".- ").append(getOpciones().get(i).getLabel()).append(".\n");
        }
        System.out.println(msg);
        return true;
    }

    public ArrayList<Option> getOpciones() {
        return opciones;
    }

}
