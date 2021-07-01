/**
 * Este menu alternativo estaba implementado en una version previa del ejercicio
 * No lo he llegado a usar no por no saber como hacer que sea totalmente escalable
 * Aunque podría ser funcional (En el otro lo era)
 * 
 * Aprovecho la herencia para usar el metodo showMenu en las subclases
 * y los constructores por defecto de las mismas para montar en menu inicial
 * las opciones estan recogidas en un ArrayList por comodidad a la hora de
 * agregar elementos.
 * 
 * Se que tu me lo planteaste con un array normal y por algo será, como aún no
 * hemos llegado a esa parte de implementar las acciones o bien no se verlo de
 * momento lo dejo asi hasta que avancemos o resuelva mis dudas.
 * Finalmente he tenido que hacer un método para cada subclase a la hora de
 * recoger las opciones del menu y lanzar sus acciones con un switch case (eso
 * es basura)
 * 
 * Te lo paso no para que lo evalues pero por lo menos que sepas que lo he
 * intentado. Como siempre se aceptan todo tipo de quejas y sugerencias
 */
package com.arelance.agendapoo.vista.menusalternativos;

import java.util.ArrayList;

/**
 *
 * @author Mefisto
 */
public class Menu {

    protected ArrayList<Option> opciones;

    public Menu() {
    }

    public Menu(ArrayList<Option> opciones) {
        this.opciones = opciones;
    }

    public boolean showMenu(String msgInicial) {
        StringBuilder msg = new StringBuilder().append(msgInicial);
        for (int i = 0; i < getOpciones().size(); i++) {
            msg.append(getOpciones().get(i).getItem()).append(".- ").append(getOpciones().get(i).getLabel()).append(".\n");
        }
        System.out.println(msg);
        return true;
    }

    public ArrayList<Option> getOpciones() {
        return opciones;
    }

}
