package edu.fiuba.algo3.modelo;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PreguntaVoF {
    String enunciado;
    List<Respuesta> respuestas=new ArrayList<Respuesta>();
    //Respuesta respuestaCorrecta;
    //Respuesta respuestaIncorrecta;


    public PreguntaVoF(String enunciado, Respuesta respuestaCorrecta, Respuesta respuestaIncorrecta){
        this.enunciado = enunciado;
        respuestas.add(respuestaCorrecta);
        respuestas.add(respuestaIncorrecta);
    //    this.respuestaCorrecta = respuestaCorrecta;
    //    this.respuestaIncorrecta = respuestaIncorrecta;
    }
    public void clasificarRespuesta( List<Seleccion> listaDeSeleccion) {

        for (Seleccion seleccion: listaDeSeleccion){
            seleccion.calificar();
        }
    }

    public List<Respuesta> obtenerOpciones() {
        return respuestas;
    }

   public boolean esCorrecta(Respuesta respuesta) {
        return (respuesta.esCorrecta());
    }
}
