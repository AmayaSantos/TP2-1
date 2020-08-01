package edu.fiuba.algo3.modelo.Calificador;

import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.puntaje.Puntaje;
import edu.fiuba.algo3.modelo.puntaje.PuntoPositivo;
import edu.fiuba.algo3.modelo.puntaje.Puntos;

public class CalificadorParcial extends Calificador {
    @Override
    public Puntaje calificar(Opciones opcionesPregunta, Opciones propuestas){
        Puntos resultado = new Puntos();
        int cantidadDeAciertos=opcionesPregunta.compararParcialmente(propuestas);
        for (int i = 0; i < cantidadDeAciertos; i++){
            resultado.aniadir(new PuntoPositivo());
        }
        return resultado;
    }
}
