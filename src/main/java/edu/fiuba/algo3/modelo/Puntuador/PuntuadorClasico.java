package edu.fiuba.algo3.modelo.Puntuador;

import edu.fiuba.algo3.modelo.Calificador.Calificador;
import edu.fiuba.algo3.modelo.Calificador.CalificadorPenalizado;
import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.Opciones.Opciones;

public class PuntuadorClasico implements TipoPuntuador {
    protected Calificador calificador;
    public PuntuadorClasico(CalificadorPenalizado calificador){
        this.calificador= calificador;
    }
    @Override
    public void activarFlexivilidad() {

    }

    @Override
    public void puntuar(Jugador jugador1, Jugador jugador2, Opciones opciones) {

    }
}
