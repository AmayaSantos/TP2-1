package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PreguntaVoFPenalizadoTest {
        @Test
        public void preguntaVoFPuedeCrearsePasandoRespuestaCorrectaPenalizada() {
            RespuestaCorrecta respuestaCorrecta = new RespuestaCorrecta("Verdadero");
            RespuestaIncorrecta respuestaIncorrecta = new RespuestaIncorrecta("Falso");
            PreguntaVoF pregunta = new PreguntaVoF("1 + 1 = 2 ", respuestaCorrecta, respuestaIncorrecta);

            //assertTrue(pregunta.esCorrecta(respuestaCorrecta));
        }

        @Test
        public void preguntaVoFPenalizadaRecibeRespuestasAsignaCorrectamentePuntajes(){
            Jugador jugador1 = new Jugador("carlos");
            Jugador jugador2 = new Jugador("juan");

            RespuestaIncorrecta respuestaJugador1 = new RespuestaIncorrecta("Verdadero");
            RespuestaCorrecta respuestaJugador2 = new RespuestaCorrecta("Falso");

            Seleccion eleccionJugador1 = new Seleccion(jugador1);
            eleccionJugador1.agregar(respuestaJugador1);
            Seleccion eleccionJugador2 = new Seleccion(jugador2);
            eleccionJugador2.agregar(respuestaJugador2);

            PreguntaVoF pregunta = new PreguntaVoF("1 + 1 = 2 ", respuestaJugador2, respuestaJugador1);

            RondaPenalizada ronda= new RondaPenalizada();
            ronda.agregarSeleccion(eleccionJugador1);
            ronda.agregarSeleccion(eleccionJugador2);

            ronda.calificar();

            assertEquals(1, jugador2.obtenerPuntaje() );
            assertEquals(-1, jugador1.obtenerPuntaje() );
        }

        @Test
        public void preguntaVoFPenalizadaConMultiplicadorRecibeRespuestasAsignaCorrectamentePuntajes(){

            Jugador jugador1 = new Jugador("carlos");
            Jugador jugador2 = new Jugador("juan");

            jugador1.activarMultiplicadorX2();
            jugador2.activarMultiplicadorX3();

            RespuestaIncorrecta respuestaJugador1 = new RespuestaIncorrecta("Verdadero");
            RespuestaCorrecta respuestaJugador2 = new RespuestaCorrecta("Falso");

            Seleccion eleccionJugador1 = new Seleccion(jugador1);
            eleccionJugador1.agregar(respuestaJugador1);
            Seleccion eleccionJugador2 = new Seleccion(jugador2);
            eleccionJugador2.agregar(respuestaJugador2);

            PreguntaVoF pregunta = new PreguntaVoF("1 + 1 = 2 ", respuestaJugador2, respuestaJugador1);

            RondaPenalizada ronda= new RondaPenalizada();
            ronda.agregarSeleccion(eleccionJugador1);
            ronda.agregarSeleccion(eleccionJugador2);

            ronda.calificar();

            assertEquals(3, jugador2.obtenerPuntaje() );
            assertEquals(-2, jugador1.obtenerPuntaje() );
    }
}

