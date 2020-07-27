package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class RondaOrdered extends RondasConExclusividad{
    public RondaOrdered(){
        this.selecciones= new ArrayList<>();
    }
    @Override
    public void calificar() {
        for (Seleccion seleccion: selecciones){
            seleccion.calificarOrden();
        }
    }

    @Override
    public void calificarTemporalmente() {
        for (Seleccion seleccion: selecciones){
            seleccion.calificarOrdenTemporal();
        }
    }
}
