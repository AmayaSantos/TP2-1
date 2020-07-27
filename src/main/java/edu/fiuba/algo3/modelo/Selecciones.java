package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Seleccion;

import java.util.ArrayList;

public class Selecciones {
    ArrayList<Seleccion> listaDeSelecciones;

    public Selecciones(){
        listaDeSelecciones = new ArrayList<Seleccion>();
    }

    public void agregar(Seleccion seleccion){
        listaDeSelecciones.add(seleccion);
    }
    
    public void calificarConPregunta(PreguntaVoF pregunta){
        for (Seleccion sel: listaDeSelecciones
             ) {/*
            sel.calificarPregunta(pregunta);*/
        }
    }
}
