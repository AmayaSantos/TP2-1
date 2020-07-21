package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PreguntaVoFTest {
    @Test
    public void preguntaVoFPuedeCrearsePasandoRespuestaCorrecta() {
        Respuesta respuestaCorrecta = new RespuestaCorrecta("Verdadero");
        Respuesta respuestaIncorrecta = new RespuestaIncorrecta("Falso");
        PreguntaVoF pregunta = new PreguntaVoF("1 + 1 = 2 ", respuestaCorrecta, respuestaIncorrecta);

        assertEquals(pregunta.esCorrecta(respuestaCorrecta),true);
    }

    /*@Test
    public void preguntaVoFRecibeRespuestasAsignaCorrectamentePuntajes(){
        Respuesta respuestaCorrecta = new RespuestaCorrecta("Verdadero");
        Respuesta respuestaIncorrecta = new RespuestaIncorrecta("Falso");
        PreguntaVoF pregunta = new PreguntaVoF("1 + 1 = 2 ", respuestaCorrecta, respuestaIncorrecta);

    }*/
}
