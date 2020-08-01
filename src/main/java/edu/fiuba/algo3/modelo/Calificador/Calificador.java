package edu.fiuba.algo3.modelo.Calificador;

import edu.fiuba.algo3.modelo.Opciones.Opcion;
import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.puntaje.Puntaje;

public abstract class Calificador {

    public abstract Puntaje calificar(Opciones opcionesPregunta, Opciones propuesta);

}
