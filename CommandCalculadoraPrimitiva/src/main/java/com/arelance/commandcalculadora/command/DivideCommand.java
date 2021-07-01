/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.commandcalculadora.command;

/**
 *
 * @author Mefisto
 */
public class DivideCommand implements Command{
    private final Calculadora calculadora;

    public DivideCommand(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    @Override
    public double operar() {
        return calculadora.divide();
    }
}
