package edu.fiuba.algo3.modelo.TestModeloFer;

import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.ModificadorDePuntaje.ModificadorParcial;
import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.Pregunta.Pregunta;
import edu.fiuba.algo3.modelo.Pregunta.PreguntaVoF;
import edu.fiuba.algo3.modelo.Respuestas.Respuestas;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoFTest {

    @Test
    public void test01CreoPreguntaVerdaderoFalso(){

        Opciones opciones = new Opciones();

        opciones.agregarOpcion("si");

        Pregunta pregunta = new PreguntaVoF("hola", opciones, new ModificadorParcial());

        Jugador jugador1 = new Jugador("ferburs");
        Jugador jugador2 = new Jugador("Faaa");

        Respuestas respuestaj1  = new Respuestas(jugador1);
        Respuestas respuestaj2  = new Respuestas(jugador2);

        respuestaj1.agregarRespuesta("si");
        respuestaj2.agregarRespuesta("no");

        List respuestas = new ArrayList();
        respuestas.add(respuestaj1);
        respuestas.add(respuestaj2);

        pregunta.calificar(opciones,respuestas);

        assertEquals(1, jugador1.obtenerPuntaje().valor() );



    }
}
