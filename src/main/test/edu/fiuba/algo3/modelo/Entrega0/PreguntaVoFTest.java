package edu.fiuba.algo3.modelo.Entrega0;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PreguntaVoFTest {

    @Test
    public void preguntaVoFSeCreaIndicandoRespuestaCorrectaEsVerdadero(){
        Opcion verdadero = new OpcionVerdadero();
        PreguntaVoF pregunta = new PreguntaVoF(verdadero);
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();
        respuestas.add(verdadero);
        RespuestaCorrecta respuestaEsperada = new RespuestaCorrecta();
        Respuesta respuesta = pregunta.calificar(respuestas);
        assertEquals(1, respuesta.puntaje());
    }

    @Test
    public void preguntaVoFSeCreaIndicandoRespuestaCorrectaEsVerdaderoSeEligeFalsoYDaCeroPuntos(){
        Opcion verdadero = new OpcionVerdadero();
        Opcion falso = new OpcionFalso();
        PreguntaVoF pregunta = new PreguntaVoF(verdadero);
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();
        respuestas.add(falso);
        RespuestaIncorrecta respuestaEsperada = new RespuestaIncorrecta();
        Respuesta respuesta = pregunta.calificar(respuestas);
        assertEquals(respuestaEsperada.puntaje(), respuesta.puntaje());
    }

    @Test
    public void preguntaVoFSeCreaIndicandoRespuestaCorrectaEsFalsaSeEligeFalsoYDaUnPunto(){
        Opcion falso = new OpcionFalso();
        PreguntaVoF pregunta = new PreguntaVoF(falso);
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();
        respuestas.add(falso);
        RespuestaCorrecta respuestaEsperada = new RespuestaCorrecta();
        Respuesta respuesta = pregunta.calificar(respuestas);
        assertEquals(respuestaEsperada.puntaje(), respuesta.puntaje());
    }

    @Test
    public void preguntaVoFSeCreaIndicandoRespuestaCorrectaEsFalsoSeEligeVerdaderoYDaCeroPuntos(){
        Opcion verdadero = new OpcionVerdadero();
        Opcion falso = new OpcionFalso();
        PreguntaVoF pregunta = new PreguntaVoF(falso);
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();
        respuestas.add(verdadero);
        RespuestaIncorrecta respuestaEsperada = new RespuestaIncorrecta();
        Respuesta respuesta = pregunta.calificar(respuestas);
        assertEquals(respuestaEsperada.puntaje(), respuesta.puntaje());
    }

    @Test
    public void PreguntaVoFAsigna1PuntoAJugadorQueRespondeCorrectamenteYCeroAlQueFalla(){
        Jugador jugador1 = new Jugador("");
        Jugador jugador2 = new Jugador("");
        OpcionVerdadero verdadero = new OpcionVerdadero();
        OpcionFalso falso = new OpcionFalso();
        Seleccion seleccion1 = new Seleccion(jugador1, verdadero);
        Seleccion seleccion2 = new Seleccion(jugador2, falso);
        ArrayList<Seleccion> selecciones = new ArrayList<Seleccion>();
        selecciones.add(seleccion1);
        selecciones.add(seleccion2);
        Pregunta preguntaVoF = new Pregunta("enunciado", verdadero);
        preguntaVoF.calificar(selecciones);
        assertEquals(jugador1.obtenerPuntaje(), 1);
        assertEquals(jugador2.obtenerPuntaje(), 0);
    }

}
