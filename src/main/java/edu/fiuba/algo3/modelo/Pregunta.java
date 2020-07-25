package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class Pregunta {

    String enunciado;
    List<Respuesta> respuestasCorrectas;
    List<Respuesta> respuestasIncorrectas;

    public List<Respuesta> obtenerOpciones(){
        List<Respuesta> respuestas= new ArrayList<>();
        respuestas.addAll(respuestasIncorrectas);
        respuestas.addAll(respuestasCorrectas);
        return respuestas;
    }

    public void clasificar(Seleccion seleccion) {
            seleccion.calificar(respuestasCorrectas);
    }
}

