/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendarefinitiva.modelo;

import com.arelance.agendarefinitiva.modelo.Contact;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mefisto
 */
public enum SingletonAgenda {
    INSTANCE;
    public final List<Contact> agenda = new ArrayList<>();
}
