package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Seleccion {
    Jugador jugador;
    List<Respuesta> respuestas = new ArrayList<Respuesta>();

    public Seleccion(Jugador jugador) {
        this.jugador = jugador;
    }
    public void agregarRespuesta(Respuesta unaRespuesta){
        this.respuestas.add(unaRespuesta);
    }

    public List<Respuesta> devolverListaDeRespuestas(){
        return respuestas;
    }

    /*public void calificar(){
        jugador.modificarPuntaje(respuestas.calificar());
    }*/

}
