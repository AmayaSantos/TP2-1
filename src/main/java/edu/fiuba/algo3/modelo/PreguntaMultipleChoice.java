package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class PreguntaMultipleChoice {

    String enunciado;
    List<Respuesta> respuestasCorrectas = new ArrayList<Respuesta>();
    List<Respuesta> respuestas = new ArrayList<Respuesta>();

    public PreguntaMultipleChoice(String enunciado, List<Respuesta> respuestasCorrectas) {
        this.enunciado = enunciado;
        this.respuestasCorrectas = respuestasCorrectas;
    }

    public void calificarRespuestas(List<Seleccion> listaDeRespuesta){

        for (Seleccion seleccion: listaDeRespuesta){
            if( seleccion.devolverListaDeRespuestas().size() < respuestasCorrectas.size()){

                seleccion.jugador.modificarPuntaje(0);

            }else{

            int puntaje = 1;

            for(Respuesta respuesta: seleccion.devolverListaDeRespuestas()) {
                puntaje *= respuesta.calificar();
            }
            seleccion.jugador.modificarPuntaje(puntaje);
            }
        }
    }
}
