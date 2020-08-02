package edu.fiuba.algo3.modelo.PreguntaTest;
import edu.fiuba.algo3.modelo.Calificador.Calificador;
import edu.fiuba.algo3.modelo.Calificador.CalificadorClasico;
import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.Opciones.OpcionCorrecta;
import edu.fiuba.algo3.modelo.Opciones.OpcionIncorrecta;
import edu.fiuba.algo3.modelo.Pregunta.Pregunta;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PreguntaVoFClasicoTest {
    OpcionCorrecta op1= new OpcionCorrecta("true");
    OpcionIncorrecta op2= new OpcionIncorrecta("false");
    Calificador tipoClasico=new CalificadorClasico();
    @Test
    public void test01preguntaVoFClasicoSeCreaConSuCalificador(){

        Pregunta pregunta = new Pregunta(tipoClasico,"enunciado");
        pregunta.agregar(op1);
        pregunta.agregar(op2);
        assertTrue(pregunta.obtenerOpciones().elementos().contains(op1));
        assertTrue(pregunta.obtenerOpciones().elementos().contains(op2));
    }

    @Test
    public void test02preguntaVoFClasicoReciberespuestasDeJugadoresEIncrementaEnUnoAlQueRespondioCorrectamente(){

        Pregunta pregunta = new Pregunta(tipoClasico,"enunciado");
        pregunta.agregar(op1);
        pregunta.agregar(op2);
        Jugador jugador1 = new Jugador("carlos");
        Jugador jugador2 = new Jugador("juan");

        jugador1.agregar(op1);
        jugador2.agregar(op2);
        pregunta.puntuar(jugador1,jugador2);

        assertEquals(1, jugador1.obtenerPuntaje().valor() );
        assertEquals(0, jugador2.obtenerPuntaje().valor() );
    }

    @Test
    public void test03preguntaVoFClasicoReciberespuestasDeJugadoresEIncrementaEnUnoAlQueRespondioCorrectamente(){

        Pregunta pregunta = new Pregunta(tipoClasico,"enunciado");
        pregunta.agregar(op1);
        pregunta.agregar(op2);
        Jugador jugador1 = new Jugador("carlos");
        Jugador jugador2 = new Jugador("juan");

        jugador1.agregar(op2);
        jugador2.agregar(op1);

        pregunta.puntuar(jugador1,jugador2);

        assertEquals(0, jugador1.obtenerPuntaje().valor() );
        assertEquals(1, jugador2.obtenerPuntaje().valor() );
    }

}
