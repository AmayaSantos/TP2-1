package edu.fiuba.algo3.modelo;

public class Opcion {
    // LANZAR EXCEPCIONES EN TODAS LAS PREGUNTAS
    Respuesta esCalificadaPor(TipoDePregunta pregunta){
        return new RespuestaCorrecta();
    }

    //Aca tenemos que lanzar una excepcion
    Respuesta esCalificadaPor(PreguntaVoF pregunta){
        return new RespuestaIncorrecta();
    }

    public void esCorrecta(TipoDePregunta pregunta){

    }

    public void esCorrecta(PreguntaVoF pregunta){

    }
}
