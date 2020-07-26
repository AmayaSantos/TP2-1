package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Seleccion {
    Jugador jugador;
    List<Respuesta> misRespuestasCorrectas;
    List<Respuesta> misRespuestasIncorrectas;
    List<Respuesta> misRespuestasOrdenadas;

    public Seleccion(Jugador jugador) {
        this.jugador = jugador;
        this.misRespuestasCorrectas =new ArrayList<>();
        this.misRespuestasIncorrectas =new ArrayList<>();
        this.misRespuestasOrdenadas =new ArrayList<>();
    }

    public void agregar(RespuestaCorrecta respuesta){
        misRespuestasCorrectas.add(respuesta);
    }

    public void agregar(RespuestaIncorrecta respuesta){
        misRespuestasIncorrectas.add(respuesta);
    }

    public void proponer(RespuestaConOrden respuesta,int posicion){

       misRespuestasOrdenadas.add( respuesta.proponer(posicion));
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

    public void calificarOrden(){
        for (Respuesta respuesta: misRespuestasOrdenadas){
            jugador.modificarPuntaje(respuesta.calificar());
        };
    }
}

