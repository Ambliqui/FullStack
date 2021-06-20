/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendarefinitiva.modelo;

import java.util.*;

/**
 *
 * @author Mefisto
 */
public class Schedule {
    private List<Contact> schedule;

    public Schedule() {
    }

    public Schedule(List<Contact> schedule) {
        this.schedule = schedule;
    }

    public List<Contact> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<Contact> schedule) {
        this.schedule = schedule;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.schedule);
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
        final Schedule other = (Schedule) obj;
        if (!Objects.equals(this.schedule, other.schedule)) {
            return false;
        }
        return true;
    }
    
    
}
