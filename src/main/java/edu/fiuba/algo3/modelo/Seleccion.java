package edu.fiuba.algo3.modelo;

public class Seleccion {
    Jugador jugador;
    OpcionVoF opcion;

    public Seleccion(Jugador jugador,OpcionVoF opcion) {
        this.jugador = jugador;
        this.opcion = opcion;
    }


    public void calificarPregunta(PreguntaVoF pregunta){
        Respuesta respuesta = pregunta.calificar(opcion);
        jugador.modificarPuntaje(respuesta.puntaje());
    }
}
