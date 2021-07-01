/**
 * El mini-patron Dao-Vo hace que una parte del modelo lleve la estructura del
 * dato (VO) y que el DAO sea la encargada de recibir los parametros adecuados
 * para comunicarse con la parte persistente de datos
 */
package com.arelance.agendapoo.modelo;

/**
 *
 * @author Mefisto
 */
public class ScheduleDao {
    //Propiedad necesaria para el patron Singleton, es la única instancia sobre la que vamos a trabajar

    private static ScheduleDao schedule;
    //Definimos el maximo de filas que en nuestro caso van a ser agenda
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
    private String[][] agenda = new String[MAX_CONTACT][MAX_DATA];
    //Forma correcta de orientarlo a objetos. Array de instancias de la clase Contact
    private Contact[] contactos = new Contact[MAX_CONTACT];

    //Definimos un único constructor como privado para poder hacer el patron Singleton
    private ScheduleDao() {
    }

    //De esta es la unica manera de pedirle una instancia a la clase
    //Queda pendiente hacerlo por Enum
    public static ScheduleDao getInstance() {
        //Si la instacia no existe la crea, sino nos devuelve la que ya existe
        if (schedule == null) {
            schedule = new ScheduleDao();
        }
        return schedule;
    }

    //Metodo para autorrelenar el array para hacer pruebas
    public String[][] autoFillSchedule() {
        String[] fillName = {"Antonio", "Marcos", "Pedro", "Ruben", "Isi"};
        for (int i = 0; i < getAgenda().length; i++) {
            //El dato del telefono devuelve un numero de móvil en el rango de los que se pueden utilizar en España actualmente
            //String.valueOf nos convierte el entero a String
            contactos[i] = new Contact(fillName[i], fillName[i] + "@cartuja.com", String.valueOf((int) (Math.random() * (749999999 + 1 - 600000000)) + 600000000));
            //Sincronizamos el array de agenda con el bidimensinal;
            agenda[i] = new String[]{contactos[i].getName(), contactos[i].getEmail(), contactos[i].getPhone()};
        }
        contador = getAgenda().length - 1;
        return getAgenda();
    }

    //Método para sincronizar desde el array agenda al contactos
    private Contact syncArray(int index) {
        contactos[index] = new Contact(agenda[index][NOMBRE], agenda[index][TELEFONO], agenda[index][EMAIL]);
        return contactos[index];
    }

    //Método para añadir agenda
    public String[] addContact(String[] nuevoContacto) {
        /**
         * *********************************************************************
         * Insertamos los datos en la siguiente posicion libre del array, de ahí
         * el preincremento y no el postincremento
         * ********************************************************************
         */
        agenda[++contador] = nuevoContacto;
        //Sincronizamos el array
        syncArray(contador);
        return agenda[contador];
    }

    //Método para buscar un elemento dentro del array especificando el campo. Devuelve el indice i del elemento
    public int findContact(int findField, String elementFind) {
        for (int i = 0; i <= contador; i++) {
            //Usamos equalsIgnoreCase para hacer una comparacion de cadenas que no sea Case Sensitive
            if (getAgenda()[i][findField].equalsIgnoreCase(elementFind)) {
                //Devuelve la posicion del elemento encontrado
                return i;
            }
        }
        //Bandera de no encontrado
        return -1;
    }

    //Método para modificar un contacto
    public String[] modifyContact(int index, String[] nuevoContacto) {
        //Introducimos los datos
        agenda[index] = nuevoContacto;
        //sincronizamos los array
        syncArray(index);
        return agenda[index];
    }

    public String[] deleteContact(int index) {

        //Guardamos el elemento que vamos a borrar
        String[] contactoEliminado = getAgenda()[index];

        /**
         * *****************************************************************
         * Mejoramos el acarreo tradicional del array con un arraycopy.
         * ****************************************************************
         */
        System.arraycopy(getAgenda(), index + 1, getAgenda(), index, getAgenda().length - 1 - index);
        System.arraycopy(contactos, index + 1, contactos, index, contactos.length - 1 - index);
        --contador;
        return contactoEliminado;

    }

    public String[][] deleteSchedule() {
        String[][] copiaAgenda = agenda;
        agenda = new String[MAX_CONTACT][MAX_DATA];
        contactos = new Contact[MAX_CONTACT];
        contador = -1;
        return copiaAgenda;
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

    public String[][] getAgenda() {
        return agenda;
    }
}
