package edu.fiuba.algo3.modelo;

import java.util.List;

public class Jugador {
    protected String nombreJugador;
    protected int puntaje = 0;


    public Jugador(String nombre) {
        this.nombreJugador = nombre;
    }

    public void modificarPuntaje(int numero){
        puntaje += numero;
    }
    public int obtenerPuntaje(){
        return puntaje;
    }

}

