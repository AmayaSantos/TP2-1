package edu.fiuba.algo3.modelo.Pregunta;

import edu.fiuba.algo3.modelo.ModificadorDePuntaje.ModificadorPuntaje;
import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.Respuestas.Respuestas;

import java.util.List;

public class PreguntaGC extends Pregunta {

    public PreguntaGC(String enunciado, Opciones respuestasCorrectas, ModificadorPuntaje modificadorPuntaje) {
        super(enunciado, respuestasCorrectas, modificadorPuntaje);
    }

    @Override
    public void calificar(Opciones opcionesCorrectas, List<Respuestas> respuestaJugadores) {
        for (Respuestas respuestaJugador : respuestaJugadores) {
            int cantidadOpcionesCorrectas = 0;
            int cantidadOpcionesincorrectas = 0;
            for (String opcion : respuestaJugador.obtenerRespuestas()) {
                if (opcionesCorrectas.esta(opcion)) {
                    cantidadOpcionesCorrectas += 1;
                } else cantidadOpcionesincorrectas += 1;
            }
            modificadorPuntaje.modificarPuntaje(cantidadOpcionesCorrectas, cantidadOpcionesincorrectas, respuestaJugador.obtenerJugador());
        }
    }
}

