package edu.fiuba.algo3.modelo;

public interface Opcion {
    void esCorrecta(Pregunta pregunta);
    Respuesta esCalificadaPor(Pregunta pregunta);
}
