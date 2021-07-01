/** *****************************************************************************
 * Con esta clase vamos a controlar los 2 menus que tenemos en la aplicación
 ***************************************************************************** */
package com.arelance.agendapoo;

/**
 *
 * @author Mefisto
 */
//Patron Command buscar y ejercitar para poder implementar
public class Menu {

    //https://javadesdecero.es/avanzado/enumerados-enum-ejemplos/
    /**
     * *************************************************************************
     * Siguiendo el ejemplo del enlace he implementado el menu por elementos
     * enumerados
     *
     * Nos da mucha mayor flexibilidad a la hora de hacer modificaciones, ya que
     * cambiado simplemente las constantes del Enum de sitio, posición o
     * insertando una nueva constante nos devolveria un nuevo menu sin tener que
     * tocar código.
     *
     * Quedaría relacionar la opcion con acciones dinamicamente en funion de los
     * ordinales del Enum para hacerlo todo dinamico
     * *************************************************************************
     */
    enum MainMenu {
        IMPRIMIR("Ver agenda"), BUSCAR("Buscar Contacto"), AÑADIR("Añadir Contacto"), MODIFICAR("Modificar Contacto"), BORRAR("Borrar Contacto"), SALIR("Salir del programa");

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

        public String getMsg() {
            return label;
        }
    }

    //Hacemos lo mismo que en el menu de principal pero para la busqueda
    enum FindMenu {
        NOMBRE("Nombre"), TELEFONO("Telefono"), EMAIL("Email");

        private final String label;

        private FindMenu(String label) {
            this.label = label;
        }

        public static void printMenu() {
            for (FindMenu value : FindMenu.values()) {
                System.out.println((value.ordinal() + 1) + ".- " + value.getLabel());
            }
        }

        public String getLabel() {
            return label;
        }
    }

    //Nos creamos un método de impresion del menú a partir de un enum
    public static void printMainMenu(Schedule agenda) {
        //Autorrellenamos el array (opcional, solo para poder hacer puebas de la mayoía de los metodos)
        agenda.autoFillSchedule();
        //Mostrmos la bienvenida
        System.out.println("Bienvenido a tu agenda personal"
                + "\n¿En que puedo ayudarte?");
        /**
         * *********************************************************************
         * Seguimos con el Menu principal, el cual será un bucle infinito con
         * los diferentes métodos que nos va a dejar realizar la Clase Schedule
         * *********************************************************************
         */
        while (true) {
            System.out.println("\nElige una opcion:");
            MainMenu.printMenu();
            int option = InOut.getData();
            switch (option) {
                /***************************************************************
                 * Esto tampoco cumple con la filosofía DRY, tiene que haber
                 * otra forma de implementar los condicionales.
                 * Los he puesto en los case y no en los metodos porque los veo
                 * mas localizables en caso de tener que realizar cambios de 
                 * cualquier tipo.
                 * 
                 * Pero soy consciente tanto de eso como del acoplamiento que
                 * tiene esta parte del código en este punto.
                 ***************************************************************
                 */
                case 1:
                    if (agenda.getContador() != -1) {
                        agenda.printSchedule();
                    } else {
                        InOut.printInfoMsg(1);//Agenda vacia
                    }
                    break;
                case 2:
                    if (agenda.getContador() != -1) {
                        agenda.printContact(agenda.findContact(printFindMenu(), InOut.getData("¿Que quieres buscar?")));
                    } else {
                        InOut.printInfoMsg(1);
                    }
                    break;
                case 3:
                    if (agenda.getContador() < agenda.getMAX_CONTACT() - 1) {
                        agenda.addContact();
                    } else {
                        InOut.printInfoMsg(0);
                    }
                    break;
                case 4:
                    if (agenda.getContador() != -1) {
                        agenda.modifyContact(agenda.findContact(printFindMenu(), InOut.getData("Escribe el dato que quieres buscar")));
                    } else {
                        InOut.printInfoMsg(1);
                    }
                    break;
                case 5:
                    if (agenda.getContador() != -1) {
                        agenda.deleteContact(agenda.findContact(printFindMenu(), InOut.getData("Escribe el dato que quieres buscar")));
                    } else {
                        InOut.printInfoMsg(1);
                    }
                    break;
                case 6:
                    System.out.println("\nGracias por usar esta aplicación");
                    System.exit(0);
            }
        }
    }

    //Submenu para la busqueda por campo. La hacemos private para poder acceder solo desde la clase
    private static int printFindMenu() {
        int option = 0;
        do {
            System.out.println("Elige el campo por en el que quieres buscar");
            FindMenu.printMenu();
            option = InOut.getData();
        } while ((option < 1) || (option > 3));
        //Devolvemos la option - 1 para obtener el indice del campo que vamos a buscar
        return option - 1;
    }
}
