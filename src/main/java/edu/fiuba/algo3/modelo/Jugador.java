package edu.fiuba.algo3.modelo;

public class Jugador {
    String nombre;
    int puntaje = 0;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public void modificarPuntaje(int numero){
        puntaje += numero;
    }

    public int obtenerPuntaje(){
        return puntaje;
    }
}

