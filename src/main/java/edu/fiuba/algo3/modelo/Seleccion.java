package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Seleccion {
    Jugador jugador;
    List<Respuesta> misRespuestasCorrectas;
    List<Respuesta> misRespuestasIncorrectas;

    public Seleccion(Jugador jugador) {
        this.jugador = jugador;
        this.misRespuestasCorrectas =new ArrayList<>();
        this.misRespuestasIncorrectas =new ArrayList<>();
    }
    public void agregar(RespuestaCorrecta respuesta){
        misRespuestasCorrectas.add(respuesta);
    }
    public void agregar(RespuestaIncorrecta respuesta){
        misRespuestasIncorrectas.add(respuesta);
    }

    public Jugador jugador() {
        return jugador;
    }
    ////ClasificacionPenalizada

    public void calificar(int multiplicador){

        for (Respuesta respuesta: misRespuestasCorrectas){
            jugador.modificarPuntaje(respuesta.calificar()*multiplicador);
        };
        for (Respuesta respuesta: misRespuestasIncorrectas){
            jugador.modificarPuntaje(respuesta.calificar()*multiplicador);
        };
    }
    ///clsificacion Clasica
    public void calificar(List<Respuesta> respuestas) {
        if (misRespuestasIncorrectas.isEmpty()){
            if (misRespuestasCorrectas.equals(respuestas)){
            jugador.modificarPuntaje(1);
            }
        }
    }
    ///clasificacion Parcial

    public void calificarParcial() {
        if (misRespuestasIncorrectas.isEmpty()){
            for (Respuesta respuesta: misRespuestasCorrectas){
                jugador.modificarPuntaje(respuesta.calificar());
            };
        }
    }
}

