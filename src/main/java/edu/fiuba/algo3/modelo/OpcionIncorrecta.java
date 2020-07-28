package edu.fiuba.algo3.modelo;

public class OpcionIncorrecta implements Opcion {
    int penalizacion;

    public OpcionIncorrecta(int penalizacion){
        this.penalizacion = penalizacion;
    }

    @Override
    public int calificar() {
        return -1*penalizacion;
    }

    @Override
    public boolean esCorrecta() {
        return false;
    }
}
