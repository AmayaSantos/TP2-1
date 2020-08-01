package edu.fiuba.algo3.modelo.PreguntaTest;

import edu.fiuba.algo3.modelo.Calificador.Calificador;
import edu.fiuba.algo3.modelo.Calificador.CalificadorClasico;
import edu.fiuba.algo3.modelo.Calificador.CalificadorPenalizado;
import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.Opciones.OpcionCorrecta;
import edu.fiuba.algo3.modelo.Opciones.OpcionIncorrecta;
import edu.fiuba.algo3.modelo.Pregunta.Pregunta;
import edu.fiuba.algo3.modelo.Ronda.Ronda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PreguntaChoicePenalizado {
    OpcionCorrecta op1= new OpcionCorrecta("1");
    OpcionCorrecta op3= new OpcionCorrecta("3");
    OpcionIncorrecta op2= new OpcionIncorrecta("2");
    OpcionIncorrecta op4= new OpcionIncorrecta("4");
    Calificador tipoClasico=new CalificadorPenalizado();
    @Test
    public void test01preguntaChoicePenalizadoSeCreaConSuCalificador(){

        Pregunta pregunta = new Pregunta(tipoClasico,"enunciado");
        pregunta.agregar(op1);
        pregunta.agregar(op2);
        pregunta.agregar(op3);
        pregunta.agregar(op4);
        assertTrue(pregunta.obtenerOpciones().elementos().contains(op1));
        assertTrue(pregunta.obtenerOpciones().elementos().contains(op2));
        assertTrue(pregunta.obtenerOpciones().elementos().contains(op3));
        assertTrue(pregunta.obtenerOpciones().elementos().contains(op4));
    }
    @Test
    public void test02preguntaChoicePenalizadoReciberespuestasDeJugadoresEIncrementaAlQueRespondioCorrectamente(){

        Pregunta pregunta = new Pregunta(tipoClasico,"enunciado");
        pregunta.agregar(op1);
        pregunta.agregar(op2);
        pregunta.agregar(op4);
        pregunta.agregar(op3);

        Jugador jugador1 = new Jugador("carlos");
        Jugador jugador2 = new Jugador("juan");

        jugador1.agregar(op1);
        jugador1.agregar(op3);

        jugador2.agregar(op2);
        jugador2.agregar(op1);
        jugador2.agregar(op3);
        Ronda ronda= new Ronda();
        ronda.calificar(jugador2,pregunta);
        ronda.calificar(jugador1,pregunta);

        assertEquals(2, jugador1.obtenerPuntaje().valor() );
        assertEquals(1, jugador2.obtenerPuntaje().valor() );
    }
    @Test
    public void test03preguntaChiocePenalizadoReciberespuestasDeJugadoresEIncrementaEnUnoAlQueRespondioCorrectamente(){

        Pregunta pregunta = new Pregunta(tipoClasico,"enunciado");
        pregunta.agregar(op1);
        pregunta.agregar(op2);
        pregunta.agregar(op3);
        pregunta.agregar(op4);

        Jugador jugador1 = new Jugador("carlos");
        Jugador jugador2 = new Jugador("juan");

        jugador1.agregar(op1);
        jugador2.agregar(op4);
        jugador2.agregar(op2);
        jugador2.agregar(op3);
        Ronda ronda= new Ronda();
        ronda.calificar(jugador2,pregunta);
        ronda.calificar(jugador1,pregunta);

        assertEquals(1, jugador1.obtenerPuntaje().valor() );
        assertEquals(-1, jugador2.obtenerPuntaje().valor() );
    }
    @Test
    public void test04preguntaChiocePenalizadoReciberespuestasDeJugadoresEIncrementaEnUnoAlQueRespondioCorrectamente(){

        Pregunta pregunta = new Pregunta(tipoClasico,"enunciado");
        pregunta.agregar(op1);
        pregunta.agregar(op2);
        pregunta.agregar(op3);
        pregunta.agregar(op4);
        Jugador jugador1 = new Jugador("carlos");
        Jugador jugador2 = new Jugador("juan");

        jugador1.agregar(op1);
        jugador1.agregar(op3);
        jugador2.agregar(op3);
        jugador2.agregar(op1);
        Ronda ronda= new Ronda();
        ronda.calificar(jugador2,pregunta);
        ronda.calificar(jugador1,pregunta);

        assertEquals(2, jugador1.obtenerPuntaje().valor() );
        assertEquals(2, jugador2.obtenerPuntaje().valor() );
    }
    @Test
    public void test05preguntaChiocePenalizadoReciberespuestasDeJugadoresEIncrementaEnUnoAlQueRespondioCorrectamente(){

        Pregunta pregunta = new Pregunta(tipoClasico,"enunciado");
        pregunta.agregar(op1);
        pregunta.agregar(op2);
        Jugador jugador1 = new Jugador("carlos");
        Jugador jugador2 = new Jugador("juan");

        jugador1.agregar(op2);
        jugador1.agregar(op4);
        jugador2.agregar(op4);
        jugador2.agregar(op2);
        Ronda ronda= new Ronda();
        ronda.calificar(jugador2,pregunta);
        ronda.calificar(jugador1,pregunta);

        assertEquals(-2, jugador1.obtenerPuntaje().valor() );
        assertEquals(-2, jugador2.obtenerPuntaje().valor() );
    }

}
