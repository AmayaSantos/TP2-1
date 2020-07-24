package edu.fiuba.algo3.modelo;

public class RespuestaIncorrectaPenalizada extends Respuesta {

    public RespuestaIncorrectaPenalizada(String nombre){
        this.nombre = nombre;
    }
    @Override
    public int calificar() {
        return -1;
    }

    @Override
    public boolean esCorrecta() {
        return false;
    }

    @Override
    public int puntaje() {
        return -1;
    }
}

