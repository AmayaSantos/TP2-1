package edu.fiuba.algo3.modelo.Pregunta;

import edu.fiuba.algo3.modelo.ModificadorDePuntaje.ModificadorPuntaje;
import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.Respuestas.Respuestas;

import java.util.List;

public abstract class Pregunta {

    Opciones respuestasCorretas;
    String enunciado;
    ModificadorPuntaje modificadorPuntaje;

    public Pregunta(String enunciado,Opciones respuestasCorrectas,ModificadorPuntaje modificadorPuntaje){
        this.respuestasCorretas = respuestasCorrectas;
        this.enunciado = enunciado;
        this.modificadorPuntaje = modificadorPuntaje;
    }

    public abstract void calificar(Opciones opcionesCorrectas, List<Respuestas> opcionesJugador);

}
