package edu.fiuba.algo3.modelo.PreguntaVoFTest;

import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.Pregunta.FabricaPreguntas;
import edu.fiuba.algo3.modelo.Pregunta.Pregunta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PreguntaVoFTest {

    @Test
    public void Test01PreguntaVoFConEnunciadoVerdaderoSeCrea(){

        Pregunta pregunta = FabricaPreguntas.preguntaVoFVerdadera("Enunciado");
        Opciones opcion = new Opciones();
        opcion.agregarOpcion("V");
        assertTrue(pregunta.esCorrecta(opcion));
    }

    @Test
    public void Test02PreguntaVoFConEnunciadoVerdaderoSeCreaYSeTesteaConUnFalso(){

        Pregunta pregunta = FabricaPreguntas.preguntaVoFVerdadera("Enunciado");
        Opciones opcion = new Opciones();
        opcion.agregarOpcion("F");
        assertFalse(pregunta.esCorrecta(opcion));
    }

    @Test
    public void Test03PreguntaVoFConEnunciadoFalsoSeCreaYVerificaConFalso(){

        Pregunta pregunta = FabricaPreguntas.preguntaVoFFalsa("Enunciado");
        Opciones opcion = new Opciones();
        opcion.agregarOpcion("F");
        assertTrue(pregunta.esCorrecta(opcion));
    }

    @Test
    public void Test04PreguntaVoFConEnunciadoFalsoSeCreaYSeTesteaConUnVerdadero(){

        Pregunta pregunta = FabricaPreguntas.preguntaVoFFalsa("Enunciado");
        Opciones opcion = new Opciones();
        opcion.agregarOpcion("V");
        assertFalse(pregunta.esCorrecta(opcion));
    }
}
