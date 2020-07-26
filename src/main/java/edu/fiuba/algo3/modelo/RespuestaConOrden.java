package edu.fiuba.algo3.modelo;

public class RespuestaConOrden extends  Respuesta{
    protected int posionVerdadera;
    int posicionPropuesta;
    public RespuestaConOrden(String nombre, int posicion){
        this.nombre =nombre;
        posionVerdadera= posicion;
    }
    private RespuestaConOrden(String nombre, int posicionVerdadera,int posicionPropuesta){
        this.nombre =nombre;
        posionVerdadera= posicionVerdadera;
        this.posicionPropuesta= posicionPropuesta;
    }



    @Override
    public int calificar() {
        if (posionVerdadera==posicionPropuesta){
            return 1;
        }else{
            return 0;
        }
    }

    public RespuestaConOrden proponer(int posicionPropuesta) {
        RespuestaConOrden respuestaPropuesta= new RespuestaConOrden(nombre,posionVerdadera,posicionPropuesta);
        return respuestaPropuesta;
    }
}
