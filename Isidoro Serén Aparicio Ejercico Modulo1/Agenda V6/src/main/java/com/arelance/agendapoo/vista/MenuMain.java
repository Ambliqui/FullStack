/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendapoo.vista;

import com.arelance.agendapoo.controlador.Controlador;
import com.arelance.agendapoo.modelo.ScheduleDao;

/**
 *
 * @author Mefisto
 */
public enum MenuMain {

    IMPRIMIR(1, "Ver agenda") {
        @Override
        public void runTasker() {
            Controlador.imprimirAgenda();
//ScheduleDao.getInstance().printSchedule();
        }
    }, BUSCAR(2, "Buscar Contacto") {
        @Override
        public void runTasker() {
            Controlador.mostrarContacto(FindMenu.loopFindMenu(), InOut.getData("¿Que quieres buscar?"));
            //ScheduleDao.getInstance().printContact(ScheduleDao.getInstance().findContact(FindMenu.loopFindMenu(), InOut.getData("¿Que quieres buscar?")));
        }
    }, AÑADIR(3, "Añadir Contacto") {
        @Override
        public void runTasker() {
            //Revisar parametro
            Controlador.agregarContacto(InOut.createContact(3));
            //ScheduleDao.getInstance().addContact();
        }
    }, MODIFICAR(4, "Modificar Contacto") {
        @Override
        public void runTasker() {
            Controlador.modificarContacto(FindMenu.loopFindMenu(), InOut.getData("¿A quien quieres modificar?"), InOut.createContact(3));
            //ScheduleDao.getInstance().modifyContact(ScheduleDao.getInstance().findContact(FindMenu.loopFindMenu(), InOut.getData("Escribe el dato que quieres buscar")));
        }
    }, BORRAR(5, "Borrar Contacto") {
        @Override
        public void runTasker() {
            Controlador.borrarContacto(FindMenu.loopFindMenu(), InOut.getData("¿Que qiueres buscar?"));
            //ScheduleDao.getInstance().deleteContact(ScheduleDao.getInstance().findContact(FindMenu.loopFindMenu(), InOut.getData("Escribe el dato que quieres buscar")));
        }
    }, BORRARAGENDA(6, "Borrar Agenda") {
        @Override
        public void runTasker() {
            Controlador.borrarAgenda();
            //ScheduleDao.getInstance().deleteSchedule();
        }
    }, RESTAURAR(7, "Restaurar copia de seguridad") {
        @Override
        public void runTasker() {
            Controlador.rellenarAgenda();
            //ScheduleDao.getInstance().autoFillSchedule();
        }
    }, SALIR(8, "Salir del programa") {
        @Override
        public void runTasker() {
            System.out.println("\nGracias por usar esta aplicación");
            System.exit(0);
        }
    };

    public abstract void runTasker();

    //Atributo de cada elemento
    private final int position;
    private final String label;

    //Constructor del Enum
    private MenuMain(int position, String label) {
        this.position = position;
        this.label = label;
    }

    /**
     ***********************************************************************
     * Método del Enum par Imprimir el atributo de cada elemento del menu No
     * cumple con el DRY (tengo un metodo que hace lo misno en el siguiente
     * Enum) Como todavía no hemos visto Enum en clase, queda pendiente de
     * rehacer O bien aborarlo desde otro punto de vista
     * *********************************************************************
     */
    public static void printMenu() {
        for (MenuMain value : MenuMain.values()) {
            System.out.println((value.getPosition()) + ".- " + value.getLabel());
        }
    }

    public static void loopMainMenu() {
        while (true) {
            int option = 0;
            while (option < 1 || option > MenuMain.values().length) {
                System.out.println("\nElige una opcion:");
                MenuMain.printMenu();
                try {
                    option = InOut.getNumber();
                } catch (Exception e) {
                    System.out.println("\nIntroduce el número de la opcion deseada");
                    //option se pone a 0 despues del error, por lo cual nos seguimos manteniendo en el bucle
                }
            }
            MenuMain.operaciones(option).runTasker();
        }
    }

    public static MenuMain operaciones(int option) {
        for (MenuMain elemento : MenuMain.values()) {
            if (elemento.getPosition() == option) {
                return elemento;
            }
        }
        return null;
    }

    public int getPosition() {
        return position;
    }

    String getLabel() {
        return this.label;
    }
}
