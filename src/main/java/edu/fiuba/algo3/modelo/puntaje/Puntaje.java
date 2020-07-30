package edu.fiuba.algo3.modelo.puntaje;

public abstract class Puntaje {
    private int valor;

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void valor() {
        return valor;
    }

    public abstract Puntaje sumar(Puntaje puntaje);
}
