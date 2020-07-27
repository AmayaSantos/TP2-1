package edu.fiuba.algo3.modelo;
import java.util.HashMap;

public class Respuesta {
    String opcionElegida;
    Jugador jugador;

    public Respuesta(Jugador jugador, String opcionElegida) {
        this.jugador = jugador;
        this.opcionElegida = opcionElegida;
    }

    public void calificar(HashMap<String, Opcion> opciones){
        Opcion opcion = opciones.get(this.opcionElegida);
        jugador.modificarPuntaje(opcion.calificar());
    }
}

