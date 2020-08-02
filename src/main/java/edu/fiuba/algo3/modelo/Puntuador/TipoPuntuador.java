package edu.fiuba.algo3.modelo.Puntuador;

import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.Opciones.Opciones;

interface TipoPuntuador {

   void activarFlexivilidad();
   void puntuar(Jugador jugador1, Jugador jugador2, Opciones opciones);
}
