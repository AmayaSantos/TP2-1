package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class RondaClasica extends RondasConExclusividad{
    Pregunta pregunta;
    public RondaClasica(Pregunta pregunta){
        this.pregunta=pregunta;
    }

    @Override
    public void calificar() {
        for (Seleccion seleccion: selecciones){

            seleccion.calificar(pregunta.obtenerRespuestasCorrectas());
        }
    }

    @Override
    public void calificarTemporalmente() {
        for (Seleccion seleccion: selecciones){

            seleccion.calificarTemporalmente(pregunta.obtenerRespuestasCorrectas());
        }
    }

}
