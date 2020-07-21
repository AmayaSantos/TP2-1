package edu.fiuba.algo3.modelo;

import java.util.Iterator;
import java.util.List;

public class PreguntaVoF {
    String enunciado;
    Respuesta respuestaCorrecta;
    Respuesta respuestaIncorrecta;


    public PreguntaVoF(String enunciado, Respuesta respuestaCorrecta, Respuesta respuestaIncorrecta){
        this.enunciado = enunciado;
        this.respuestaCorrecta = respuestaCorrecta;
        this.respuestaIncorrecta = respuestaIncorrecta;
    }
    public void clasificarRespuesta( List<Seleccion> listaDeSeleccion) {
        Iterator iterador = listaDeSeleccion.iterator();
        while(iterador.hasNext()){
            iterador.next().calificar();

        }
    }

    public boolean esCorrecta(Respuesta respuesta) {
        return (respuestaCorrecta.igual(respuesta));
    }
}
