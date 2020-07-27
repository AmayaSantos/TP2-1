package edu.fiuba.algo3.modelo;

public class RespuestaCorrecta extends Respuesta {
    public RespuestaCorrecta(String nombre){
        this.nombre = nombre;
    }

    public RespuestaCorrecta(){
        super();
    }

    @Override
    public int calificar() {
        return 1;
    }

    @Override
    public boolean esCorrecta() {
        return true;
    }
}
