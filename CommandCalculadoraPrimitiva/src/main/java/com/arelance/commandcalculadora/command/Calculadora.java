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
public class Calculadora {

    private double x;
    private double y;

    public Calculadora(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double suma() {
        return x + y;
    }

    public double resta() {
        return x - y;
    }

    public double multiplica() {
        return x * y;
    }

    public double divide() {
        return x / y;
    }

}
