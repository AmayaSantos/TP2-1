package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PreguntaVoFPenalizadoTest {
        @Test
        public void preguntaVoFPuedeCrearsePasandoRespuestaCorrectaPenalizada() {
            Respuesta respuestaCorrecta = new RespuestaCorrecta("Verdadero");
            Respuesta respuestaIncorrecta = new RespuestaIncorrectaPenalizada("Falso");
            PreguntaVoF pregunta = new PreguntaVoF("1 + 1 = 2 ", respuestaCorrecta, respuestaIncorrecta);

            assertTrue(pregunta.esCorrecta(respuestaCorrecta));
        }

        @Test
        public void preguntaVoFPenalizadaRecibeRespuestasAsignaCorrectamentePuntajes(){
            Jugador jugador1 = new Jugador("carlos");
            Jugador jugador2 = new Jugador("juan");

            Respuesta respuestaJugador1 = new RespuestaIncorrectaPenalizada("Verdadero");
            Respuesta respuestaJugador2 = new RespuestaCorrecta("Falso");

            Seleccion eleccionJugador1 = new Seleccion(jugador1);
            eleccionJugador1.agregarRespuesta(respuestaJugador1);

            Seleccion eleccionJugador2 = new Seleccion(jugador2);
            eleccionJugador2.agregarRespuesta(respuestaJugador2);

            List<Seleccion> listaRespuestas = new ArrayList<Seleccion> ();
            listaRespuestas.add(eleccionJugador1);
            listaRespuestas.add(eleccionJugador2);

            PreguntaVoF pregunta = new PreguntaVoF("1 + 1 = 2 ", respuestaJugador2, respuestaJugador1);
            pregunta.clasificarRespuesta(listaRespuestas);

            assertEquals(1, jugador2.obtenerPuntaje() );
            assertEquals(-1, jugador1.obtenerPuntaje() );
        }



    }

