package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class PreguntaOrdered extends Pregunta {
    protected List<Respuesta>  respuestas;
    public PreguntaOrdered(String enunciado){
        this.enunciado=enunciado;
        respuestas= new ArrayList<>();
    }
    public void agregar(RespuestaConOrden respuesta) {
        respuestas.add(respuesta);
    }
    @Override
    public List<Respuesta> obtenerOpciones(){
        return respuestas;
    }
}
