package edu.fiuba.algo3.modelo.Multiplicador;

import edu.fiuba.algo3.modelo.puntaje.Puntaje;
import edu.fiuba.algo3.modelo.puntaje.Puntos;

class MultiploUsable implements  Multiplo{


    @Override
    public int implementar(int multiplo) {
        return multiplo;
    }

    @Override
    public Multiplo activar(Multiplo multiplo) {
        return new MultiploYaUsado();
    }
}
