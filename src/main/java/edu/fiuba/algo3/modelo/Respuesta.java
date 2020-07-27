package edu.fiuba.algo3.modelo;

public abstract class Respuesta {
    protected String nombre;

    public String nombre(){
        return nombre;
    }

    public abstract int calificar();


}
