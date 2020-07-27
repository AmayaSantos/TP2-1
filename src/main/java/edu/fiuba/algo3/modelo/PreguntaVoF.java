package edu.fiuba.algo3.modelo;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PreguntaVoF implements TipoDePregunta{
    Respuesta respuestaOpcionFalsa, respuestaOpcionVerdadera;

    public PreguntaVoF(Opcion opcionCorrecta){
        opcionCorrecta.esCorrecta(this);
    }

    public void laFalsaEsLaCorrecta(){
        respuestaOpcionFalsa = new RespuestaCorrecta();
        respuestaOpcionVerdadera = new RespuestaIncorrecta();
    }

    public void laVerdaderaEsLaCorrecta(){
        respuestaOpcionFalsa = new RespuestaIncorrecta();
        respuestaOpcionVerdadera = new RespuestaCorrecta();
    }

    public void calificar(Selecciones selecciones){
        selecciones.calificarConPregunta(this);

    }

    public Respuesta calificar(OpcionVerdadero opcion){
        return respuestaOpcionVerdadera;
    }

    public Respuesta calificar(OpcionFalso opcion){
        return respuestaOpcionFalsa;
    }

    @Override
    public Respuesta calificar(List<Opcion> opciones) {
        return opciones.get(0).esCalificadaPor(this);
    }

}
