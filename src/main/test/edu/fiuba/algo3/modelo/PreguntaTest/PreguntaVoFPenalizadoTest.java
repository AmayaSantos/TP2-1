package edu.fiuba.algo3.modelo.PreguntaTest;
import edu.fiuba.algo3.modelo.Calificador.Calificador;
import edu.fiuba.algo3.modelo.Calificador.CalificadorPenalizado;
import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.Opciones.OpcionCorrecta;
import edu.fiuba.algo3.modelo.Opciones.OpcionIncorrecta;
import edu.fiuba.algo3.modelo.Pregunta.Pregunta;
import edu.fiuba.algo3.modelo.Ronda.Ronda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PreguntaVoFPenalizadoTest {
    OpcionCorrecta op1= new OpcionCorrecta("true");
    OpcionIncorrecta op2= new OpcionIncorrecta("false");
    Calificador tipoClasico=new CalificadorPenalizado();
    @Test
    public void test01preguntaVoFPenelizadoSeCreaConSuCalificador(){

        Pregunta pregunta = new Pregunta(tipoClasico,"enunciado");
        pregunta.agregar(op1);
        pregunta.agregar(op2);
        assertTrue(pregunta.obtenerOpciones().elementos().contains(op1));
        assertTrue(pregunta.obtenerOpciones().elementos().contains(op2));
    }

    @Test
    public void test02preguntaVoFPenelizadoReciberespuestasDeJugadoresEIncrementaEnUnoAlQueRespondioCorrectamente(){

        Pregunta pregunta = new Pregunta(tipoClasico,"enunciado");
        pregunta.agregar(op1);
        pregunta.agregar(op2);
        Jugador jugador1 = new Jugador("carlos");
        Jugador jugador2 = new Jugador("juan");

        jugador1.agregar(op1);
        jugador2.agregar(op2);
        Ronda ronda= new Ronda();
        ronda.calificar(jugador2,pregunta);
        ronda.calificar(jugador1,pregunta);

        assertEquals(1, jugador1.obtenerPuntaje().valor() );
        assertEquals(-1, jugador2.obtenerPuntaje().valor() );
    }

    @Test
    public void test03preguntaVoFPenelizadoReciberespuestasDeJugadoresEIncrementaEnUnoAlQueRespondioCorrectamente(){

        Pregunta pregunta = new Pregunta(tipoClasico,"enunciado");
        pregunta.agregar(op1);
        pregunta.agregar(op2);
        Jugador jugador1 = new Jugador("carlos");
        Jugador jugador2 = new Jugador("juan");

        jugador1.agregar(op2);
        jugador2.agregar(op1);
        Ronda ronda= new Ronda();
        ronda.calificar(jugador2,pregunta);
        ronda.calificar(jugador1,pregunta);

        assertEquals(-1, jugador1.obtenerPuntaje().valor() );
        assertEquals(1, jugador2.obtenerPuntaje().valor() );
    }


}