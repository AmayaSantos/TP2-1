package edu.fiuba.algo3.modelo.puntaje;

public class PuntoNegativo extends Puntaje {
    public PuntoNegativo(){
        this.setValor(-1);
    }

    @Override
    public Puntaje sumar(Puntaje puntaje) {
        return new Puntos().setValor(puntaje.valor() + this.valor());
    }
}
