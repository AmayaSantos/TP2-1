package edu.fiuba.algo3.modelo;

import java.util.List;

public class Jugador {
    protected String nombreJugador;
    protected int puntaje = 0;
    protected int multiplicadorActivo;
    private int multiplicadorX2;
    private int multiplicadorX3;


    public Jugador(String nombre) {
        this.nombreJugador = nombre;
        this.multiplicadorActivo = 1;
        multiplicadorX2=2;
        multiplicadorX3=3;
    }

    public void modificarPuntaje(int numero){
        puntaje +=(numero*multiplicadorActivo);
    }

    public void activarMultiplicadorX2(){
        this.multiplicadorActivo = multiplicadorX2;
        multiplicadorX2=1; /// solo tienen un uso
    }
    public void activarMultiplicadorX3(){
        this.multiplicadorActivo = multiplicadorX3;
        multiplicadorX3=1;//solotienen un uso
    }


    public int obtenerPuntaje(){
        return puntaje;
    }

}

