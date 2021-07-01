/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.commandcalculadora;

import com.arelance.commandcalculadora.command.Calculadora;
import com.arelance.commandcalculadora.command.Command;
import com.arelance.commandcalculadora.command.DivideCommand;
import com.arelance.commandcalculadora.command.MultiplicaCommand;
import com.arelance.commandcalculadora.command.RestaCommand;
import com.arelance.commandcalculadora.command.SumaCommand;

/**
 *
 * @author Mefisto
 */
public class Principal {

    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora(10, 5);

        Command suma = new SumaCommand(calculadora);
        Command resta = new RestaCommand(calculadora);
        Command multiplicacion = new MultiplicaCommand(calculadora);
        Command division = new DivideCommand(calculadora);
     
        System.out.println("\nAhora desde el Command");
        System.out.println("La suma es: " + suma.operar());
        System.out.println("La resta es: " + resta.operar());
        System.out.println("La multiplicacion es: " + multiplicacion.operar());
        System.out.println("La division es: " + division.operar());
    }
}
