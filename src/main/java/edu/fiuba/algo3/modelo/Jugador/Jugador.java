package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Multiplicador.Multiplicador;
import edu.fiuba.algo3.modelo.Opciones.OpcionCorrecta;
import edu.fiuba.algo3.modelo.Opciones.OpcionIncorrecta;
import edu.fiuba.algo3.modelo.puntaje.Puntaje;
import edu.fiuba.algo3.modelo.puntaje.Puntos;
import edu.fiuba.algo3.modelo.Opciones.Opciones;


public class Jugador {
    protected String nombre;
    protected Puntos puntaje  ;
    protected Opciones misRespuestas;
    private Multiplicador multiplicador;


    public Jugador(String nombre) {
        this.misRespuestas= new Opciones();
        this.nombre = nombre;
        this.puntaje= new Puntos();

        multiplicador=new Multiplicador();

    }
    public void activarMultiplicadorX2(){
        multiplicador.activarMultiplicadorX2();
    }
    public void activarMultiplicadorX3(){
        multiplicador.activarMultiplicadorX3();
    }
    public void agregarPuntaje(Puntaje puntaje){
        this.puntaje.aniadir(multiplicador.aplicar(puntaje));
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

