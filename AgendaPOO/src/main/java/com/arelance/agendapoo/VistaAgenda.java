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
public class VistaAgenda {

    private static final Schedule agenda = Schedule.getInstance();

    public static void rellenarAgenda() {
        if (agenda.autoFillSchedule() != null) {
            System.out.println("Agenda rellena");
        }else{
            System.out.println("La agenda esta vacia");
        }
    }

    public static void mostrarContacto() {
        String[] contacto = agenda.findContact(FindMenu.loopFindMenu(), InOut.getData("¿Que quieres buscar?"));
        if (contacto != null) {
            printContact(contacto);
        }else{
            System.out.println("El contacto no existe");    
        }
    }

    private static String[] createContact() {
        String[] contactNew = new String[agenda.getMAX_DATA()];
        for (int i = 0; i < agenda.getMAX_DATA(); i++) {
            contactNew[i] = InOut.getData("Introduce el " + InOut.printLabel(i));
        }
        return contactNew;
    }

    public static void agregarContacto() {
        agenda.addContact(createContact());
    }

    public static void modificarContacto(int index) {
        if (agenda.getContador() < 0) {
            if (agenda.modifyContact(agenda.findContact(index, InOut.getData("¿Que quieres buscar?"))) != null) {
                System.out.println("Contacto modificado");
            }
        } else {
            System.out.println("La agenda está vacia");
        }
    }

    public static void borrarContacto() {
        if (agenda.deleteContact(agenda.findContact(InOut.getData(), InOut.getData("¿Que quieres buscar?"))) != null) {
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

    public static void printSchedule(String[][] contactos) {
        if (agenda.getContador() != -1) {
            //for para el array hasta contador
            for (int i = 0; i < contactos.length; i++) {
                printContact(contactos[i]);
            }
        } else {
            InOut.printInfoMsg(1);//Agenda vacia
        }
    }
}
