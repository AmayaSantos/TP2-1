package edu.fiuba.algo3.modelo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class PreguntaMultipleChoiceParcialTest {

    @Test

    public void preguntaMultipleChoiceRecibeRespuestasAsignaCorrectamentePuntajes() {
        Jugador jugador1 = new Jugador("carlos");
        Jugador jugador2 = new Jugador("juan");

        Respuesta respuesta1Jugador1 = new RespuestaIncorrecta("2");
        Respuesta respuesta2Jugador1 = new RespuestaIncorrecta("3");
        Respuesta respuesta1Jugador2 = new RespuestaCorrecta("1");
        Respuesta respuesta2Jugador2 = new RespuestaCorrecta("-1");
        Respuesta respuesta3Jugador2 = new RespuestaIncorrecta("2");

        List<Respuesta> listaRespuestasCorrectas = new ArrayList<Respuesta>();
        listaRespuestasCorrectas.add(respuesta1Jugador2);
        listaRespuestasCorrectas.add(respuesta2Jugador2);

        Seleccion seleccionJugador1 = new Seleccion(jugador1);
        seleccionJugador1.agregarRespuesta(respuesta1Jugador1);
        seleccionJugador1.agregarRespuesta(respuesta2Jugador1);

        Seleccion seleccionJugador2 = new Seleccion(jugador2);
        seleccionJugador2.agregarRespuesta(respuesta1Jugador2);
        seleccionJugador2.agregarRespuesta(respuesta2Jugador2);
        seleccionJugador2.agregarRespuesta(respuesta3Jugador2);

        List<Seleccion> listaRespuestas = new ArrayList<Seleccion>();
        listaRespuestas.add(seleccionJugador1);
        listaRespuestas.add(seleccionJugador2);

        PreguntaMultipleChoiceParcial pregunta = new PreguntaMultipleChoiceParcial("x^2 = 1 ", listaRespuestasCorrectas);
        pregunta.calificarRespuestas(listaRespuestas);

        assertEquals(0, jugador2.obtenerPuntaje());
        assertEquals(0, jugador1.obtenerPuntaje());
    }
}
