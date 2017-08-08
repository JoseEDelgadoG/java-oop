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
    private String nombre;
    String artista;
    String genero;
    String lanzamiento; // fecha de lanzamiento
    int duracion; // en segundos
    
    /**
     * Permite crear un objeto cancion
     * @param nombre nombre de la cancion
     * @param artista nombre de artista
     * @param genero genero de la cancion
     * @param lanzamiento fecha de lanzamiento
     * @param duracion duracion en segundos de la cancion
     */
    public Cancion(String nombre, String artista, String genero, String lanzamiento, int duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.lanzamiento = lanzamiento;
        this.duracion = duracion;
    }
    
    public void reproducir() {
        System.out.println("Playing...");
    }
    
    public void parar() {
        System.out.println("stoped...");
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
