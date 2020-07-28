package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class RondaClasica extends Ronda{
    public RondaClasica(Pregunta pregunta){
        this.pregunta=pregunta;
    }

    @Override
    public void calificar() {
        for (Seleccion seleccion: selecciones){
            seleccion.calificar(pregunta.obtenerRespuestasCorrectas());
        }
    }
}
