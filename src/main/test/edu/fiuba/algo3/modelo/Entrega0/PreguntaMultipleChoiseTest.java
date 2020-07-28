package edu.fiuba.algo3.modelo.Entrega0;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PreguntaMultipleChoiseTest {

    @Test
    public void SeCreaMultipleChoiseNormalDandoleRespuestasCorrectas(){

        Opcion op1, op2, op3, op4;
        op1 = new Opcion(1);
        op2 = new Opcion(2);
        op3 = new Opcion(3);
        op4 = new Opcion(4);

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<Opcion>();
        opcionesCorrectas.add(op1);
        opcionesCorrectas.add(op2);
        ArrayList<Opcion> opcionesIncorrectas = new ArrayList<Opcion>();
        opcionesIncorrectas.add(op3);
        opcionesIncorrectas.add(op4);
        MultipleChoise multipleChoise =
                new MultipleChoise(opcionesCorrectas,opcionesIncorrectas);
        Respuesta esperada = new RespuestaCorrecta();
        Respuesta respuesta = multipleChoise.calificar(opcionesCorrectas);
        assertEquals(esperada.getClass() , respuesta.getClass());
    }

    @Test
    public void TresOpcionesCorrectasSeCalificanCorrectas(){

        Opcion op1, op2, op3, op4, op5;
        op1 = new Opcion(1);
        op2 = new Opcion(2);
        op3 = new Opcion(3);
        op4 = new Opcion(4);
        op5 = new Opcion(5);

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<Opcion>();
        opcionesCorrectas.add(op1);
        opcionesCorrectas.add(op2);
        ArrayList<Opcion> opcionesIncorrectas = new ArrayList<Opcion>();
        opcionesIncorrectas.add(op3);
        opcionesIncorrectas.add(op4);
        opcionesCorrectas.add(op5);
        MultipleChoise multipleChoise =
                new MultipleChoise(opcionesCorrectas,opcionesIncorrectas);
        Respuesta esperada = new RespuestaCorrecta();
        Respuesta respuesta = multipleChoise.calificar(opcionesCorrectas);
        assertEquals(esperada.getClass() , respuesta.getClass());
    }

    @Test
    public void TresOpcionesCorrectasDesordenadasSeCalificanCorrectas(){

        Opcion op1, op2, op3, op4, op5;
        op1 = new Opcion(1);
        op2 = new Opcion(2);
        op3 = new Opcion(3);
        op4 = new Opcion(4);
        op5 = new Opcion(5);

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<Opcion>();
        opcionesCorrectas.add(op1);
        opcionesCorrectas.add(op2);
        ArrayList<Opcion> opcionesIncorrectas = new ArrayList<Opcion>();
        opcionesIncorrectas.add(op3);
        opcionesIncorrectas.add(op4);
        opcionesCorrectas.add(op5);
        MultipleChoise multipleChoise =
                new MultipleChoise(opcionesCorrectas,opcionesIncorrectas);
        Respuesta esperada = new RespuestaCorrecta();
        opcionesCorrectas = new ArrayList<Opcion>();
        opcionesCorrectas.add(op5);
        opcionesCorrectas.add(op1);
        opcionesCorrectas.add(op2);
        Respuesta respuesta = multipleChoise.calificar(opcionesCorrectas);
        assertEquals(esperada.getClass() , respuesta.getClass());
    }

    @Test
    public void SeCalifica2RespCorrectasPeroUnaIncorrectaSeEsperaRespuestaIncorrecta(){

        Opcion op1, op2, op3, op4;
        op1 = new Opcion(1);
        op2 = new Opcion(2);
        op3 = new Opcion(3);
        op4 = new Opcion(4);

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<Opcion>();
        opcionesCorrectas.add(op1);
        opcionesCorrectas.add(op2);
        ArrayList<Opcion> opcionesIncorrectas = new ArrayList<Opcion>();
        opcionesIncorrectas.add(op3);
        opcionesIncorrectas.add(op4);
        MultipleChoise multipleChoise =
                new MultipleChoise(opcionesCorrectas,opcionesIncorrectas);
        Respuesta esperada = new RespuestaIncorrecta();
        opcionesCorrectas.add(op3);
        Respuesta respuesta = multipleChoise.calificar(opcionesCorrectas);
        assertEquals(esperada.getClass() , respuesta.getClass());
    }

    @Test
    public void DosOpcCorrectasPeroSoloSeEnviaUnaRespuestaCorrecta(){

        Opcion op1, op2, op3, op4;
        op1 = new Opcion(1);
        op2 = new Opcion(2);
        op3 = new Opcion(3);
        op4 = new Opcion(4);

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<Opcion>();
        opcionesCorrectas.add(op1);
        opcionesCorrectas.add(op2);
        ArrayList<Opcion> opcionesIncorrectas = new ArrayList<Opcion>();
        opcionesIncorrectas.add(op3);
        opcionesIncorrectas.add(op4);
        MultipleChoise multipleChoise =
                new MultipleChoise(opcionesCorrectas,opcionesIncorrectas);
        Respuesta esperada = new RespuestaIncorrecta();
        opcionesCorrectas.remove(op2);
        Respuesta respuesta = multipleChoise.calificar(opcionesCorrectas);
        assertEquals(esperada.getClass() , respuesta.getClass());
    }


}
