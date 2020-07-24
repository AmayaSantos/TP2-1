package edu.fiuba.algo3.modelo;

public interface OpcionVoF {
    Respuesta opcionSeleccionada(PreguntaVoF pregunta);
    void esCorrecta(PreguntaVoF pregunta);
}
