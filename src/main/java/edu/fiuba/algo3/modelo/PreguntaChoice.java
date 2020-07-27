package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class PreguntaChoice extends Pregunta{
    public PreguntaChoice(String enunciado){
        this.respuestasIncorrectas=new ArrayList<>();
        this.respuestasCorrectas= new ArrayList<>();
        this.enunciado=enunciado;
    }
    public void agregar(RespuestaCorrecta respuesta){
        this.respuestasCorrectas.add(respuesta);
    }
    public void agregar(RespuestaIncorrecta respuesta){
        this.respuestasIncorrectas.add(respuesta);
    }


    @Override
    public void respuestaCorrecta(String respuesta) {

    }
}
