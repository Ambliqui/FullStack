/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.commandcalculadora;

/**
 *
 * @author Ambliqui
 */
public interface Command {
    
    public abstract Float ejecutar(Float x, Float y);
}
