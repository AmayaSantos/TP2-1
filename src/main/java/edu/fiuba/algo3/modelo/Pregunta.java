package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class Pregunta {

    protected String enunciado;
    protected List<Respuesta> respuestasCorrectas;
    protected List<Respuesta> respuestasIncorrectas;

    public List<Respuesta> obtenerOpciones(){
        List<Respuesta> respuestas= new ArrayList<>();
        respuestas.addAll(respuestasIncorrectas);
        respuestas.addAll(respuestasCorrectas);
        return respuestas;
    }


    public List<Respuesta> obtenerRespuestasCorrectas(){
        return respuestasCorrectas;
    }
}

