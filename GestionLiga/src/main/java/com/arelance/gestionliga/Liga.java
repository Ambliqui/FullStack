/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestionliga;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ambliqui
 */
public class Liga {     
    //Patron Singleton
    private static Liga liga;
    private final int MAXIMO = 8;
    private final List<Jugador> jugadores = new ArrayList<>();
    
    //El constructor vacio me rellena los jugadores
    private Liga(){
        rellenarJugadores();
    }
    
    public static Liga getInstance(){
        if (liga == null){
            liga = new Liga();
        }
        return liga;
    }
    
    private void rellenarJugadores(){
        String[] nombres = {"Antonio", "Marcos", "Pedro", "Ruben", "Isi", "Agustin", "Jorgue", "Gabriel"};
        for (int i = 0; i<MAXIMO ; i++) {
            jugadores.add(new Jugador(nombres[i], (int) Math.floor(Math.random()*22+1))); 
        }
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }
}