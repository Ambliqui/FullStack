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
public class RelojEstandar implements Reloj {

    @Override
    public void agregarFuncionalidad() {
        System.out.println(" Basic Watch with: ");
        this.addTimer();
    }

    private void addTimer() {
        System.out.print("Soy un reloj Resines");
    }
}
