package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Hashtable;

public class MultipleChoise implements TipoDePregunta {
    Hashtable rachaHashtable;
    ArrayList<Respuesta> respuestas;
    int respuestasCorrectas;
    Respuesta respuestaFinal;
    Racha racha;

    public MultipleChoise(ArrayList<Opcion> correctas, ArrayList<Opcion> incorrectas){
        racha = new EnRacha(0);
        respuestas = new ArrayList<Respuesta>();
        respuestasCorrectas = 0;
        rachaHashtable = new Hashtable();
        for (Opcion op: correctas
             ) {
            rachaHashtable.put(op.obtenerNumero(), new EnRacha(0));
            respuestasCorrectas++;
            respuestas.add(new RespuestaIncorrecta());
        }
        for (Opcion op: incorrectas
             ) {
            rachaHashtable.put(op.obtenerNumero(), new RachaRota(0));
            respuestas.add(new RespuestaIncorrecta());
        }
        respuestas.add(respuestasCorrectas, new RespuestaCorrecta());
    }

    @Override
    public Respuesta calificar(ArrayList<Opcion> opciones) {
        verificarRacha(opciones);
        return racha.definirRespuesta(respuestas);
    }

    protected void verificarRacha(ArrayList<Opcion> opciones){
        for (Opcion op: opciones
        ) {
            racha = racha.verificar((Racha) rachaHashtable.get(op.obtenerNumero()));
        }
    }



}
