/**
 *****************************************************************************
 * Vaya por deleante que este ejercicio va a estar sobrecomentado por ser el
 * primero con entrega.
 *
 * En el siguiente se comentará lo estrctamente necesario.
 *
 * En este ejercicio, vamos a poner en practica lo que ya vamos sabiendo de POO
 * Es por esto que vamos a dar 2 soluciones al mismo problema dentro del mismo
 * ejercicio y no tener que entregar 2 distintos.
 *
 * Puesto que se nos pide especificamente que trabajemos sobre un array de
 * 2 dimensiones, será contra quien trabajaremos en todos los metodos.
 *
 * A su vez, vamos a ir sincronizandolo con un array de objetos de la clase Contact
 * Lo voy a hacer para demostrar unicamente que se puede resolver tambien con un
 * array de una unica dimensión a efectos practicos (Por favor no se considere
 * esta implementación como DRY, simplemente es a efectos demostrativos.)
 * 
 * Mi idea es enfocarlo desde el punto de vista de una base de datos
 * Voy a implementar los siguientes patrones en la aplicación:
 * DAO-VO
 * Singleton
 * MVC
 * O al menos intentarlo
 *******************************************************************************
 */
package com.arelance.agendapoo;

import com.arelance.agendapoo.controlador.Controlador;

/**
 *
 * @author Mefisto
 */
public class Main {

    public static void main(String[] args) {
        /**
         * *********************************************************************
         * Llamamos a nuestro método iniciar definido en el controlador para
         * arrancar el programa.
         *
         * Tambien esta integrada la parte de hacerlo por herencia y con el
         * objeto Option, No la dejo funcional para no interferir en el programa.
         * Lo he intentado al menos, pero sigue si ser totalmente dinamico
         * **********************************************************************
         */
        
        Controlador.iniciar();
    }
}
