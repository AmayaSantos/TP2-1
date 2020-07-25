package edu.fiuba.algo3.modelo;

public interface Respuesta {

    String nombre();

    int calificar();

    int puntaje();

    void vs(Respuesta respuesta);

    void vs(RespuestaCorrecta respuesta);

    void vs(RespuestaIncorrecta respuesta);
}
