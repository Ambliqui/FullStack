/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestionliga.util;
import com.arelance.gestionliga.*;
import java.util.*;

/**
 *
 * @author Mefisto
 */
public class Imprimir {
    public static void imprimirJugadores (List<Jugador> jugadores){
        for (int i = 0; i <jugadores.size(); i++) {
            System.out.println("Nombre :" + jugadores.get(i).getNombre()
                    + " Dorsal: " + jugadores.get(i).getDorsal()
                    + " Equipo: " + jugadores.get(i).getEquipo());
        }
    }
    public static void imprimirEquipos (List<Equipo> equipos){
        for (int i = 0; i <equipos.size(); i++) {
            System.out.println("Nombre: " + equipos.get(i).getNombre());
            System.out.println("Alineacion: ");
            for (int j = 0; j < equipos.get(i).getPlantilla().size() ; j++) {
                System.out.println(equipos.get(i).getPlantilla().get(j).getNombre() );
            }
        }
    }
}
