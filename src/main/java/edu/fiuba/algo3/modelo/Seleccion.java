package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Seleccion {
    Jugador jugador;
    ArrayList<Opcion> opciones;

    public Seleccion(Jugador jugador, ArrayList<Opcion> opciones) {
        this.jugador = jugador;
        this.opciones = opciones;
    }

    public Seleccion(Jugador jugador, Opcion opcion) {
        this.jugador = jugador;
        this.opciones = new ArrayList<Opcion>();
        opciones.add(opcion);
    }


    public Respuesta esCalificadaPor(TipoDePregunta pregunta){
        return pregunta.calificar(opciones);
    }

    public void asignarPuntaje(int puntaje){
        jugador.modificarPuntaje(puntaje);
    }
}
