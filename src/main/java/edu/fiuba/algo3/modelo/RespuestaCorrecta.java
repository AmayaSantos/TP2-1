package edu.fiuba.algo3.modelo;

public class RespuestaCorrecta implements Respuesta {

    String nombre;

    int puntaje;

    public RespuestaCorrecta(String nombre){
        this.nombre = nombre;
    }

    public RespuestaCorrecta(){

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
        return 1;
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
