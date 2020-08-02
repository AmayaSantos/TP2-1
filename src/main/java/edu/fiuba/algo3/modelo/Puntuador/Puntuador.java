package edu.fiuba.algo3.modelo.Puntuador;

import edu.fiuba.algo3.modelo.Calificador.Calificador;
import edu.fiuba.algo3.modelo.Calificador.CalificadorPenalizado;
import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.Opciones.Opcion;
import edu.fiuba.algo3.modelo.Opciones.Opciones;

public class Puntuador {
    private final TipoPuntuador tipo;
    public Puntuador(Calificador calificador){
        tipo= new PuntuadorConExclusividad(calificador);
    }
    public void activarFlexivilidad(){};
    public void puntuar(Jugador jugador1, Jugador jugador2, Opciones opciones){
        tipo.puntuar(jugador1, jugador2, opciones);
    };
}
