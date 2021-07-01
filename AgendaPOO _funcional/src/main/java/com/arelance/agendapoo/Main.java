/** *****************************************************************************
 * Vaya por deleante que este ejercicio va a estar sobrecomentado por ser el
 * primero con entrega y para que una vez entregado pueda servirles a los
 * compañeros con sus virtudes y sus defectos.
 * 
 * En el siguiente se comentará al minimo.
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
 * Así mismo trataremos distintos objetos como clases ya que 
 ****************************************************************************** */
package com.arelance.agendapoo;

/**
 *
 * @author Mefisto
 */
public class Main {

    public static void main(String[] args) {
        /**
         * *********************************************************************
         * Hacemos una clase propia para el menu, ya que es un objeto en sí.
         * Todo el código de los métodos dentro de esta clase se podrian poner
         * directamente en el Main. Pero rompería bastante el paradigma de POO a
         * mi modo de ver.
         * 
         * Le pasamos al menu principal un ejemplar de Schedule con el que
         * trabajaremos mientras se ejecute el programa, así conseguimos mucho
         * menos acoplamiento que si lo hicieramos dentro del menu (dejando
         * lugar en un futuro a sobrecargar los metodos para hacer la clase Menu
         * mas flexible). En un futuro sabemos que esto se implementará con un
         * patron Command el cual aún no hemos visto
         ***********************************************************************
         */
        Menu.printMainMenu(Schedule.getInstance());
    }
}
