package edu.fiuba.algo3.modelo;

public class RespuestaCorrecta extends Respuesta {
    public RespuestaCorrecta(String nombre){
        this.nombre = nombre;
    }

    public RespuestaCorrecta(){

    }
    @Override
    public int calificar() {
        return 1;
    }

    @Override
    public boolean esCorrecta() {
        return true;
    }

    @Override
    public int puntaje(){
        return 1;
    }

}
