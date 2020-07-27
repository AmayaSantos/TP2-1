package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Entrega0.PreguntaVoFTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PruebaUnitariaSeleccion {
    @Test
    public void PruebaUnitaria01ElJugadorDelaSeleccionEsElCorrecto(){

        RespuestaCorrecta respuesta1 = new RespuestaCorrecta("si");
        RespuestaIncorrecta respuesta2 = new RespuestaIncorrecta("para nada");


        PreguntaVoF pregunta = new PreguntaVoF("¿caruso es vende humo?",respuesta1,respuesta2);

        Jugador jugador1 = new Jugador("carlos");
        Jugador jugador2 = new Jugador("juan");

        Seleccion eleccionJugador1 = new Seleccion(jugador1);
        Seleccion eleccionJugador2 = new Seleccion(jugador2);

        eleccionJugador1.agregar(respuesta1);
        eleccionJugador2.agregar(respuesta2);

        assertEquals(eleccionJugador1.jugador(),jugador1);

        /*RondaClasica ronda= new RondaClasica(pregunta);
        ronda.agregarSeleccion(eleccionJugador1);
        ronda.agregarSeleccion(eleccionJugador2);

        ronda.calificar();

        assertEquals(1, jugador2.obtenerPuntaje() );
        assertEquals(1, jugador1.obtenerPuntaje() );
         */
    }
}
