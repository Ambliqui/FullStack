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
public class ApagarCommand implements Command {

    private ObjetoDomotico oD;

    public ApagarCommand(ObjetoDomotico oD) {
        this.oD = oD;
    }

    @Override
    public void ejecutar() {
        oD.apagado();
    }
}
