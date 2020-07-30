/*package edu.fiuba.algo3.modelo;

import java.util.HashMap;
import java.util.List;

public abstract class Pregunta {
    protected String enunciado;
    protected HashMap<String, Opcion> opciones = new HashMap<String, Opcion>();

    public void asignarRespuestaCorrecta(String respuestaCorrecta){
        opciones.replace(respuestaCorrecta, new OpcionCorrecta());
    }

    public boolean esCorrecta(String respuesta){
        return opciones.get(respuesta).esCorrecta();
    }

    public void calificar(List<Respuesta> selecciones) {
        for ( Respuesta respuesta : selecciones ){
            respuesta.calificar(opciones);
        }
    }
}
*/
