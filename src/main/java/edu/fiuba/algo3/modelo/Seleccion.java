package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Seleccion {
    String respuesta;
    Jugador jugador;
    List<Respuesta> misRespuestasCorrectas = new ArrayList<>();
    List<Respuesta> misRespuestasIncorrectas = new ArrayList<>();
    List<Respuesta> misRespuestasOrdenadas = new ArrayList<>();

    public Seleccion(Jugador jugador) {
        this.jugador = jugador;
    }

    public Seleccion(Jugador jugador, String respuesta) {
        this.jugador = jugador;
        this.respuesta = respuesta;
    }

    public void agregar(RespuestaCorrecta respuesta){
        misRespuestasCorrectas.add(respuesta);
    }

    public void agregar(RespuestaIncorrecta respuesta){
        misRespuestasIncorrectas.add(respuesta);
    }

    public void proponer(RespuestaConOrden respuesta,int posicion){
        misRespuestasOrdenadas.add(new RespuestaConOrden(respuesta,posicion));
    }

    public Jugador jugador() {
        return jugador;
    }

    public void calificar(HashMap<String, Respuesta> respuestas){
        Respuesta respuestaEscogida = respuestas.get(respuesta);
        jugador.modificarPuntaje(respuestaEscogida.calificar());
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

    public void calificarOrden(){
        for (Respuesta respuesta: misRespuestasOrdenadas){
            jugador.modificarPuntaje(respuesta.calificar());
        };
    }
}

