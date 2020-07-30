package edu.fiuba.algo3.modelo;

public class PreguntaVoFPenalizado extends Pregunta {
    public PreguntaVoFPenalizado(String enunciado) {
        this.enunciado= enunciado;
        opciones.put("Verdadero", new OpcionIncorrecta(1));
        opciones.put("Falso", new OpcionIncorrecta(1));
    }
}
