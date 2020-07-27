package edu.fiuba.algo3.modelo;

public class PreguntaVoFClasico extends Pregunta {
    public PreguntaVoFClasico(String enunciado) {
        this.enunciado = enunciado;
        opciones.put("Verdadero", new OpcionIncorrecta());
        opciones.put("Falso", new OpcionIncorrecta());
    }
}
