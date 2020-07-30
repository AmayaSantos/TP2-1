package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.puntaje.Puntaje;
import edu.fiuba.algo3.modelo.puntaje.Puntos;
import edu.fiuba.algo3.modelo.Opciones.Opciones;


public class Jugador {
    protected String nombre;
    protected Puntaje puntaje  ;
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

    public void agregar(String opcion){
        misRespuestas.agregarOpcion(opcion);
    }

}

