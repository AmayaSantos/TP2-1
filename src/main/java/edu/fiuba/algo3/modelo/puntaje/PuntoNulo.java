package edu.fiuba.algo3.modelo.puntaje;

public class PuntoNulo extends Puntaje {
    @Override
    public Puntaje sumar(Puntaje puntaje) {
        return puntaje;
    }
}
