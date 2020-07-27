package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Pregunta {

    String enunciado;
    protected List<Respuesta> respuestasCorrectas;
    protected List<Respuesta> respuestasIncorrectas;
    protected HashMap<String, Respuesta> respuestas = new HashMap<String, Respuesta>();

    public List<Respuesta> obtenerOpciones(){
        List<Respuesta> respuestas= new ArrayList<>();
        respuestas.addAll(respuestasIncorrectas);
        respuestas.addAll(respuestasCorrectas);
        return respuestas;
    }


    public List<Respuesta> obtenerRespuestasCorrectas(){
        return respuestasCorrectas;
    }

    public abstract void respuestaCorrecta(String respuesta);

    public boolean esCorrecta(String respuesta){
        return respuestas.get(respuesta).esCorrecta();
    }

    public void calificar(List<Seleccion> selecciones) {
        for ( Seleccion seleccion : selecciones ){
            seleccion.calificar(respuestas);
        }
    }
}

