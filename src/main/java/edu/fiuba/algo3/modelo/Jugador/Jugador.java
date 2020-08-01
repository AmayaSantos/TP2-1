package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Opciones.Opcion;
import edu.fiuba.algo3.modelo.Opciones.OpcionCorrecta;
import edu.fiuba.algo3.modelo.Opciones.OpcionIncorrecta;
import edu.fiuba.algo3.modelo.puntaje.Puntaje;
import edu.fiuba.algo3.modelo.puntaje.Puntos;
import edu.fiuba.algo3.modelo.Opciones.Opciones;


public class Jugador {
    protected String nombre;
    protected Puntos puntaje  ;
    protected Opciones misRespuestas;

    public Jugador(String nombre) {
        this.misRespuestas= new Opciones();
        this.nombre = nombre;
        this.puntaje= new Puntos();

    }

    public void agregarPuntaje(Puntaje puntaje){
        this.puntaje.aniadir(puntaje);
    }

    public Puntaje obtenerPuntaje(){
        return puntaje;
    }
    public Opciones obtenerRespuestas(){
        return misRespuestas;
    }

    public void agregar(OpcionCorrecta opcion){
        misRespuestas.agregar(opcion);
    }
    public void agregar(OpcionIncorrecta opcion){
        misRespuestas.agregar(opcion);
    }

}

