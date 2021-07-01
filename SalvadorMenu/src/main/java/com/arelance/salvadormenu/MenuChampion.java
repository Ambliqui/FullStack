/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.salvadormenu;

/**
 *
 * @author Mefisto
 */

public class MenuChampion {
    private Option[] itemsMenu;

    public MenuChampion() {
    }

    public MenuChampion(Option[] itemMenu) {
        this.itemsMenu = itemMenu;
    }

    public void showMenu(){
        for (Option itemMenu1 : itemsMenu) {
            //relacion indice : valor
            System.out.println(itemMenu1.getIndice() + ".- " + itemMenu1.getMsg());
        }
    }
    
    public static void main(String[] args) {
        Option[] opciones = new Option[2];
        opciones[0]= new Option(1, "Alta Contacto");
        opciones[1]= new Option(2, "Mostrar agenda");
        
        MenuChampion menu = new MenuChampion(opciones);
        menu.showMenu();
    }
}
