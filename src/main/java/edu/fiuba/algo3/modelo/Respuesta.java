package edu.fiuba.algo3.modelo;

public class Respuesta {
    String nombre;



    public String nombre(){
        return nombre;
    }

    public int calificar(){
        return 0;
    }

    public boolean igual(Respuesta respuesta) {
        return nombre.equals(respuesta.nombre);
    }
}
