package edu.fiuba.algo3.modelo;
import java.util.HashMap;

public class Seleccion {
    String respuesta;
    Jugador jugador;

    public Seleccion(Jugador jugador, String respuesta) {
        this.jugador = jugador;
        this.respuesta = respuesta;
    }

    public void calificar(HashMap<String, Respuesta> respuestas){
        Respuesta respuestaEscogida = respuestas.get(respuesta);
        jugador.modificarPuntaje(respuestaEscogida.calificar());
    }
}

