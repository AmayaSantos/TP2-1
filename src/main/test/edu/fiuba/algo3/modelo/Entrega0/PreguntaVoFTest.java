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
        OpcionVoF verdadero = new OpcionVerdadero();
        PreguntaVoF pregunta = new PreguntaVoF("Este es un enunciado", verdadero);
        Respuesta respuesta = pregunta.calificar(verdadero);
        assertEquals(1 , respuesta.puntaje());
    }

    @Test
    public void preguntaVoFSeCreaIndicandoRespuestaCorrectaEsVerdaderoSeEligeFalsoYDaCeroPuntos(){
        OpcionVoF verdadero = new OpcionVerdadero();
        OpcionVoF falso = new OpcionFalso();
        PreguntaVoF pregunta = new PreguntaVoF("Este es un enunciado", verdadero);
        Respuesta respuesta = pregunta.calificar(falso);
        assertEquals(0 , respuesta.puntaje());
    }

    @Test
    public void preguntaVoFSeCreaIndicandoRespuestaCorrectaEsFalsaSeEligeFalsoYDaCeroUnPunto(){
        OpcionVoF falso = new OpcionFalso();
        PreguntaVoF pregunta = new PreguntaVoF("Este es un enunciado", falso);
        Respuesta respuesta = pregunta.calificar(falso);
        assertEquals(1 , respuesta.puntaje());
    }
/*
    @Test void preguntaVoFConEnunciadoVerdaderoCalificaRespuestasDeJugadoresPrimerJugadorSuma1SegundoJugadorSuma0(){
        OpcionVoF verdadero = new OpcionVerdadero();
        OpcionVoF falso = new OpcionFalso();
        Selecciones selecciones = new Selecciones();
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        Seleccion seleccion(jugador1, verdadero);
        Seleccion seleccion2(jugador2, falso);
        seleccion.agregar(seleccion);
        seleccion.agregar(seleccion2);
        PreguntaVoF pregunta = new PreguntaVoF("Un Enunciado", new OpcionVerdadero());
        PreguntaVoF.calificar(selecciones);
        assertEquals(1 , Jugador.obtenerPuntaje());
        assertEquals(0 , Jugador.obtenerPuntaje());
    }

 */
}
