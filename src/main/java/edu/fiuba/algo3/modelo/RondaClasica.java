package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class RondaClasica {
    Pregunta pregunta;
    List<Seleccion> selecciones;
    public RondaClasica(Pregunta pregunta){
        this.pregunta=pregunta;
        selecciones=new ArrayList<>();
    }

    public void agregarSeleccion(Seleccion seleccion) {
        selecciones.add(seleccion);
    }

    public void clasificar() {
        for (Seleccion seleccion: selecciones){
            pregunta.clasificar(seleccion);
        }
    }
}
