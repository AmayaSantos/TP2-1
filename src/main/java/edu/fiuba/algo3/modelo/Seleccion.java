package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Seleccion {
    Jugador jugador;
    List<Respuesta> misRespuestasCorrestas;
    List<Respuesta> misRespuestasIncorrestas;

    public Seleccion(Jugador jugador) {
        this.jugador = jugador;
        this.misRespuestasCorrestas =new ArrayList<>();
        this.misRespuestasIncorrestas =new ArrayList<>();
    }
    public void agregar(RespuestaCorrecta respuesta){
        misRespuestasCorrestas.add(respuesta);
    }
    public void agregar(RespuestaIncorrecta respuesta){
        misRespuestasIncorrestas.add(respuesta);
    }

    public Jugador jugador() {
        return jugador;
    }
    ////ClasificacionPenalizada

    public void calificar(int multiplicador){

        for (Respuesta respuesta: misRespuestasCorrestas){
            jugador.modificarPuntaje(respuesta.calificar()*multiplicador);
        };
        for (Respuesta respuesta: misRespuestasIncorrestas){
            jugador.modificarPuntaje(respuesta.calificar()*multiplicador);
        };
    }
    ///clsificacion Clasica
    public void calificar(List<Respuesta> respuestas) {
        if (misRespuestasIncorrestas.isEmpty()){
            if (misRespuestasCorrestas.equals(respuestas)){
            jugador.modificarPuntaje(1);
            }
        }
    }
///clasificacion Parcial
    public void calificarParcial() {
        if (misRespuestasIncorrestas.isEmpty()){
            for (Respuesta respuesta: misRespuestasCorrestas){
                jugador.modificarPuntaje(respuesta.calificar());
            };
        }
    }
}
