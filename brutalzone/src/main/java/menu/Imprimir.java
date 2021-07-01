/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

/**
 *
 * @author Ambliqui
 */
public class Imprimir implements Accion{

    @Override
    public void ejecutar(String msg) {
        System.out.println(msg);
    }
    
}
