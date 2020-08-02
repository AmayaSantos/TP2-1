package edu.fiuba.algo3.modelo.Puntuador;

import edu.fiuba.algo3.modelo.Calificador.*;
import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.puntaje.Puntaje;

public class PuntuadorConExclusividad implements TipoPuntuador {
    protected Calificador calificador;
    public PuntuadorConExclusividad(Calificador calificador){
        this.calificador= calificador;
    }

    @Override
    public void activarFlexivilidad() {

    }

    @Override
    public void puntuar(Jugador jugador1, Jugador jugador2, Opciones opciones) {
        Puntaje puntaje=calificador.calificar(opciones,jugador1.obtenerRespuestas());
        jugador1.agregarPuntaje(puntaje);
        puntaje=calificador.calificar(opciones,jugador2.obtenerRespuestas());
        jugador2.agregarPuntaje(puntaje);
    }
}
