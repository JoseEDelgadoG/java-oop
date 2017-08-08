/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.rhynl.java.musicfy;

/**
 *
 * @author alumno
 */
public class Reproductor {
    private Cancion[] lista;
    
    public Reproductor(Cancion[] lista) {
        this.lista = lista;
    }
    
    public void ReproducirLista() {
        for (Cancion cancion : lista) {
            cancion.reproducir();
        }
    }
}
