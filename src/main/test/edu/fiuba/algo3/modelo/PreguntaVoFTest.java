package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PreguntaVoFTest {
    @Test
    public void seleccionaPreguntaAYDevuelveUnPuntoPorqueEsLaCorrecta() {
        Respuesta respuestaCorrecta = new RespuestaCorrecta("Verdadero");
        Respuesta respuestaIncorrecta = new RespuestaIncorrecta("Falso");
        List<Respuesta> opciones = new List<Respuesta>();
        opciones.add(respuestaCorrecta);
        opciones.add(respuestaIncorrecta);
        Pregunta pregunta = new PreguntaVoF("La respuesta es Verdadero",opciones);
        Seleccion seleccionJ1 = new Seleccion();
        Seleccion seleccionJ2 = new Seleccion();
        seleccionJ1.agregarRespuesta(respuestaCorrecta);
        seleccionJ2.agregarRespuesta(respuestaIncorrecta);

    }
}
