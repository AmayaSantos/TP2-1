package edu.fiuba.algo3.modelo.Entrega0;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

public class PreguntaMultipleChoiseTest {

    @Test
    public void SeCreaMultipleChoiseNormalDandoleRespuestasCorrectas(){

        PreguntaMultipleChoiseNormal multipleChoise = new PreguntaMultipleChoise(opcionesCorrectas);

        Respuesta respuesta = new RespuestaCorrecta();
        assertEquals(respuesta , respuesta);/*/
    }
}
