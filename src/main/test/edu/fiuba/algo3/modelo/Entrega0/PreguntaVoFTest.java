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
        RespuestaCorrecta respuestaCorrecta = new RespuestaCorrecta("Verdadero");
        RespuestaIncorrecta respuestaIncorrecta = new RespuestaIncorrecta("Falso");
        PreguntaVoF pregunta = new PreguntaVoF("1 + 1 = 2 ", respuestaCorrecta, respuestaIncorrecta);

       //assertTrue(pregunta.esCorrecta(respuestaCorrecta));
    }
    @Test
    public void preguntaVoFPuedeCrearsePasandoRespuestaCorrectaSinOrden() {
        RespuestaCorrecta respuestaCorrecta = new RespuestaCorrecta("Verdadero");
        RespuestaIncorrecta respuestaIncorrecta = new RespuestaIncorrecta("Falso");
        PreguntaVoF pregunta = new PreguntaVoF("1 + 1 = 2 ", respuestaIncorrecta, respuestaCorrecta);

       // assertTrue(pregunta.esCorrecta(respuestaCorrecta));
    }

    @Test
    public void preguntaVoFRecibeRespuestasAsignaCorrectamentePuntajes(){
        Jugador jugador1 = new Jugador("carlos");
        Jugador jugador2 = new Jugador("juan");

        RespuestaIncorrecta respuestaJugador1 = new RespuestaIncorrecta("Verdadero");
        RespuestaCorrecta respuestaJugador2 = new RespuestaCorrecta("Falso");

        Seleccion eleccionJugador1 = new Seleccion(jugador1);
        eleccionJugador1.agregar(respuestaJugador1);
        Seleccion eleccionJugador2 = new Seleccion(jugador2);
        eleccionJugador2.agregar(respuestaJugador2);

        List listaRespuestas = new ArrayList();
        listaRespuestas.add(eleccionJugador1);
        listaRespuestas.add(eleccionJugador2);

        PreguntaVoF pregunta = new PreguntaVoF("1 + 1 = 2 ", respuestaJugador2, respuestaJugador1);

        RondaClasica ronda= new RondaClasica(pregunta);
        ronda.agregarSeleccion(eleccionJugador1);
        ronda.agregarSeleccion(eleccionJugador2);

        ronda.clasificar();

        assertEquals(1, jugador2.obtenerPuntaje() );
        assertEquals(0, jugador1.obtenerPuntaje() );
    }
    @Test
    public void preguntaVoFRecibeRespuestasAsignaCorrectamentePuntajesSinOrden(){
        Jugador jugador1 = new Jugador("carlos");
        Jugador jugador2 = new Jugador("juan");

        RespuestaIncorrecta respuestaJugador1 = new RespuestaIncorrecta("Verdadero");
        RespuestaCorrecta respuestaJugador2 = new RespuestaCorrecta("Falso");

        Seleccion eleccionJugador1 = new Seleccion(jugador1);
        eleccionJugador1.agregar(respuestaJugador1);
        Seleccion eleccionJugador2 = new Seleccion(jugador2);
        eleccionJugador2.agregar(respuestaJugador2);

        List listaRespuestas = new ArrayList();
        listaRespuestas.add(eleccionJugador1);
        listaRespuestas.add(eleccionJugador2);

        PreguntaVoF pregunta = new PreguntaVoF("1 + 1 = 2 ", respuestaJugador1, respuestaJugador2);

        RondaClasica ronda= new RondaClasica(pregunta);
        ronda.agregarSeleccion(eleccionJugador1);
        ronda.agregarSeleccion(eleccionJugador2);

        ronda.clasificar();
        assertEquals(1, jugador2.obtenerPuntaje() );
        assertEquals(0, jugador1.obtenerPuntaje() );
    }


}
