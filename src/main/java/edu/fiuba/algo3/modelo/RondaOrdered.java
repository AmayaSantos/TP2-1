package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class RondaOrdered extends Ronda{
    public RondaOrdered(){
        this.selecciones= new ArrayList<>();
    }
    @Override
    public void clasificar() {
        for (Seleccion seleccion: selecciones){
            seleccion.calificarOrden();
        }
    }
}
