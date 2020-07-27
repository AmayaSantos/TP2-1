package edu.fiuba.algo3.modelo.Entrega0;

import edu.fiuba.algo3.modelo.OpcionVerdadero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OpcionTest {
    @Test
    public void preguntaVoFSeCreaIndicandoRespuestaCorrectaEsVerdadero(){
        OpcionVerdadero op = new OpcionVerdadero();
        assertEquals(op , new OpcionVerdadero());
    }
}
