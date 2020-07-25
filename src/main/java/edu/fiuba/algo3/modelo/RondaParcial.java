package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class RondaParcial {
    Pregunta pregunta;
    List<Seleccion> selecciones;
    public RondaParcial(Pregunta pregunta) {
        this.pregunta=pregunta;
        selecciones=new ArrayList<>();
    }
    public void agregarSeleccion(Seleccion seleccion) {
        selecciones.add(seleccion);
    }
    public void clasificar() {
        for (Seleccion seleccion: selecciones){
            seleccion.calificarParcial();
        }
    }


}