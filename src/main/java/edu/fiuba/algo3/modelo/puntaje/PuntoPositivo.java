package edu.fiuba.algo3.modelo.puntaje;

public class PuntoPositivo extends Puntaje {
    public PuntoPositivo(){
        this.setValor(1);
    }

    @Override
    public Puntaje sumar(Puntaje puntaje) {
        return new Puntos().setValor(puntaje.valor() + this.valor());
    }
}
