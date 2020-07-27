package edu.fiuba.algo3.modelo;

public class PreguntaVoFPenalizado extends Pregunta {
    public PreguntaVoFPenalizado(String enunciado) {
        this.enunciado= enunciado;
        opciones.put("Verdadero", new OpcionIncorrectaPenalizada());
        opciones.put("Falso", new OpcionIncorrectaPenalizada());
    }
}
