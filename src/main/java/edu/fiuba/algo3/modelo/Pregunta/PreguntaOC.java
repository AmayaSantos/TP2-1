/*
package edu.fiuba.algo3.modelo.Pregunta;

import edu.fiuba.algo3.modelo.ModificadorDePuntaje.ModificadorPuntaje;
import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.Respuestas.Respuestas;

import java.util.List;

public class PreguntaOC extends Pregunta {

    public PreguntaOC(String enunciado, Opciones respuestasCorrectas, ModificadorPuntaje modificadorPuntaje) {
        super(enunciado, respuestasCorrectas, modificadorPuntaje);
    }

    @Override
    public void calificar(Opciones opcionesCorrectas, List<Respuestas> respuestaJugadores) {
        for (Respuestas respuestaJugador : respuestaJugadores) {
            if (respuestaJugadores.equals(opcionesCorrectas.Lista())) {
                int cantidadOpcionesCorrectas = 1;
                int cantidadOpcionesincorrectas = 0;
                modificadorPuntaje.modificarPuntaje(cantidadOpcionesCorrectas, cantidadOpcionesincorrectas, respuestaJugador.obtenerJugador());
            } else {
                int cantidadOpcionesCorrectas = 0;
                int cantidadOpcionesincorrectas = 1;
                modificadorPuntaje.modificarPuntaje(cantidadOpcionesCorrectas, cantidadOpcionesincorrectas, respuestaJugador.obtenerJugador());
            }
        }

    }
}
*/