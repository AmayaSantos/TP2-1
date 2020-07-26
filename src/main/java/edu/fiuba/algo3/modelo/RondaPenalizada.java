package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class RondaPenalizada  extends Ronda{

    public RondaPenalizada() {
            selecciones=new ArrayList<>();
    }

    @Override
    public void clasificar() {
        for (Seleccion seleccion: selecciones){
            seleccion.calificar();
        }
    }
}
