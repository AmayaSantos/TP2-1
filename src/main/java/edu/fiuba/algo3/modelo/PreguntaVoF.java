package edu.fiuba.algo3.modelo;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PreguntaVoF extends Pregunta{
    String enunciado;
    Respuesta respuestaOpcionFalsa, respuestaOpcionVerdadera;

    public PreguntaVoF(String enunciado, OpcionVoF opcion){
        this.enunciado = enunciado;
        opcion.esCorrecta(this);
    }

    public Respuesta opcionVerdadera(){
        return respuestaOpcionVerdadera;
    }

    public Respuesta opcionFalsa(){
        return respuestaOpcionFalsa;
    }

    public void laCorrectaEsLaFalsa(){
        respuestaOpcionFalsa = new RespuestaCorrecta();
        respuestaOpcionVerdadera = new RespuestaIncorrecta();
    }

    public void laCorrectaEsLaVerdadera(){
        respuestaOpcionFalsa = new RespuestaIncorrecta();
        respuestaOpcionVerdadera = new RespuestaCorrecta();
    }

    public Respuesta calificar(OpcionVoF opcion){
        return opcion.opcionSeleccionada(this);
    }

}
