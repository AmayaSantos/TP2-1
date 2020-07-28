package edu.fiuba.algo3.modelo;

public class RespuestaIncorrecta implements Respuesta {
    String nombre;
    int puntaje;

    public RespuestaIncorrecta(String nombre){
        this.nombre = nombre;
    }
    public RespuestaIncorrecta(){

    }
    public RespuestaIncorrecta(int puntajeInicial){
        puntaje = puntajeInicial;
    }

    @Override
    public String nombre() {
        return null;
    }

    @Override
    public int calificar() {
        return 1;
    }

    @Override
    public int puntaje(){
        return 0;
    }

    @Override
    public void vs(Respuesta respuesta) {
        respuesta.vs(this);
    }

    @Override
    public void vs(RespuestaCorrecta respuesta) {
        respuesta.vs(this);
    }

    @Override
    public void vs(RespuestaIncorrecta respuesta) {

    }
}
