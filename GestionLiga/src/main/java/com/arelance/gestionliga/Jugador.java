/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestionliga;
/*
 * @author Ambliqui
 */
public class Jugador {
    private final String nombre;
    private Integer dorsal;
    //private String posicion; enumeraciones;
    private String equipo;
    
    public Jugador(String nombre, Integer dorsal){
        this.nombre = nombre;
        this.dorsal = dorsal;
//        this.equipo = equipo;
    }

    //Crear un jugador CRUD;
    private void crearJugador(){
        //jugadores.add(e)
    }
    
    private void eliminarJugador(){
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

}