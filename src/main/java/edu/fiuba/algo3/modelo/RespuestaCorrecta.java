package edu.fiuba.algo3.modelo;

public class RespuestaCorrecta implements Respuesta {

    String nombre;

    int puntaje;

    public RespuestaCorrecta(String nombre){
        this.nombre = nombre;
        puntaje = 1;
    }

    public RespuestaCorrecta(){
        puntaje = 1;
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
        return puntaje;
    }

    @Override
    public void vs(Respuesta respuesta) {
        respuesta.vs(this);
    }

    @Override
    public void vs(RespuestaCorrecta respuesta) {

    }

    @Override
    public void vs(RespuestaIncorrecta respuesta) {
        puntaje= puntaje*2;
    }

}
