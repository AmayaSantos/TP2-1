package edu.fiuba.algo3.modelo.Calificador;

import edu.fiuba.algo3.modelo.Calificador.Calificador;
import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.puntaje.Puntaje;
import edu.fiuba.algo3.modelo.puntaje.PuntoNegativo;

public class AsignadorPenalizado extends Calificador {

    @Override
    public Puntaje calificar(Opciones correctas, Opciones elegidas) {
        return new PuntoNegativo();
    }
}
