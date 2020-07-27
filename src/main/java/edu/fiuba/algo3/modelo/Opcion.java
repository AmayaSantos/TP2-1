package edu.fiuba.algo3.modelo;

public class Opcion {
    void esCorrecta(TipoDePregunta pregunta){
        pregunta.esCorrecta(this);
    }
    Respuesta esCalificadaPor(TipoDePregunta pregunta){
        return new RespuestaCorrecta();
    }

    public Opcion getInstance(){
        return this;
    }
}
