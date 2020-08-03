package edu.fiuba.algo3.modelo.Respuestas;

import edu.fiuba.algo3.modelo.Jugador.Jugador;

import java.util.ArrayList;
import java.util.List;

public class Respuestas {
    List<String> misRespuestas = new ArrayList<String>();
    Jugador jugador;

    public Respuestas(Jugador jugador){
        this.jugador = jugador;
    }


    public void agregarRespuesta(String opcionElegida){
        misRespuestas.add(opcionElegida);
    }

    public List<String> obtenerRespuestas(){
        return misRespuestas;
    }

    public Jugador obtenerJugador(){
        return jugador;
    }
}
