package edu.fiuba.algo3.modelo;

import java.util.List;

public abstract class Ronda {
    Pregunta pregunta;
    List<Seleccion> selecciones;
    public void agregarSeleccion(Seleccion seleccion) {
        selecciones.add(seleccion);
    }

    public abstract void clasificar();
}
