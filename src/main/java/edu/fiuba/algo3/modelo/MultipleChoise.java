package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Hashtable;

public class MultipleChoise implements TipoDePregunta {
    Hashtable<Opcion, Racha> rachaHashtable;
    int respuestasCorrectas;
    Respuesta respuestaFinal;
    Racha racha;

    public MultipleChoise(ArrayList<Opcion> correctas, ArrayList<Opcion> incorrectas){
        respuestasCorrectas = 0;
        for (Opcion op: correctas
             ) {
            rachaHashtable.put(op, new EnRacha(0));
            respuestasCorrectas++;
        }
        for (Opcion op: incorrectas
             ) {
            rachaHashtable.put(op, new RachaRota(0));
        }
        respuestaFinal = new RespuestaCorrecta(0);
    }

    @Override
    public Respuesta calificar(ArrayList<Opcion> opciones) {
        verificarRacha(opciones);
        return null;
    }

    protected void verificarRacha(ArrayList<Opcion> opciones){
        for (Opcion op: opciones
        ) {
            racha.verificar(rachaHashtable.get(op));
        }
    }



}
