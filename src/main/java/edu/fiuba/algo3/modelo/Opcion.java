package edu.fiuba.algo3.modelo;

public class Opcion {
    int ubicacion;

    public Opcion(int ubicacion){
        this.ubicacion = ubicacion;
    }
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

    public void esCorrecta(MultipleChoise pregunta){
        //pregunta.agregarOpcionCorrecta(obtenerNumero());
    }

    public void esCorrecta(PreguntaVoF pregunta){

    }

    public int obtenerNumero(){
        return ubicacion;
    }
}
