package edu.fiuba.algo3.modelo.Calificador;

import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.puntaje.Puntaje;
import edu.fiuba.algo3.modelo.puntaje.PuntoPositivo;
import edu.fiuba.algo3.modelo.puntaje.Puntos;

public class CalificadorClasico extends Calificador {

    @Override
    public Puntaje calificar(Opciones opcionesPregunta, Opciones propuesta) {
        Puntos puntosRetornados= new Puntos();
        if (opcionesPregunta.compararClasicomente(propuesta)==true){
            puntosRetornados.aniadir(new PuntoPositivo());
        }
        return puntosRetornados;
    }
}
