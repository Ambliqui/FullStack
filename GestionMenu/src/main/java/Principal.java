
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ambliqui
 */
public class Principal {
    public static void main(String[] args) {
        Integer opcion = 0;
        Scanner teclado = null;
        opcion = teclado.nextInt();
        switch (opcion){
            case 1: altaCliente();
            case 2: modificarcliente();
            case 3: borrarCliente();
        }
    }
}
