package edu.fiuba.algo3.modelo;

public class Opcion {
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
