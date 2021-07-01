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
public class Triangulo extends Figura{

    private int base;
    private int altura;

    public Triangulo() {
    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    
    @Override
    public double area() {
        
        return (base*altura)/2;
    }
    
}
