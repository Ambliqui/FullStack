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
enum MenuMain {

    IMPRIMIR(1, "Ver agenda") {
        @Override
        public void runTasker() {
            ScheduleDao.printSchedule(Schedule.getInstance().getContactos());
            //Schedule.getInstance().printSchedule();
        }
    }, BUSCAR(2, "Buscar Contacto") {
        @Override
        public void runTasker() {
            ScheduleDao.mostrarContacto();
            //Schedule.getInstance().printContact(Schedule.getInstance().findContact(FindMenu.loopFindMenu(), InOut.getData("¿Que quieres buscar?")));
        }
    }, AÑADIR(3, "Añadir Contacto") {
        @Override
        public void runTasker() {
            ScheduleDao.agregarContacto();
        }
    }, MODIFICAR(4, "Modificar Contacto") {
        @Override
        public void runTasker() {
            ScheduleDao.modificarContacto();
        }
    }, BORRAR(5, "Borrar Contacto") {
        @Override
        public void runTasker() {
            ScheduleDao.borrarContacto();
            //Schedule.getInstance().deleteContact(Schedule.getInstance().findContact(FindMenu.loopFindMenu(), InOut.getData("Escribe el dato que quieres buscar")));
        }
    }, SALIR(6, "Salir del programa") {
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
     * Enum) porque no se como pasarle oomo parametro al metodo un Enum
     * concreto.
     *
     * Como todavía no hemos visto Enum en clase, queda pendiente de rehacer
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

enum FindMenu {
    NOMBRE(1, "Nombre"), TELEFONO(2, "Telefono"), EMAIL(3, "Email");

    private final int position;
    private final String label;

    private FindMenu(int position, String label) {
        this.position = position;
        this.label = label;
    }

    public static void printFindMenu() {

        for (FindMenu value : FindMenu.values()) {
            System.out.println((value.getPosition()) + ".- " + value.getLabel());
        }
    }

    public static int loopFindMenu() {
        int option = 0;
        while (option < 1 || option > FindMenu.values().length) {
            System.out.println("Elige el campo por en el que quieres buscar");
            FindMenu.printFindMenu();
            try {
                option = InOut.getNumber();
            } catch (Exception e) {
                System.out.println("\nIntroduce el número de la opcion deseada\n");
                //Si introdujeramos una cadena, option devolveria 0, seguimos dentro del bucle
            }
        }
        //Devolvemos la option - 1 para obtener el indice del campo que vamos a buscar
        return option -1;
    }

    public int getPosition() {
        return position;
    }

    public String getLabel() {
        return label;
    }
}
