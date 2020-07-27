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

        ronda.calificar();

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

        ronda.calificar();
        assertEquals(1, jugador2.obtenerPuntaje() );
        assertEquals(0, jugador1.obtenerPuntaje() );
    }

    @Test
    public void preguntaVoFRecibeRespuestasEnGranEscalaYAsignaCorrectamentePuntajes() {

        Jugador jugador1 = new Jugador("carlos");
        Jugador jugador2 = new Jugador("juan");
        Jugador jugador3 = new Jugador("pablo");
        Jugador jugador4 = new Jugador("fernando");
        Jugador jugador5 = new Jugador("santos");
        Jugador jugador6 = new Jugador("matias");
        Jugador jugador7 = new Jugador("gabriel");

        RespuestaIncorrecta respuestaIncorrecta = new RespuestaIncorrecta("Falso");
        RespuestaCorrecta respuestaCorrecta = new RespuestaCorrecta("Verdadero");

        Seleccion eleccionJugador1 = new Seleccion(jugador1);
        eleccionJugador1.agregar(respuestaIncorrecta);

        Seleccion eleccionJugador2 = new Seleccion(jugador2);
        eleccionJugador2.agregar(respuestaCorrecta);

        Seleccion eleccionJugador3 = new Seleccion(jugador3);
        eleccionJugador3.agregar(respuestaIncorrecta);

        Seleccion eleccionJugador4 = new Seleccion(jugador4);
        eleccionJugador4.agregar(respuestaCorrecta);

        Seleccion eleccionJugador5 = new Seleccion(jugador5);
        eleccionJugador5.agregar(respuestaIncorrecta);

        Seleccion eleccionJugador6 = new Seleccion(jugador6);
        eleccionJugador6.agregar(respuestaCorrecta);

        Seleccion eleccionJugador7 = new Seleccion(jugador7);
        eleccionJugador7.agregar(respuestaIncorrecta);

        PreguntaVoF pregunta = new PreguntaVoF("1 + 1 = 2 ", respuestaIncorrecta, respuestaCorrecta);

        RondaClasica ronda= new RondaClasica(pregunta);
        ronda.agregarSeleccion(eleccionJugador1);
        ronda.agregarSeleccion(eleccionJugador2);
        ronda.agregarSeleccion(eleccionJugador3);
        ronda.agregarSeleccion(eleccionJugador4);
        ronda.agregarSeleccion(eleccionJugador5);
        ronda.agregarSeleccion(eleccionJugador6);
        ronda.agregarSeleccion(eleccionJugador7);

        ronda.calificar();
        assertEquals(0, jugador1.obtenerPuntaje() );
        assertEquals(1, jugador2.obtenerPuntaje() );
        assertEquals(0, jugador3.obtenerPuntaje() );
        assertEquals(1, jugador4.obtenerPuntaje() );
        assertEquals(0, jugador5.obtenerPuntaje() );
        assertEquals(1, jugador6.obtenerPuntaje() );
        assertEquals(0, jugador7.obtenerPuntaje() );

    }
}
