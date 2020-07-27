package edu.fiuba.algo3.modelo;

public class OpcionCorrecta implements Opcion {
    @Override
    public int calificar() {
        return 1;
    }

    @Override
    public boolean esCorrecta() {
        return true;
    }
}
