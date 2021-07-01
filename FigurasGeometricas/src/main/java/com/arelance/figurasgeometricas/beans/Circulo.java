/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.figurasgeometricas.beans;

/**
 *
 * @author Ambliqui
 */
public class Circulo extends Figura {

    double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    

    @Override
    public double area() {

        return Math.PI * Math.pow(radio, 2);
    }

}
