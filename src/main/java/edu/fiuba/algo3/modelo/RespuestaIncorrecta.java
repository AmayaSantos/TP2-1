package edu.fiuba.algo3.modelo;

public class RespuestaIncorrecta extends Respuesta {
    public RespuestaIncorrecta(String nombre){
        this.nombre = nombre;
    }

    @Override
    public int calificar() {
        return 0;
    }
}
