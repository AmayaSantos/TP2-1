package edu.fiuba.algo3.modelo;

public class RespuestaCorrecta extends Respuesta {
    public RespuestaCorrecta(String nombre){
        this.nombre = nombre;
    }

    @Override
    public int calificar() {
        return 1;
    }


}
