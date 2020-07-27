package edu.fiuba.algo3.modelo;

import java.util.List;

public class Jugador {
    protected String nombreJugador;
    protected int puntaje = 0;
    protected int puntajeTemporal;
    protected int multiplicadorActivo;
    private int multiplicadorX2;
    private int multiplicadorX3;


    public Jugador(String nombre) {
        this.nombreJugador = nombre;
        this.multiplicadorX2= 2;
        multiplicadorActivo=1;
        multiplicadorX3=3;
        puntajeTemporal=0;
    }

    public void activarMultiplicadorX2() {
        multiplicadorActivo=multiplicadorX2;
        multiplicadorX2=1;
    }

    public void activarMultiplicadorX3(){
        multiplicadorActivo=multiplicadorX3;
        multiplicadorX3=1;
    }
    public int obtenerPuntaje(){
        return puntaje;
    }


    public void modificarPuntaje(int puntaje) {
    this.puntaje+=(puntaje*multiplicadorActivo);
    }

    public void modificarPuntajeTemporal(int puntaje) {
        puntajeTemporal+=puntaje;
    }
    
}

