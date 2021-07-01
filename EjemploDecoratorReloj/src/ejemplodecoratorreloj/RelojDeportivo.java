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
public class RelojDeportivo extends DecoradorReloj {

    public RelojDeportivo(Reloj reloj) {
        super(reloj);
    }

    @Override
    public void agregarFuncionalidad() {
        super.agregarFuncionalidad();
        System.out.print(" Cositas de deportistas: ");
        this.podometro();
        this.altimetro();
    }

    private void podometro() {
        System.out.println("Tenemos un podometro");
    }

    private void altimetro() {
        System.out.println("Tenemos un altimetro");
    }

}
