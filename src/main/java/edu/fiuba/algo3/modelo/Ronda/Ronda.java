package edu.fiuba.algo3.modelo.Ronda;

import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.Pregunta.Pregunta;
import edu.fiuba.algo3.modelo.puntaje.Puntaje;

public class Ronda {

    public void calificar(Jugador jugador, Pregunta pregunta){
        Puntaje puntaje=pregunta.calificar(jugador.obtenerRespuestas());
        jugador.agregarPuntaje(puntaje);
    }
}
