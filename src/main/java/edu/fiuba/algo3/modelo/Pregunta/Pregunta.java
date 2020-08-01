package edu.fiuba.algo3.modelo.Pregunta;

import edu.fiuba.algo3.modelo.Calificador.Calificador;
import edu.fiuba.algo3.modelo.Opciones.Opcion;
import edu.fiuba.algo3.modelo.Opciones.OpcionCorrecta;
import edu.fiuba.algo3.modelo.Opciones.OpcionIncorrecta;
import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.puntaje.Puntaje;

public class Pregunta {
    protected String enunciado;
    protected Opciones opciones;
    private final Calificador calificador;

    public Pregunta(Calificador calificador, String enunciado){
        this.enunciado=enunciado;
        this.calificador = calificador;
        this.opciones= new Opciones();
    }
    public void agregar(OpcionCorrecta opcion){
        opciones.agregar(opcion);
    }
    public void agregar(OpcionIncorrecta opcion){
        opciones.agregar(opcion);
    }
    public Puntaje calificar(Opciones opcionesACalificar){
       return calificador.calificar(opciones,opcionesACalificar);
    }

}
