package edu.fiuba.algo3.modelo;

public class RespuestaConOrden extends  Respuesta{
    private static int posionVerdadera;
    int posicionPropuesta;
    public RespuestaConOrden(String nombre, int posicion){
        this.nombre =nombre;
        posionVerdadera= posicion;
    }
    public RespuestaConOrden(RespuestaConOrden respuestaOriginal, int posicionPropuesta){

        this.nombre =nombre;
        posionVerdadera= RespuestaConOrden.obtenerPosicion();
       this.posicionPropuesta=posicionPropuesta;
    }

    public static int obtenerPosicion() {
        return posionVerdadera;
    }

    @Override
    public int calificar() {
        if (posionVerdadera==posicionPropuesta){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public boolean esCorrecta() {
        return false;
    }

}
