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



}
