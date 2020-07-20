package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PreguntaVoFTest {
    @Test
    public void seleccionaPreguntaAYDevuelveUnPuntoPorqueEsLaCorrecta() {

        RespuestaCorrecta respuestaCorrecta = new RespuestaCorrecta("Verdadero");
        RespuestaIncorrecta respuestaIncorrecta = new RespuestaIncorrecta("Falso");
        PreguntaVoF pregunta = new PreguntaVoF("Consigna verdadero y falso");
        pregunta.agregarRespuestaIncorrecta(respuestaIncorrecta);
        pregunta.agregarRespuestaCorrecta(respuestaCorrecta);

        assertEquals(pregunta.obtenerRespuestaCorrecta(),"Verdadero");
    }
}
