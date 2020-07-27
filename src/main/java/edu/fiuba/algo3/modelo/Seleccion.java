package edu.fiuba.algo3.modelo;

import java.util.*;

public class Seleccion {
    Jugador jugador;
    List<Respuesta> misRespuestasCorrectas;
    List<Respuesta> misRespuestasIncorrectas;
    List<RespuestaConOrden> misRespuestasOrdenadas;

    public Seleccion(Jugador jugador) {
        this.jugador = jugador;
        this.misRespuestasCorrectas =new ArrayList<>();
        this.misRespuestasIncorrectas =new ArrayList<>();
        this.misRespuestasOrdenadas = new ArrayList<>();
    }

    public void agregar(RespuestaCorrecta respuesta){
        misRespuestasCorrectas.add(respuesta);
    }

    public void agregar(RespuestaIncorrecta respuesta){
        misRespuestasIncorrectas.add(respuesta);
    }

    public void proponer(RespuestaConOrden respuesta,int posicion){

       misRespuestasOrdenadas.add(respuesta.proponer(posicion));

    }

    public Jugador jugador() {
        return jugador;
    }

    ////ClasificacionPenalizada
    public void calificar(){

        for (Respuesta respuesta: misRespuestasCorrectas){
            jugador.modificarPuntaje(respuesta.calificar());
        };
        for (Respuesta respuesta: misRespuestasIncorrectas){
            jugador.modificarPuntaje(respuesta.calificar());
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
    public void calificarTemporalmente(List<Respuesta> respuestas) {
        if (misRespuestasIncorrectas.isEmpty()){
            if (misRespuestasCorrectas.equals(respuestas)){
                jugador.modificarPuntajeTemporal(1);
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
    public void calificarParcialTemporalmente() {
        if (misRespuestasIncorrectas.isEmpty()){
            for (Respuesta respuesta: misRespuestasCorrectas){
                jugador.modificarPuntajeTemporal(respuesta.calificar());
            };
        }
    }

    public void calificarOrden(){
        for (RespuestaConOrden respuesta: misRespuestasOrdenadas){
            jugador.modificarPuntaje(respuesta.calificar());
        };
    }

    public void calificarOrdenTemporal() {
        for (RespuestaConOrden respuesta: misRespuestasOrdenadas){
            jugador.modificarPuntajeTemporal(respuesta.calificar());
        };
    }

}

