package edu.fiuba.algo3.modelo.ModificadorDePuntaje;

import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.puntaje.PuntoNegativo;
import edu.fiuba.algo3.modelo.puntaje.PuntoPositivo;

public  class ModificadorPenalizado implements ModificadorPuntaje{

    @Override
    public void modificarPuntaje(int cantidadRespuestasCorrectas, int cantidadRespuestasIncorrectas, Jugador jugador){
        for(int i = 0; i <= cantidadRespuestasCorrectas; i = i + 1){
            jugador.agregarPuntaje(new PuntoPositivo());
        }
        for(int i = 0; i <= cantidadRespuestasIncorrectas; i = i + 1){
            jugador.agregarPuntaje(new PuntoNegativo());
        }

    }
}
