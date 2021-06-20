/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendarefinitiva;

import com.arelance.agendarefinitiva.menu.actions.ExitAction;
import com.arelance.agendarefinitiva.modelo.Contact;
import com.arelance.agendarefinitiva.menu.*;
import com.arelance.agendarefinitiva.menu.actions.*;
import java.util.List;

/**
 *
 * @author Mefisto
 */
public class Main {

    public static void main(String[] args) {
//        Action<Contact> agregar = new Action<Contact>() {
//            @Override
//            public void execute(Contact t) {
//                SingletonAgenda.INSTANCE.agenda.add(t);
//                System.out.println("He hecho el alta");
//            }
//        };
//
//        Action<Contact> eliminar = new Action<Contact>() {
//            @Override
//            public void execute(Contact t) {
//                SingletonAgenda.INSTANCE.agenda.remove(t);
//                System.out.println("Contacto borrado");
//            }
//        };
//
//        Action<Contact> modificar = new Action<Contact>() {
//            @Override
//            public void execute(Contact t) {
//                SingletonAgenda.INSTANCE.agenda.remove(t);
//                System.out.println("Contacto borrado");
//            }
//        };

//        Action<List<Contact>> imprimir = new Action<List<Contact>>() {
//            @Override
//            public void execute(List<Contacto> t) {
//                t.forEach(item -> System.out.println(item.getNombre() + " " + item.getEmal()));
//            }
//        };

        //Nos creamos el array de opciones
//        Action[] opciones = new Action[]{new AddAction(), eliminar, new PrintSchedule()};
        //Se lo pasamos al gestor
//        Gestor gestor = new Gestor(opciones);
        //Pasamos la opcion elegida y el contacto
//        gestor.executeCommand(0, Contact.create("Antonio", "666555444", "antonio@gmail.com"));
//        gestor.executeCommand(2, (Contact) SingletonAgenda.INSTANCE.agenda);
        MenuMain menuMain = new MenuMain();
        Action[] opciones
                = new Action[]{
                    new PrintSchedule(),
                    new ShowContactAction(),
                    new AddAction(),
                    new ModifyAction(),
                    new DeleteAction(),
                    new ExitAction()
                };
//        menuMain.showMenu("Esto es una prueba");
        while (true) {
            menuMain.accionMainMenu(opciones);
        }
    }
}
