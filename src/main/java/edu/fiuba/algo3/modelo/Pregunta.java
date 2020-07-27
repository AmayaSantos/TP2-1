package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Pregunta {
    String enunciado;
    ArrayList<Respuesta> calificaciones;
    TipoDePregunta tipoDePregunta;

    public Pregunta(String enunciado, Opcion opcion){
       calificaciones = new ArrayList<Respuesta>();
       tipoDePregunta = new PreguntaVoF(opcion);
       this.enunciado = enunciado;
    }

    public void calificar(ArrayList<Seleccion> seleccines){
        for (Seleccion sel:seleccines
             ) {
            Respuesta respuesta;
            respuesta = sel.esCalificadaPor(tipoDePregunta);
            calificaciones.add(respuesta);
        }

        asignarPuntajes(seleccines);
    }

    public void asignarPuntajes(ArrayList<Seleccion> seleccines){
        int iterador = 0;
        for (Seleccion sel:seleccines
        ) {
            sel.asignarPuntaje(calificaciones.get(iterador).puntaje());
            iterador++;
        }
    }



}
