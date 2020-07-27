package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Pregunta {
    String enunciado;
    protected HashMap<String, Respuesta> respuestas = new HashMap<String, Respuesta>();

    public void respuestaCorrecta(String respuesta){
        respuestas.replace(respuesta, new RespuestaCorrecta());
    }

    public boolean esCorrecta(String respuesta){
        return respuestas.get(respuesta).esCorrecta();
    }

    public void calificar(List<Seleccion> selecciones) {
        for ( Seleccion seleccion : selecciones ){
            seleccion.calificar(respuestas);
        }
    }
}

