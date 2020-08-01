package edu.fiuba.algo3.modelo.PreguntaTest;

import edu.fiuba.algo3.modelo.Calificador.Calificador;
import edu.fiuba.algo3.modelo.Calificador.CalificadorClasico;
import edu.fiuba.algo3.modelo.Calificador.CalificadorGroup;
import edu.fiuba.algo3.modelo.Calificador.CalificadorOrder;
import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.Opciones.OpcionCorrecta;
import edu.fiuba.algo3.modelo.Opciones.OpcionIncorrecta;
import edu.fiuba.algo3.modelo.Pregunta.Pregunta;
import edu.fiuba.algo3.modelo.Ronda.Ronda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PreguntaChoiceOrderTest {
    OpcionCorrecta op1 = new OpcionCorrecta("1");
    OpcionCorrecta op2 = new OpcionCorrecta("2");
    OpcionCorrecta op3 = new OpcionCorrecta("3");
    OpcionCorrecta op4 = new OpcionCorrecta("4");
    Calificador tipoClasico = new CalificadorOrder();

    @Test

    public void test01preguntaChioceOrderReciberespuestasDeJugadoresEIncrementaEnUnoAlQueRespondioCorrectamente() {

        Pregunta pregunta = new Pregunta(tipoClasico, "enunciado");
        pregunta.agregar(op1);
        pregunta.agregar(op2);
        pregunta.agregar(op3);
        pregunta.agregar(op4);
        Jugador jugador1 = new Jugador("carlos");
        Jugador jugador2 = new Jugador("juan");

        jugador1.agregar(op1);
        jugador1.agregar(op2);
        jugador1.agregar(op3);
        jugador1.agregar(op4);
        jugador2.agregar(op1);
        jugador2.agregar(op2);
        jugador2.agregar(op4);
        jugador2.agregar(op3);
        Ronda ronda = new Ronda();
        ronda.calificar(jugador2, pregunta);
        ronda.calificar(jugador1, pregunta);

        assertEquals(1, jugador1.obtenerPuntaje().valor());
        assertEquals(0, jugador2.obtenerPuntaje().valor());
    }
}
