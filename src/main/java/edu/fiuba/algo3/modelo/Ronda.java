package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class Ronda {

    List<Seleccion> selecciones = new ArrayList<>();

    public void agregarSeleccion(Seleccion seleccion) {
        selecciones.add(seleccion);
    }

    public abstract void calificar();
}
