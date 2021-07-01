/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendapoo;

/**
 *
 * @author Mefisto
 */
enum MainMenu {
    IMPRIMIR("Ver agenda") {
        @Override
        public void runTasker(Schedule agenda) {
            if (agenda.getContador() != -1) {
                agenda.printSchedule();
            } else {
                InOut.printInfoMsg(1);//Agenda vacia
            }
        }
    }, BUSCAR("Buscar Contacto") {
        @Override
        public void runTasker(Schedule agenda) {
            if (agenda.getContador() != -1) {
                agenda.printContact(agenda.findContact(FindMenu2.printMenu(), InOut.getData("¿Que quieres buscar?")));
            } else {
                InOut.printInfoMsg(1);
            }
        }
    }, AÑADIR("Añadir Contacto") {
        @Override
        public void runTasker(Schedule agenda) {
            if (agenda.getContador() < agenda.getMAX_CONTACT()) {
                agenda.addContact();
            } else {
                InOut.printInfoMsg(0);
            }
        }
    }, MODIFICAR("Modificar Contacto") {
        @Override
        public void runTasker(Schedule agenda) {
            if (agenda.getContador() != -1) {
                agenda.modifyContact(agenda.findContact(FindMenu2.printMenu(), InOut.getData("Escribe el dato que quieres buscar")));
            } else {
                InOut.printInfoMsg(1);
            }
        }
    }, BORRAR("Borrar Contacto") {
        @Override
        public void runTasker(Schedule agenda) {
            if (agenda.getContador() != -1) {
                agenda.deleteContact(agenda.findContact(FindMenu2.printMenu(), InOut.getData("Escribe el dato que quieres buscar")));
            } else {
                InOut.printInfoMsg(1);
            }
        }
    }, SALIR("Salir del programa") {
        @Override
        public void runTasker(Schedule agenda) {
            System.out.println("\nGracias por usar esta aplicación");
            System.exit(0);
        }
    };

    public abstract void runTasker(Schedule agenda);

    //Atributo de cada elemento
    private final String label;

    //Constructor del Enum
    private MainMenu(String label) {
        this.label = label;
    }

    /**
     ***********************************************************************
     * Método del Enum par Imprimir el atributo de cada elemento del menu No
     * cumple con el DRY (tengo un metodo que hace lo misno en el siguiente
     * Enum) porque no se como pasarle oomo parametro al metodo un Enum
     * concreto.
     *
     * Como todavía no hemos visto Enum en clase, queda pendiente de rehacer
     * *********************************************************************
     */
    public static void printMenu() {
        for (MainMenu value : MainMenu.values()) {
            System.out.println((value.ordinal() + 1) + ".- " + value.getMsg());
        }
    }

    public static MainMenu operaciones(int option) {
        for (MainMenu elemento : MainMenu.values()) {
            if (elemento.ordinal() == option) {
                return elemento;
            }
        }
        return null;
    }

    public String getMsg() {
        return label;
    }
}

public enum FindMenu2 {
    NOMBRE("Nombre"), TELEFONO("Telefono"), EMAIL("Email");

    private final String label;

    private FindMenu2(String label) {
        this.label = label;
    }

    public static int printMenu() {
        int option = 0;
        do {
            System.out.println("Elige el campo por en el que quieres buscar");
            for (FindMenu2 value : FindMenu2.values()) {
                System.out.println((value.ordinal() + 1) + ".- " + value.getLabel());
            }
            option = InOut.getData();
        } while ((option < 1) || (option > 3));
        //Devolvemos la option - 1 para obtener el indice del campo que vamos a buscar
        return option - 1;
    }

    public String getLabel() {
        return label;
    }
}
