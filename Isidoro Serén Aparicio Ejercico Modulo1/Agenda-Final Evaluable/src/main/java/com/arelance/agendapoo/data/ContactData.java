/**
 * Dato "persistente" de la BD, guanda los contactos
 */
package com.arelance.agendapoo.data;

import com.arelance.agendapoo.modelo.ContactVo;

/**
 *
 * @author Mefisto
 */
public class ContactData {

    private static ContactData contactData;
    //Definimos el maximo de filas que en nuestro caso van a ser el maximo de 
    //contactos que tenga la agenda
    private final int MAX_CONTACT = 5;
    //Forma correcta de orientarlo a objetos. Array de instancias de la clase ContactVo
    private ContactVo[] contactos = new ContactVo[5];

    private ContactData() {
    }

    public static ContactData getInstance() {
        if (contactData == null) {
            contactData = new ContactData();
        }
        return contactData;
    }

    public ContactVo[] getContactos() {
        return contactos;
    }

    public void setContactos(ContactVo[] contactos) {
        this.contactos = contactos;
    }
}
