/** ****************************************************************************
 *Esta Clase va a ser nuestro Entorno
 * Aqui decalraremos los métodos principales que nos piden en el ejercicio
 *******************************************************************************
 */
package com.arelance.agendapoo;

/**
 *
 * @author Mefisto
 */
//Esta clase será nuestro contexto
public class Schedule {

    //Propiedad necesaria para el patron Singleton, es la única instancia sobre la que vamos a trabajar
    private static Schedule schedule;
    //Definimos el maximo de filas que en nuestro caso van a ser contactos
    private final int MAX_CONTACT = 5;

    /**
     * *************************************************************************
     * Definimos el maximo de columnas que en nuestro caso van a ser los datos
     * Si no definimos el tamaño de esta dimension en el array, el for del
     * método createContact da fallos puesto que al no tener tamaño definido no
     * podemos hacer un lenght. Habitualmete dejariamos el tamaño sin definir.
     * **************************************************************************
     */
    private final int MAX_DATA = 3;
    //Constante para indice de la propiedad nombre
    private static final int NOMBRE = 0;
    //Constante para indice de la propiedad email
    private static final int TELEFONO = 1;
    //Constante para indice de la propiedad nombre
    private static final int EMAIL = 2;
    //Definmos un contador para saber en que posicion nos encontramos
    private Integer contador = -1;
    //Defimos un array de 2 dimensiones para almacenar los datos (En POO esto no tiene sentido, pero asi lo solicitan)
    private String[][] contactos;
    //Forma correcta de orientarlo a objetos. Array de instancias de la clase Contact
    private Contact[] contactosPoo;

    //Definimos un único constructor como privado para poder hacer el patron Singleton
    private Schedule() {
        //El constructor nos devuelve nos inicializa el tamaño de los array con
        //el maximo definido anteriormente como constantes
        contactos = new String[MAX_CONTACT][MAX_DATA];
        contactosPoo = new Contact[MAX_CONTACT];
    }

    //De esta es la unica manera de pedirle una instancia a la clase
    public static Schedule getInstance() {
        //Si la instacia no existe la crea, sino nos devuelve la que ya existe
        if (schedule == null) {
            schedule = new Schedule();
        }
        return schedule;
    }

    //Metodo para autorrelenar el array para hacer pruebas
    public String[][] autoFillSchedule() {
        String[] fillName = {"Antonio", "Marcos", "Pedro", "Ruben", "Isi"};
        for (int i = 0; i < contactos.length; i++) {
            //El dato del telefono devuelve un numero de móvil en el rango de los que se pueden utilizar en España actualmente
            //String.valueOf nos convierte el entero a String
            contactosPoo[i] = new Contact(fillName[i], fillName[i] + "@cartuja.com", String.valueOf((int) (Math.random() * (749999999 + 1 - 600000000)) + 600000000));
            //Sincronizamos el array de contactos con el bidimensinal;
            contactos[i] = new String[]{contactosPoo[i].getName(), contactosPoo[i].getEmail(), contactosPoo[i].getPhone()};
        }
        contador = MAX_CONTACT - 1;
        return contactos;
    }

    //Método solo accesible por la Clase para crear un objeto insertable en el array
    private String[] createContact() {
        String[] contactNew = new String[MAX_DATA];
        for (int i = 0; i < MAX_DATA; i++) {
            contactNew[i] = InOut.getData("Introduce el " + InOut.printLabel(i));
        }
        return contactNew;
    }

    /**
     * *************************************************************************
     * Este método sería el método alternativo al de createContact si solo
     * trabajaramos con el listinPoo. No lo podemos sobrecargar porque no recibe
     * parametros en ningun caso (podriamos trampearlo haciendo que espere un
     * entero el cual despues no usariamos para nada. No me parece ni correcto
     * ni semantico)
     * *************************************************************************
     *
     * private Contact createContact() { return new Contact(
     * InOut.getData("Introduce el " + InOut.printLabel(NOMBRE)),
     * InOut.getData("Introduce el " + InOut.printLabel(TELEFONO)),
     * InOut.getData("Introduce el " + InOut.printLabel(EMAIL))); }
     * **************************************************************************
     */
    //Método para sincronizar desde el array contactos al contactosPoo
    private Contact syncArray(int index) {
        contactosPoo[index] = new Contact(contactos[index][NOMBRE], contactos[index][TELEFONO], contactos[index][EMAIL]);
        return contactosPoo[index];
    }

    //Método para añadir contactos
    public String[] addContact() {
        if (getContador() < getMAX_CONTACT() - 1) {
            /**
             * *********************************************************************
             * Insertamos los datos en la siguiente posicion libre del array, de
             * ahí el preincremento y no el postincremento
             * ********************************************************************
             */
            contactos[++contador] = createContact();
            /**
             * *****************************************************************
             * Sentencia de como lo hariamos solo con listinPoo, No está
             * habilitado para no tener que meter 2 veces los datos. Para no
             * corromper la integridad de los arrays usamos el metodo syncArray
             * *****************************************************************
             */
            //listinPoo[++contador]=createContact();

            //Sincronizamos el array
            syncArray(contador);
            //Creado correctamente
            InOut.printInfoMsg(2);
            return contactos[contador];
        } else {
            InOut.printInfoMsg(0);
            return null;
        }
    }

