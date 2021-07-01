/**
 * Submenu de campo de busqueda
 */
package com.arelance.agendapoo.vista;

/**
 *
 * @author Mefisto
 */
public enum FindMenu {
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
