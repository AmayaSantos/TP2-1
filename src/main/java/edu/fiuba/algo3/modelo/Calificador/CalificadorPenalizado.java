package edu.fiuba.algo3.modelo.Calificador;

import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.puntaje.Puntaje;
import edu.fiuba.algo3.modelo.puntaje.PuntoNegativo;
import edu.fiuba.algo3.modelo.puntaje.PuntoPositivo;
import edu.fiuba.algo3.modelo.puntaje.Puntos;

public class CalificadorPenalizado extends Calificador{


    @Override
    public Puntaje calificar(Opciones opcionesPregunta, Opciones propuesta) {
        Puntos resultado = new Puntos();
        int cantidadDeAciertos=opcionesPregunta.compararPositivamente(propuesta);
        for (int i = 0; i < cantidadDeAciertos; i++){
            resultado.aniadir(new PuntoPositivo());
        }
        int cantidadDesAciertos=opcionesPregunta.compararNegativamente(propuesta);
        for (int i = 0; i < cantidadDesAciertos; i++){
            resultado.aniadir(new PuntoNegativo());
        }

        return resultado;
    }
}
