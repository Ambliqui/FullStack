/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestionliga;

import com.arelance.gestionliga.util.*;
import java.util.*;

/**
 *
 * @author Ambliqui
 */
public class Principal {
    public static void main(String[] args) {
        //Creamos los jugadores
        System.out.println("Creamos los jugadores:");
        List<Jugador> jugadores = Liga.getInstance().getJugadores();
        Imprimir.imprimirJugadores(jugadores);
        
        //Creamos los equipos
        System.out.println("\nCreamos los equipos:");
        List<Equipo> equipos = Equipo.getInstance().getEquipo();
        Imprimir.imprimirEquipos(equipos);

        System.out.println("\nJugadores asignados:");
        Imprimir.imprimirJugadores(jugadores);
        
        System.out.println("\nPrueba de instancia Modificada");
        jugadores = Liga.getInstance().getJugadores();
        Imprimir.imprimirJugadores(jugadores);
    }
    

}
