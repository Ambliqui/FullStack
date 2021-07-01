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
        for (int i = 0; i < getContactos().length; i++) {
            //El dato del telefono devuelve un numero de móvil en el rango de los que se pueden utilizar en España actualmente
            //String.valueOf nos convierte el entero a String
            contactosPoo[i] = new Contact(fillName[i], fillName[i] + "@cartuja.com", String.valueOf((int) (Math.random() * (749999999 + 1 - 600000000)) + 600000000));
            //Sincronizamos el array de contactos con el bidimensinal;
            contactos[i] = new String[]{getContactosPoo()[i].getName(), getContactosPoo()[i].getEmail(), getContactosPoo()[i].getPhone()};
        }
        contador = MAX_CONTACT - 1;
        return getContactos();
    }

    //Método solo accesible por la Clase para crear un objeto insertable en el array
    private String[] createContact() {
        String[] contactNew = new String[getMAX_DATA()];
        for (int i = 0; i < getMAX_DATA(); i++) {
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
        contactosPoo[index] = new Contact(getContactos()[index][NOMBRE], getContactos()[index][TELEFONO], getContactos()[index][EMAIL]);
        return getContactosPoo()[index];
    }

    //Método para añadir contactos
    public String[] addContact(String[] contactoNuevo) {
        if (getContador() < getMAX_CONTACT() - 1) {
            /**
             * *********************************************************************
             * Insertamos los datos en la siguiente posicion libre del array, de
             * ahí el preincremento y no el postincremento
             * ********************************************************************
             */
            contactos[++contador] = contactoNuevo;
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
            return getContactos()[contador];
        } else {
            InOut.printInfoMsg(0);
            return null;
        }
    }

    //Método para buscar un elemento dentro del array especificando el campo. Devuelve el indice i del elemento
    public String[] findContact(int findField, String elementFind) {
        if (contador != -1) {
            for (int i = 0; i <= contador; i++) {
                //Usamos equalsIgnoreCase para hacer una comparacion de cadenas que no sea Case Sensitive
                if (getContactos()[i][findField].equalsIgnoreCase(elementFind)) {
                    //Devuelve la posicion del elemento encontrado
                    return contactos[i];
                }
            }
            //No se ha encontrado el elemento
            InOut.printInfoMsg(5);
        } else {
            InOut.printInfoMsg(1);
            return null;
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
                return getContactos()[index];
            }
        } else {
            InOut.printInfoMsg(1);
        }
        return null;
    }

    public String[] deleteContact(int index) {
        if (contador != -1) {   //Agenda vacia
            if (index > -1) {   //Comprobamos que el elemento existe

                String[] contactoEliminado = getContactos()[index];

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
                System.arraycopy(getContactos(), index + 1, getContactos(), index, getContactos().length - 1 - index);
                System.arraycopy(getContactosPoo(), index + 1, getContactosPoo(), index, getContactosPoo().length - 1 - index);
                contactos[contador] = new String[getMAX_DATA()];

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

    public int getMAX_CONTACT() {
        return MAX_CONTACT;
    }

    public int getMAX_DATA() {
        return MAX_DATA;
    }
    
    public int getContador() {
        return contador;
    }
    
    public String[][] getContactos() {
        return contactos;
    }

    public Contact[] getContactosPoo() {
        return contactosPoo;
    }
}
