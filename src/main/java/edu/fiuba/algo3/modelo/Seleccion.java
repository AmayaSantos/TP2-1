package edu.fiuba.algo3.modelo;

public class Seleccion {
    Jugador jugador;
    Respuesta respuesta;

    public Seleccion(Respuesta respuesta,Jugador jugador) {
        this.jugador = jugador;
        this.respuesta = respuesta;
    }

    public void calificar(){
        jugador.modificarPuntaje(respuesta.calificar());
    }

}
