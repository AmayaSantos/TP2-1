package edu.fiuba.algo3.modelo.puntaje;

public class PuntoNegativo implements Puntaje {

    @Override
    public void añadir(Puntaje puntaje){}

    @Override
    public int valor(){
        return -1;
    }
}
