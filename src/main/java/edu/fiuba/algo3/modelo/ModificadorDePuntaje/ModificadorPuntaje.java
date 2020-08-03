package edu.fiuba.algo3.modelo.ModificadorDePuntaje;

import edu.fiuba.algo3.modelo.Jugador.Jugador;

public interface ModificadorPuntaje {

    void modificarPuntaje(int cantidadRespuestasCorrectas, int cantidadRespuestasIncorrectas, Jugador jugador);
}
