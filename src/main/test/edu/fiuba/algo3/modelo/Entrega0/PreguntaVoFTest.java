package edu.fiuba.algo3.modelo.Entrega0;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PreguntaVoFTest {
    @Test
    public void preguntaVoFPuedeCrearsePasandoRespuestaCorrecta() {
        Respuesta respuestaCorrecta = new RespuestaCorrecta("Verdadero");
        Respuesta respuestaIncorrecta = new RespuestaIncorrecta("Falso");
        PreguntaVoF pregunta = new PreguntaVoF("1 + 1 = 2 ", respuestaCorrecta, respuestaIncorrecta);

        assertTrue(pregunta.esCorrecta(respuestaCorrecta));
    }

    @Test
    public void preguntaVoFRecibeRespuestasAsignaCorrectamentePuntajes(){
        Jugador jugador1 = new Jugador("carlos");
        Jugador jugador2 = new Jugador("juan");

        Respuesta respuestaJugador1 = new RespuestaIncorrecta("Verdadero");
        Respuesta respuestaJugador2 = new RespuestaCorrecta("Falso");

        Seleccion eleccionJugador1 = new Seleccion(respuestaJugador1,jugador1);
        Seleccion eleccionJugador2 = new Seleccion(respuestaJugador2,jugador2);

        List listaRespuestas = new ArrayList();
        listaRespuestas.add(eleccionJugador1);
        listaRespuestas.add(eleccionJugador2);

        PreguntaVoF pregunta = new PreguntaVoF("1 + 1 = 2 ", respuestaJugador2, respuestaJugador1);
        pregunta.clasificarRespuesta(listaRespuestas);

        assertEquals(1, jugador2.obtenerPuntaje() );
        assertEquals(0, jugador1.obtenerPuntaje() );
    }



}
