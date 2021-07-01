/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestionliga;

import java.util.*;

/**
 *
 * @author Ambliqui
 */
public class Equipo {
    private String nombre;
     //la plantilla es un array de 2 jugadores
    private final int PLANTILLAMAXIMA= 2;
    private List<Jugador> plantilla = new ArrayList();
    
    public Equipo(){
        
    }
    
    private Equipo(String nombre, List<Jugador> plantilla){
        this.nombre = nombre;
        this.plantilla = plantilla;
    }
    
    public static List<Equipo> rellenarEquipo(List <Jugador> jugadores) {
        String[] nombreEquipo = {"Sevilla", "Betis", "Huelva", "Cádiz"};
        List<Equipo> equipos = new ArrayList();
        int contador = 0;
        for (String nomEquipo : nombreEquipo){
            List <Jugador> intermedio= new ArrayList();
            for (int i = 0; i < 2 ; i++) {
                intermedio.add(jugadores.get(contador += i));
                jugadores.get(contador).setEquipo(nomEquipo);
            }
            contador += 1;
            equipos.add(new Equipo(nomEquipo, intermedio));
        }
        return equipos;
    }
    
    private void crearEquipo(){
        
    }
    
//    public void fichar(Jugador[] jugadores){
//        //si la plantilla no esta llena y el jugador no esta en un equipo entonces se puede fichar
//        if (getPlantilla().size() == PLANTILLAMAXIMA){
//            System.out.println("El equipo esta completo");
//        }
//        
//    }
    
    public void liberar(){
        //Si tenemos alguien a quien despedir lo eliminamos
        
    }
    
    public void traspasar(){
        
    }
    
    //Metodo Puntuar
    
    public String getNombre() {
        return nombre;
    }
    
    public String setNombre(String nombre){
        return this.nombre = nombre;
    }
    
    public List<Jugador> getPlantilla() {
        return plantilla;
    }
}