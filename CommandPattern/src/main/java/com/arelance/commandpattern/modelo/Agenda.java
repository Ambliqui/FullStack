/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.commandpattern.modelo;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Mefisto
 */
public class Agenda {
    List<Contact> agenda;

    public Agenda() {
    }

    public Agenda(List<Contact> agenda) {
        this.agenda = agenda;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.agenda);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Agenda other = (Agenda) obj;
        if (!Objects.equals(this.agenda, other.agenda)) {
            return false;
        }
        return true;
    }
    
    
}
