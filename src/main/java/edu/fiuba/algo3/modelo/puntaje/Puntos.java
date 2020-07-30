package edu.fiuba.algo3.modelo.puntaje;

public class Puntos extends Puntaje {
    Puntaje puntaje;

    @Override
    public Puntaje sumar(Puntaje puntaje) {
        Puntaje resultado = new Puntos();
        resultado.setValor(this.valor() + puntaje.valor());
        return resultado;
    }

}
