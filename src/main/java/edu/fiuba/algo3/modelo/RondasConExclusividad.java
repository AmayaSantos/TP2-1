package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class RondasConExclusividad extends Ronda {

    public abstract void calificar();
    public abstract void calificarTemporalmente();

    private boolean comprobarImplementacionExclusividad() {
        List puntajesTemporales= new ArrayList();
        for (Seleccion selecion : selecciones) {
             puntajesTemporales.add(selecion.jugador.puntajeTemporal == 0);
        }
        return puntajesTemporales.contains(0);
    }
    public void calificar(Multiplicadores multiplicadores){
        this.calificarTemporalmente();
        if (comprobarImplementacionExclusividad()==true){
            multiplicadores.habilitarExclusividad();
        }
        this.calificar();
    }



}
