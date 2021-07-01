/**
 * Enumerado para solicitar imprimir menu principal y mandar al main
 */
package com.arelance.agendapoo.vista;

import com.arelance.agendapoo.controlador.Controlador;

/**
 *
 * @author Mefisto
 */
public enum MenuMain {

    //Creamos una clase abstracta con los objetos de los Enum
    //Aqui conseguimos asociar cada atributo position del Enum con una accion en concreto
    //Con una clase interna abstracta
    IMPRIMIR(1, "Ver agenda") {
        @Override
        public void runTasker() {
            Controlador.imprimirAgenda();
        }
    }, BUSCAR(2, "Buscar Contacto") {
        @Override
        public void runTasker() {
            Controlador.mostrarContacto(FindMenu.loopFindMenu(), InOut.getData("¿Que quieres buscar?"));
        }
    }, AÑADIR(3, "Añadir Contacto") {
        @Override
        public void runTasker() {
            //Revisar parametro, preguntar a Salvador si sería correcto llamar a createContac desde el Controlador
            //Si fuera correcto lo haría desde alli y el parametro lo cogería desde el DAO, ademas nos ahorrariamos
            //Introducir todos los datos antes de comprobar si la agenda está llena, me parecería mas lógico.
            Controlador.agregarContacto(InOut.createContact(3));
        }
    }, MODIFICAR(4, "Modificar Contacto") {
        @Override
        public void runTasker() {
            Controlador.modificarContacto(FindMenu.loopFindMenu(), InOut.getData("¿A quien quieres modificar?"), InOut.createContact(3));
        }
    }, BORRAR(5, "Borrar Contacto") {
        @Override
        public void runTasker() {
            Controlador.borrarContacto(FindMenu.loopFindMenu(), InOut.getData("¿Que qiueres buscar?"));
        }
    }, BORRARAGENDA(6, "Borrar Agenda") {
        @Override
        public void runTasker() {
            Controlador.borrarAgenda();
        }
    }, RESTAURAR(7, "Restaurar copia de seguridad") {
        @Override
        public void runTasker() {
            Controlador.rellenarAgenda();
        }
    }, SALIR(8, "Salir del programa") {
        @Override
        public void runTasker() {
            System.out.println("\nGracias por usar esta aplicación");
            System.exit(0);
        }
    };

    public abstract void runTasker();

    //Atributo de cada elemento del Enum
    private final int position;
    private final String label;

    //Constructor del Enum
    private MenuMain(int position, String label) {
        this.position = position;
        this.label = label;
    }

    /**
     ***********************************************************************
     * Método del Enum para Imprimir el atributo de cada elemento del menu No
     * cumple con el DRY (tengo un metodo que hace lo misno en el siguiente
     * Enum) Como todavía no hemos visto Enum en clase, queda pendiente de
     * rehacer O bien aborarlo desde otro punto de vista.
     * 
     * Tambien está abordadado por herencia en el paquete menusalternativos
     * *********************************************************************
     */
    public static void printMenu() {
        for (MenuMain value : MenuMain.values()) {
            System.out.println((value.getPosition()) + ".- " + value.getLabel());
        }
    }

    //Metodo de impresión y recogida de opciones para este menu
    public static void loopMainMenu() {
        while (true) {
            int option = 0;
            //Nos aseguramos que el usuario escoje una opcion dentro de las permitidas para no tener errores
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
            //Ejecutamos el metodo abstracto del elemento encontrado
            MenuMain.operaciones(option).runTasker();
        }
    }

    public static MenuMain operaciones(int option) {
        //Recorremos los elementos del Enum hasta encontar una coincidencia con lo que ha introducido el usuario por teclado
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
