package edu.fiuba.algo3.modelo;

public class PreguntaVoFPenalizado extends Pregunta {
    public PreguntaVoFPenalizado(String enunciado) {
        this.enunciado= enunciado;
        respuestas.put("Verdadero", new RespuestaIncorrectaPenalizada());
        respuestas.put("Falso", new RespuestaIncorrectaPenalizada());
    }
}
