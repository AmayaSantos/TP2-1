package edu.fiuba.algo3.modelo.Pregunta;

import edu.fiuba.algo3.modelo.Calificador.Calificador;
import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.Opciones.Opcion;
import edu.fiuba.algo3.modelo.Opciones.OpcionCorrecta;
import edu.fiuba.algo3.modelo.Opciones.OpcionIncorrecta;
import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.Puntuador.Puntuador;
import edu.fiuba.algo3.modelo.puntaje.Puntaje;

public class Pregunta {
    protected String enunciado;
    protected Opciones opciones;
    private final Puntuador puntuador;

    public Pregunta(Calificador calificador, String enunciado){
        this.enunciado=enunciado;
        this.opciones= new Opciones();
        this.puntuador=new Puntuador(calificador);
    }
    public void agregar(OpcionCorrecta opcion){
        opciones.agregar(opcion);
    }
    public void agregar(OpcionIncorrecta opcion){
        opciones.agregar(opcion);
    }
    public Opciones obtenerOpciones(){return opciones;}
    public void puntuar(Jugador jugador1,Jugador jugador2){
        puntuador.puntuar(jugador1,jugador2,opciones);
    }
}
