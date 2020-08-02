package edu.fiuba.algo3.modelo.Multiplicador;

import edu.fiuba.algo3.modelo.puntaje.Puntaje;
import edu.fiuba.algo3.modelo.puntaje.Puntos;

public class MultiploYaUsado implements Multiplo{

    @Override
    public int implementar(int multiplo) {
        return 1;
    }

    @Override
    public Multiplo activar(Multiplo multiplo) {
        return new MultiploYaUsado();
    }
}
