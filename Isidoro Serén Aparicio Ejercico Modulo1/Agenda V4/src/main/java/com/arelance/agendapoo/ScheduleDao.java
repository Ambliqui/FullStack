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
public class ScheduleDao {

    private static final Schedule agenda = Schedule.getInstance();

    public static void rellenarAgenda() {
        if (agenda.autoFillSchedule() != null) {
            System.out.println("Cargada copia de seguridad...\n");
        } else {
            System.out.println("La agenda esta vacia");
        }
    }

    public static void mostrarContacto() {
        if (agenda.getContador() >= 0) {
            String[] contacto = agenda.findContact(FindMenu.loopFindMenu(), InOut.getData("¿Que quieres buscar?"));
            if (contacto != null) {
                printContact(contacto);
            } else {
                System.out.println("El contacto no existe");
            }
        } else {
            System.out.println("La agenda esta vacía");
        }
    }

    public static String[] createContact() {
        String[] contactNew = new String[agenda.getMAX_DATA()];
        for (int i = 0; i < agenda.getMAX_DATA(); i++) {
            contactNew[i] = InOut.getData("Introduce el " + InOut.printLabel(i));
        }
        return contactNew;
    }

    public static void agregarContacto() {
        if (agenda.getContador() < agenda.getMAX_CONTACT()) {
            if (agenda.addContact(createContact()) != null) {
                System.out.println("");
            }

        } else {
            System.out.println("La agenda esta llena");
        }

    }

    public static void modificarContacto() {
        if (agenda.getContador() > -1) {
            String[] contacto = agenda.findContact(FindMenu.loopFindMenu(), InOut.getData("¿Que quieres buscar?"));
            if (agenda.modifyContact(contacto) != null) {
                System.out.println("Contacto modificado");
            } else {
                System.out.println("Error al crear contacto");
            }
        } else {
            System.out.println("La agenda está vacia");
        }
    }

    public static void borrarContacto() {
        if (agenda.getContador() >= 0) {
            String[] contacto = agenda.findContact(FindMenu.loopFindMenu(), InOut.getData("¿Que quieres buscar?"));
            if (agenda.deleteContact(agenda.findContact(FindMenu.loopFindMenu(), InOut.getData("¿Que quieres buscar?"))) != null) {
                System.out.println("Contacto borrado");
            }
        }

    

    public static void printContact(String[] contacto) {
        //Comprobamos que el elemento existe
        if (contacto != null) {
            StringBuilder imprimir = new StringBuilder().append("Usuario ");
            System.out.println(imprimir);
            for (int i = 0; i < contacto.length; i++) {
                imprimir = new StringBuilder().append("\t").append(InOut.printLabel(i)).append(contacto[i]);
                System.out.println(imprimir);
            }

            /**
             * *********************************
             * Imprimir desde el listinPoo Comentado por razones obvias
             * **********************************
             */
//        System.out.println("\n\tNombre: " + contactosPoo[index].getName());
//        System.out.println("\tTelefono: " + contactosPoo[index].getPhone());
//        System.out.println("\tEmail: " + contactosPoo[index].getEmail());
        } else {
            System.out.println("El contacto no existe");
        }
    }

    public static void printSchedule(String[][] contacto) {
        if (agenda.getContador() != -1) {
            //for para el array hasta contador
            for (String[] item : contacto) {
                printContact(item);
            }
        } else {
            InOut.printInfoMsg(1);//Agenda vacia
        }
    }
}
