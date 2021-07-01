/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pryetsa.biblioteca.beans;

import java.util.Objects;

/**
 *
 * @author pryet
 */
public class Libro implements Comparable<Libro>{
    private final String titulo;
    private final String autor;
    private final String ISBN;

    public Libro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.ISBN);
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
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.ISBN, other.ISBN)) {
            return false;
        }
        return true;
    }
    
    @Override
    public int compareTo(Libro o) {
       int resultado=titulo.compareToIgnoreCase(o.titulo);
       if(resultado==0){
           resultado=autor.compareToIgnoreCase(o.autor);
       }
       return resultado;
    }

    @Override
    public String toString() {
        return "\nLibro{" + "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + '}';
    }
    
    
    
}
