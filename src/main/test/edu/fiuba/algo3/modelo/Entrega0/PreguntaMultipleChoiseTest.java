package edu.fiuba.algo3.modelo.Entrega0;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class PreguntaMultipleChoiseTest {

    @Test
    public void SeCreaMultipleChoiseNormalDandoleRespuestasCorrectas(){

        Opcion op1, op2, op3, op4;
        op1 = new Opcion(1);
        op2 = new Opcion(2);
        op3 = new Opcion(3);
        op4 = new Opcion(4);
        ArrayList<Opcion> opcionesCorrectas = new ArrayList<Opcion>();
        ArrayList<Opcion> opcionesInorrectas = new ArrayList<Opcion>();
        PreguntaMultipleChoiseNormal multipleChoise =
                new PreguntaMultipleChoise(opcionesCorrectas, opcionesIncorrectas);

        Respuesta respuesta = new RespuestaCorrecta();
        assertEquals(respuesta , respuesta);/*/
    }
}
