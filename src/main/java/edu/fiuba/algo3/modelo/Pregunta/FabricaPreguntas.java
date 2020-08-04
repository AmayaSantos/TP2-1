package edu.fiuba.algo3.modelo.Pregunta;

import edu.fiuba.algo3.modelo.Calificador.AsignadorClasico;
import edu.fiuba.algo3.modelo.Calificador.Calificador;
import edu.fiuba.algo3.modelo.Calificador.ComparadorConOrden;

public class FabricaPreguntas {

    public static Pregunta preguntaVoFVerdadera(String enunciado){
        Pregunta pregunta = new Pregunta(enunciado);
        pregunta.asignarOpcionCorrecta("V");
        pregunta.asignarOpcionPosible("F");
        Calificador calificador = new ComparadorConOrden(new AsignadorClasico());
        pregunta.asignarCalificador(calificador);
        return pregunta;
    }

    public static Pregunta preguntaVoFFalsa(String enunciado){
        Pregunta pregunta = new Pregunta(enunciado);
        pregunta.asignarOpcionCorrecta("F");
        pregunta.asignarOpcionPosible("V");
        Calificador calificador = new ComparadorConOrden(new AsignadorClasico());
        pregunta.asignarCalificador(calificador);
        return pregunta;
    }

}
