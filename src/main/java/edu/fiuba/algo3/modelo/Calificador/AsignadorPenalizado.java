package edu.fiuba.algo3.modelo.Calificador;

import edu.fiuba.algo3.modelo.Calificador.Calificador;
import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.puntaje.Puntaje;
import edu.fiuba.algo3.modelo.puntaje.PuntoNegativo;
import edu.fiuba.algo3.modelo.puntaje.PuntoPositivo;
import edu.fiuba.algo3.modelo.puntaje.Puntos;


public class AsignadorPenalizado extends Calificador {

    @Override
    public Puntaje calificar(Opciones correctas, Opciones elegidas) {

        Puntos puntajeParcial = new Puntos();
        for (String opcionElegida: elegidas.obtenerOpciones()) {
            if(correctas.esta(opcionElegida)){
                puntajeParcial.aniadir(new PuntoPositivo());
            }
            else {
                puntajeParcial.aniadir(new PuntoNegativo());
            }
        }
        return puntajeParcial;

    }
}
