/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemplocommand;

/**
 *
 * @author Ambliqui
 */
public class Valvula implements Cambiador{

    public Valvula(){
    }
    
    @Override
    public void encender() {
        System.out.println("Objeto encendido");
    }
    
    @Override
    public void apagar() {
        System.out.println("Objeto apagado");
    }
    
    @Override
    public void standby(){
        System.out.println("Objeto en StandBy");
    }






}