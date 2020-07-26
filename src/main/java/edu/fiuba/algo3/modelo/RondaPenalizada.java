package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class RondaPenalizada  extends Ronda{
    @Override
    public void calificar() {
        for (Seleccion seleccion: selecciones){
            seleccion.calificar(seleccion.jugador.multiplicador());
        }
    }
}
