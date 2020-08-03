package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.puntaje.Puntaje;
import edu.fiuba.algo3.modelo.puntaje.Puntos;
import edu.fiuba.algo3.modelo.Opciones.Opciones;

import java.util.ArrayList;
import java.util.List;


public class Jugador {
    protected String nombre;
    protected Puntaje puntaje;
    protected List misRespuestas;

    public Jugador(String nombre) {
        this.misRespuestas= new ArrayList();
        this.nombre = nombre;
        this.puntaje= new Puntos();

    }

    public void agregarPuntaje(Puntaje puntaje){
        this.puntaje.aniadir(puntaje);
    }

    public Puntaje obtenerPuntaje(){
        return puntaje;
    }
    public List obtenerRespuestas(){
        return misRespuestas;
    }

    public void agregar(String opcion){
        misRespuestas.add(opcion);
    }

}

