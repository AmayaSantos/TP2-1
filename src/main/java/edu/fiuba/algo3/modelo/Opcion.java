package edu.fiuba.algo3.modelo;

public interface Opcion {
    Respuesta opcionSeleccionada(Pregunta pregunta);
    void esCorrecta(Pregunta pregunta);
}
