/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agendacapas;

/**
 *
 * @author Mefisto
 */
public class Option {
    private int item;
    private String label;

    public Option() {
    }

    public Option(int item, String valor) {
        this.item = item;
        this.label = valor;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
