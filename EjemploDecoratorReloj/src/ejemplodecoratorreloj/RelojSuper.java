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
public class RelojSuper extends RelojDeportivo{
        public RelojSuper(Reloj reloj) {
        super(reloj);
    }

    @Override
    public void agregarFuncionalidad() {
        super.agregarFuncionalidad();
        System.out.print(" Cositas de deportistas: ");
        this.NFC();
        this.pantallaPanoramica();
    }

    private void NFC() {
        System.out.println("Tenemos un podometro");
    }

    private void pantallaPanoramica() {
        System.out.println("Tenemos un altimetro");
    }
}
