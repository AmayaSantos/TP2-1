package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class PreguntaMultipleChoiceConPenalidad {

    String enunciado;
    List<Respuesta> respuestasCorrectas = new ArrayList<Respuesta>();
    List<Respuesta> respuestas = new ArrayList<Respuesta>();

    public PreguntaMultipleChoiceParcial(String enunciado, List<Respuesta> respuestasCorrectas) {
        this.enunciado = enunciado;
        this.respuestasCorrectas = respuestasCorrectas;
    }
    public void calificarRespuestas(List<Seleccion> listaDeRespuesta){

        for (Seleccion seleccion: listaDeRespuesta){
            int racha = 1;
            int puntaje = 0;

            for(Respuesta respuesta: seleccion.devolverListaDeRespuestas()) {
                puntaje += respuesta.calificar();
                racha *= respuesta.calificar();
            }
            puntaje *= racha;
            seleccion.jugador.modificarPuntaje(puntaje);
        }
    }
}

