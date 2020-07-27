package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class MultipleChoise implements TipoDePregunta {
    ArrayList<Respuesta> respuestasAOpciones;
    ArrayList<Opcion> opciones;
    int respuestasCorrectas;
    public MultipleChoise(ArrayList<Opcion> correctas, ArrayList<Opcion> incorrectas){
        opciones.addAll(correctas);
        opciones.addAll(incorrectas);
        respuestasCorrectas = correctas.size();
        respuestasAOpciones = new ArrayList<Respuesta>();
        for(int i = 0; i < opciones.size(); i++){
            respuestasAOpciones.add(new RespuestaIncorrecta());
        }
        for (Opcion op: correctas
             ) {
            respuestasAOpciones.remove(op.obtenerNumero());
            respuestasAOpciones.add(op.obtenerNumero(), new RespuestaCorrecta());
        }
    }

    @Override
    public Respuesta calificar(ArrayList<Opcion> opciones) {
        return null;
    }
}
