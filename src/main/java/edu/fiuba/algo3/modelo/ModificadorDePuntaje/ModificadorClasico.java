package edu.fiuba.algo3.modelo.ModificadorDePuntaje;

import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.puntaje.PuntoNegativo;
import edu.fiuba.algo3.modelo.puntaje.PuntoNulo;
import edu.fiuba.algo3.modelo.puntaje.PuntoPositivo;

public class ModificadorClasico implements ModificadorPuntaje{

    @Override
    public void modificarPuntaje(int cantidadRespuestasCorrectas, int cantidadRespuestasIncorrectas, Jugador jugador){
        if (cantidadRespuestasIncorrectas == 0){
            jugador.agregarPuntaje(new PuntoPositivo());
        }else jugador.agregarPuntaje((new PuntoNulo()));
    }
}
