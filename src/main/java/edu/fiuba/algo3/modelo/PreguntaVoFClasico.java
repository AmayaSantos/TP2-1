package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class PreguntaVoFClasico extends Pregunta {
    public PreguntaVoFClasico(String enunciado) {
        this.enunciado = enunciado;
        respuestas.put("Verdadero", new RespuestaIncorrecta());
        respuestas.put("Falso", new RespuestaIncorrecta());
    }
}
