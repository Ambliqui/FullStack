/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sobrecarga;

/**
 *
 * @author Mefisto
 */
public class Sobrecarga {
    private double num1 = 1;
    private double num2 = 2;
    
    public Sobrecarga (){
        
    }
    public Sobrecarga (double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public Sobrecarga (long [] array){
        this.num1 = array[0];
        this.num2 = array[1];
    }
    
    public double getNum1() {
        return num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum2() {
        return num2;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public static double sumar(double x, double y){
        return x+y;
    }
}

