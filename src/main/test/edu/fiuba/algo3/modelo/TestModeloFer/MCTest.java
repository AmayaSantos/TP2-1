package edu.fiuba.algo3.modelo.TestModeloFer;

import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.ModificadorDePuntaje.ModificadorParcial;
import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.Pregunta.Pregunta;
import edu.fiuba.algo3.modelo.Pregunta.PreguntaVoF;
import edu.fiuba.algo3.modelo.Respuestas.Respuestas;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class MCTest {

    @Test
    public void test01CreoPreguntaMultipleChoice() {
        Opciones opciones = new Opciones();
        opciones.agregarOpcion("si");
        opciones.agregarOpcion("si en verde");
        opciones.agregarOpcion("claro que si brocoli");

        Pregunta pregunta = new PreguntaVoF("hoy se sale", opciones, new ModificadorParcial());

        Jugador jugador1 = new Jugador("ferburs");
        Jugador jugador2 = new Jugador("Faaa");

        Respuestas respuestaj1 = new Respuestas(jugador1);
        Respuestas respuestaj2 = new Respuestas(jugador2);

        respuestaj1.agregarRespuesta("si");
        respuestaj1.agregarRespuesta("si en verde");
        respuestaj1.agregarRespuesta("claro que si brocoli");
        respuestaj2.agregarRespuesta("no");

        List respuestas = new ArrayList();
        respuestas.add(respuestaj1);
        respuestas.add(respuestaj2);

        pregunta.calificar(opciones, respuestas);

        assertEquals(1, jugador1.obtenerPuntaje().valor());
    }
}
