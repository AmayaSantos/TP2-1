/*package edu.fiuba.algo3.modelo;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class PreguntaVoFClasicoTest {
    @Test
    public void test01preguntaVoFClasicoPuedeCrearsePasandoRespuestaCorrectaYSePuedeResponderCorrectamente() {
        PreguntaVoFClasico pregunta = new PreguntaVoFClasico("1 + 1 = 2 ");
        pregunta.asignarRespuestaCorrecta("Verdadero");

        assertTrue(pregunta.esCorrecta("Verdadero"));
    }

    @Test
    public void test02preguntaVoFClasicoPuedeCrearsePasandoRespuestaCorrectaYSePuedeResponderIncorrectamente() {
        PreguntaVoFClasico pregunta = new PreguntaVoFClasico("1 + 1 = 2 ");
        pregunta.asignarRespuestaCorrecta("Verdadero");

        assertFalse(pregunta.esCorrecta("Falso"));
    }

    @Test
    public void test03preguntaVoFClasicoReciberespuestasDeJugadoresEIncrementaEnUnoAlQueRespondioCorrectamente(){
        Jugador jugador1 = new Jugador("carlos");
        Jugador jugador2 = new Jugador("juan");

        PreguntaVoFClasico pregunta = new PreguntaVoFClasico("1 + 1 = 2 ");
        pregunta.asignarRespuestaCorrecta("Verdadero");

        Respuesta respuestaJugador1 = new Respuesta(jugador1, "Verdadero");
        Respuesta respuestaJugador2 = new Respuesta(jugador2, "Falso");

        List<Respuesta> respuestas = new ArrayList<Respuesta>();
        respuestas.add(respuestaJugador1);
        respuestas.add(respuestaJugador2);

        pregunta.calificar(respuestas);

        assertEquals(1, jugador1.obtenerPuntaje() );
    }

    @Test
    public void test04preguntaVoFClasicoReciberespuestasDeJugadoresEIncrementaEnCeroAlQueRespondioIncorrectamente(){
        Jugador jugador1 = new Jugador("carlos");
        Jugador jugador2 = new Jugador("juan");

        PreguntaVoFClasico pregunta = new PreguntaVoFClasico("1 + 1 = 2 ");
        pregunta.asignarRespuestaCorrecta("Verdadero");

        Respuesta respuestaJugador1 = new Respuesta(jugador1, "Verdadero");
        Respuesta respuestaJugador2 = new Respuesta(jugador2, "Falso");

        List<Respuesta> respuestas = new ArrayList<Respuesta>();
        respuestas.add(respuestaJugador1);
        respuestas.add(respuestaJugador2);

        pregunta.calificar(respuestas);

        assertEquals(0, jugador2.obtenerPuntaje() );
    }
}
*/