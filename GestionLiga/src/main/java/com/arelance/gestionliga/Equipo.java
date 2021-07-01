/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestionliga;

import java.util.*;

/*
 * @author Ambliqui
 */
public class Equipo {
    private static Equipo equipo;
    private String nombre;
     //la plantilla es un array de 2 jugadores
    private final int PLANTILLAMAXIMA= 2;
    private List<Jugador> plantilla = new ArrayList();
    private List<Equipo> arrayEquipos = new ArrayList<>();
    
    private Equipo(){
        rellenarEquipo();
    }
    
    private Equipo(String nombre, List<Jugador> plantilla){
        this.nombre = nombre;
        this.plantilla = plantilla;
    }
    
    public static Equipo getInstance(){
        if (equipo == null){
            equipo = new Equipo();
        }
        return equipo;
    }
    
    private void rellenarEquipo() {
        String[] nombreEquipo = {"Sevilla", "Betis", "Huelva", "Cádiz"};
        //Cojo el array de jugadores
        List<Jugador> jugadores = Liga.getInstance().getJugadores();
        //Creo una instancia de equipo
        arrayEquipos = new ArrayList();
        int contador = 0;
        for (String elemento : nombreEquipo){
            List <Jugador> intermedio= new ArrayList();
            for (int i = 0; i < PLANTILLAMAXIMA ; i++) {
                intermedio.add(jugadores.get(contador += i));
                jugadores.get(contador).setEquipo(elemento);
            }
            contador += 1;
            arrayEquipos.add(new Equipo(elemento, intermedio));
        }
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
    
    public List<Equipo> getEquipo(){
        return arrayEquipos;
    }
}