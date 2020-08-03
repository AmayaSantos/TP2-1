package edu.fiuba.algo3.modelo.Calificador;

import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.puntaje.Puntaje;
import edu.fiuba.algo3.modelo.puntaje.PuntoNulo;
import edu.fiuba.algo3.modelo.puntaje.PuntoPositivo;

public class ComparadorConOrden extends Calificador{

    public ComparadorConOrden(Calificador calificador) {
        siguienteCalificador = calificador;
    }

    @Override
    public Puntaje calificar(Opciones correctas, Opciones elegidas) {
        if(correctas.compararConOrden(elegidas)){
            return (new PuntoPositivo());
        }else{
            return siguienteCalificador.calificar(correctas, elegidas);
        }
    }
}
