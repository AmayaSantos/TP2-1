package edu.fiuba.algo3.modelo.Calificador;

import edu.fiuba.algo3.modelo.Opciones.Opcion;
import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.puntaje.Puntaje;
import edu.fiuba.algo3.modelo.puntaje.PuntoPositivo;
import edu.fiuba.algo3.modelo.puntaje.Puntos;

public class CalificadorOrder extends Calificador {
    @Override
    public Puntaje calificar(Opciones opcionesPregunta, Opciones propuestas){
        Puntos resultado = new Puntos();
        if (opcionesPregunta.compararOrdenadamente(propuestas)){
            resultado.aniadir(new PuntoPositivo());
            }
        return resultado;
    }
}

