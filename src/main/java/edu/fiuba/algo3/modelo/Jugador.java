package edu.fiuba.algo3.modelo;

import java.util.List;

public class Jugador {
    protected String nombreJugador;
    protected int puntaje = 0;
    protected int puntajeTemporal;



    public Jugador(String nombre) {
        this.nombreJugador = nombre;

        puntajeTemporal=0;
    }

    public void activarMultiplicadorX2() {

    }

    public void activarMultiplicadorX3(){

    }
    public int obtenerPuntaje(){
        return puntaje;
    }


    public void modificarPuntaje(int puntaje) {
    this.puntaje+=(puntaje);
    }


    public void modificarPuntajeTemporal(int puntaje) {
        puntajeTemporal+=puntaje;
    }
}

