package edu.fiuba.algo3.modelo;

public abstract class Respuesta {
    String nombre;



    public String nombre(){
        return nombre;
    }

    public abstract int calificar();

    public boolean igual(Respuesta respuesta) {
        return nombre.equals(respuesta.nombre);
    }

    public abstract boolean esCorrecta();
}
