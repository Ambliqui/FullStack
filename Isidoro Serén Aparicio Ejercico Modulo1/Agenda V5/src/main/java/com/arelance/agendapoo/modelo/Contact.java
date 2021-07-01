/*******************************************************************************
 * Nuestra Clase Contact en la arquetipo persona, en este caso solo tendra las
 * propiedades especificadas en el ejercicio
 ******************************************************************************/
package com.arelance.agendapoo.modelo;

/**
 *
 * @author Mefisto
 */
public class Contact {
    private String name;
    private String phone;
    private String email;
    
    Contact(String name, String phone, String email){
        this.name=name;
        this.phone=phone;
        this.email=email;
    }

    //Metodos getter and seters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
