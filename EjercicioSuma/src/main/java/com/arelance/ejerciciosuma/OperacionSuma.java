/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejerciciosuma;

/**
 *
 * @author Ambliqui
 */
public class OperacionSuma {
    private int x;
    private int y;
    
    public long sumar(){
        return x+y;
    }
    public static long sumar(int x, int y){
        return x+y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
