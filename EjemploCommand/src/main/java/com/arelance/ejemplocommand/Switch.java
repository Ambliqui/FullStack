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
public class Switch {

    private Command encenderObjeto;
    private Command apagarObjeto;
    private Command standbyObjeto;

    public Switch(Command encenderObjeto, Command apagarObjeto, Command standbyObjeto) {
        this.encenderObjeto = encenderObjeto;
        this.apagarObjeto = apagarObjeto;
        this.standbyObjeto = standbyObjeto;
    }

    public void flipUp() {
        encenderObjeto.ejecutar();
    }

    public void flipDown() {
        apagarObjeto.ejecutar();
    }
    
    public void standbyObjeto(){
        standbyObjeto.ejecutar();
    }
}
