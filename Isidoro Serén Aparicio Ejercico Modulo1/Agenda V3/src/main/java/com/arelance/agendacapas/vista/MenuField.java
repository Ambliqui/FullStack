/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendacapas.vista;

import com.arelance.agendacapas.Option;
import com.arelance.agendacapas.modelo.AgendaDao;
import java.util.*;

/**
 *
 * @author Mefisto
 */
public class MenuField extends Menu {

    public MenuField() {
        opciones = new ArrayList<>();
        opciones.add(new Option(1, "Nombre"));
        opciones.add(new Option(2, "Telefono"));
        opciones.add(new Option(3, "Email"));
    }

    public MenuField(ArrayList<Option> opciones) {
        this.opciones = opciones;
    }

    public int accionMenuField() {
        return IntroDato.getNumber();
    }

    public static void main(String[] args) {

    }
}
