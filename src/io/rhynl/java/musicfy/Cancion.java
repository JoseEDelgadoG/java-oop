/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.rhynl.java.musicfy;

/**
 *
 * @author Rhaynel Parra Aguiar <mail@rhynl.io>
 */
public class Cancion {
    String autor;
    String genero;
    String publicacion; // fecha de publicación
    int duracion; //en segundos
    
    /**
     * Crea una nueva canción
     * @param autor
     * @param genero
     * @param publicacion
     * @param duracion 
     */
    public Cancion(String autor, String genero, String publicacion, int duracion) {
        this.autor = autor;
        this.genero = genero;
        this.publicacion = publicacion;
        this.duracion = duracion;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getPublicacion() {
        return publicacion;
    }
    
    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }
    
    public int getDuracion() {
        return duracion;
    }
    
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
}
