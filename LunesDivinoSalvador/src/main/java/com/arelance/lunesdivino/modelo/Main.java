/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.lunesdivino.modelo;

import com.arelance.lunesdivino.modelo.actions.Command;
import com.arelance.lunesdivino.modelo.actions.CommandSeleccionable;
import com.arelance.lunesdivino.modelo.views.RecogerDatosLibro;
import com.arelance.lunesdivino.modelo.views.View;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        View view=new RecogerDatosLibro();
        Command alta = new CommandSeleccionable(new OptionAdd(view));
        Command baja = new CommandSeleccionable(new OptionDelete(view));

        Command[] commans = new Command[2];
        commans[0] = alta;
        commans[1] = baja;

        System.out.println("selecciona la opcion");
        Scanner teclado = new Scanner(System.in);
        commans[teclado.nextInt()].execute();

    }

}
