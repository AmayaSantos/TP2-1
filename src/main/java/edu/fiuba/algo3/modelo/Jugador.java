package edu.fiuba.algo3.modelo;

import java.util.List;

public class Jugador {
    String nombreJugador;
    int puntaje = 0;
    protected int multiplicador;


    public Jugador(String nombre) {
        this.nombreJugador = nombre;
        this.multiplicador = 1;
    }

    public void modificarPuntaje(int numero){
        puntaje += numero;
    }

    public void activarMultiplicador(int valor){
        this.multiplicador = valor;
    }

    public int obtenerPuntaje(){
        return puntaje;
    }

    public int multiplicador() {
        int multiplicadorBoosteado = multiplicador;
        this.multiplicador = 1;
        return multiplicadorBoosteado;
    }
}