    //Método para buscar un elemento dentro del array especificando el campo. Devuelve el indice i del elemento
    public int findContact(int findField, String elementFind) {
        if (contador != -1) {
            for (int i = 0; i <= contador; i++) {
                //Usamos equalsIgnoreCase para hacer una comparacion de cadenas que no sea Case Sensitive
                if (contactos[i][findField].equalsIgnoreCase(elementFind)) {
                    //Devuelve la posicion del elemento encontrado
                    return i;
                }
            }
            //No se ha encontrado el elemento
            InOut.printInfoMsg(5);
        } else {
            InOut.printInfoMsg(1);
            return -1;
        }
    }

    //Método para modificar un contacto
    public String[] modifyContact(int index) {
        if (getContador() != -1) {
            //Comprobamos que el elemento existe
            if (index > -1) {
                //Pedimos los nuevos datos de contacto
                contactos[index] = createContact();
                //sincronizamos los array
                syncArray(index);
                //Modificado correctamente
                InOut.printInfoMsg(4);
                return contactos[index];
            }
        } else {
            InOut.printInfoMsg(1);
        }
        return null;
    }

    public String[] deleteContact(int index) {
        if (contador != -1) {   //Agenda vacia
            if (index > -1) {   //Comprobamos que el elemento existe

                String[] contactoEliminado = contactos[index];

                /**
                 * *****************************************************************
                 * Mejoramos el acarreo tradicional del array con un arraycopy.
                 * Si lo hacemos sobre el propio array descartando la ultima
                 * posicion nos acopla los dos ultimo indices puesto que los dos
                 * referenciarian al mismo objeto. Como solucion alternativa
                 * creamos un array del mismo tamaño y tipo que el que estamos
                 * trabajando. Por defecto se inicializa a null. Le pasamos
                 * primero todo lo que hay antes del indice encontrado Y todo lo
                 * que hay despues. Acabado el proceso sobreescribimos el array
                 * original obteniendo el resultado que queriamos.
                 * ****************************************************************
                 */
                System.arraycopy(contactos, index + 1, contactos, index, contactos.length - 1 - index);
                System.arraycopy(contactosPoo, index + 1, contactosPoo, index, contactosPoo.length - 1 - index);
                contactos[contador] = new String[MAX_DATA];

//            //Declaramos el array intermedio
//            String[][] contactosClean = new String[MAX_CONTACT][MAX_DATA];
//            //Copiamos todo lo que hay antes del indice en el nuevo array
//            System.arraycopy(contactos, 0, contactosClean, 0, index);
//            //Copiamos todo lo que esta detás del indice
//            System.arraycopy(contactos, index + 1, contactosClean, index, contador - index);
//            //Asignamos el array limpio a nuestra agenda
//            contactos = contactosClean;
                /**
                 * *****************************************************************
                 * Para hacerlo con listinPoo lo hacemos practicamente igual
                 * cambiando el tipo de datos del array. Lo dejo funcional para
                 * que no se corrompan los datos entre los 2 arrays
                 * *****************************************************************
                 */
//            Contact[] contactosCleanPoo = new Contact[MAX_CONTACT];
//            System.arraycopy(contactosPoo, 0, contactosCleanPoo, 0, index);
//            System.arraycopy(contactosPoo, index + 1, contactosCleanPoo, index, contador - index);
//            contactosPoo = contactosCleanPoo;
                --contador;
                InOut.printInfoMsg(3);      //Contacto borrado
                return contactoEliminado;
            } else {
                return null;
            }
        } else {
            InOut.printInfoMsg(1);
        }
        InOut.printInfoMsg(1);
        return null;
    }

    public void printContact(int index) {
        //Comprobamos que el elemento existe
        if (index > -1) {
            System.out.println("Usuario " + index);
            for (int i = 0; i < contactos[index].length; i++) {
                System.out.println("\t" + InOut.printLabel(i) + contactos[index][i]);
            }
            /**
             * *********************************
             * Imprimir desde el listinPoo Comentado por razones obvias
             * **********************************
             */

//        System.out.println("\n\tNombre: " + contactosPoo[index].getName());
//        System.out.println("\tTelefono: " + contactosPoo[index].getPhone());
//        System.out.println("\tEmail: " + contactosPoo[index].getEmail());
        }
    }

    public void printSchedule() {
        if (getContador() != -1) {
            //for para el array hasta contador
            for (int i = 0; i <= contador; i++) {
                printContact(i);
            }
        } else {
            InOut.printInfoMsg(1);//Agenda vacia
        }
    }

    public int getMAX_CONTACT() {
        return MAX_CONTACT;
    }

    public int getContador() {
        return contador;
    }
}
