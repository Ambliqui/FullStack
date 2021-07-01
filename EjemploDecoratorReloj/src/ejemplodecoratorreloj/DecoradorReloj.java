/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodecoratorreloj;

/**
 *
 * @author Ambliqui
 */
public abstract class DecoradorReloj implements Reloj {

    private final Reloj reloj;

    public DecoradorReloj(Reloj reloj) {
        this.reloj = reloj;
    }
    
    @Override
    public void agregarFuncionalidad() {
        this.reloj.agregarFuncionalidad();
    }

}
